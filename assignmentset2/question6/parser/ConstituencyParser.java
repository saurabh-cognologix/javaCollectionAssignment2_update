package corejava.collection.assignmentset2.question6.parser;

import corejava.collection.assignmentset2.question6.mapper.ConstituencyMapper;
import corejava.collection.assignmentset2.question6.model.Constituency;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ConstituencyParser {
    public List<Constituency> parseCSVFile(String filePath){
        List<Constituency> list = new ArrayList<>();
        BufferedReader br = null;
        String st;
        try{
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine())!=null){
                Constituency constituency = ConstituencyMapper.map(st);
                list.add(constituency);
            }
            //System.out.println(list);
        } catch (IOException ioException){
            throw new RuntimeException(ioException);
        }
        return list;
    }
}
