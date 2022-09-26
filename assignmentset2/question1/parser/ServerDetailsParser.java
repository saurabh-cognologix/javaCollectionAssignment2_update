package corejava.collection.assignmentset2.question1.parser;

import corejava.collection.assignmentset2.question1.mapper.ServerMapper;
import corejava.collection.assignmentset2.question1.model.Server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServerDetailsParser {
     public List<Server> parseCSVFile(String filePath){
         List<Server> inputServerList = new ArrayList<>();
         BufferedReader br = null;
         String st;
         try{
             File  file = new File(filePath);
             br = new BufferedReader(new FileReader(file));
             while ((st = br.readLine())!=null){
                  Server server = ServerMapper.map(st);
                  inputServerList.add(server);
             }
         }catch (IOException ioException){
             throw new RuntimeException(ioException);
         }finally {
             if(br!= null){
                 try {
                     br.close();
                 }catch (IOException ex){
                     throw new RuntimeException(ex);
                     // throw new IOException(ex);


                 }
             }
         }
        // inputServerList.forEach(System.out::println);
         return inputServerList;
     }
}
