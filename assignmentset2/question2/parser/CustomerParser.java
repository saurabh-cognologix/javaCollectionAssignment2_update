package corejava.collection.assignmentset2.question2.parser;

import corejava.collection.assignmentset2.question2.mapper.CustomerMapper;
import corejava.collection.assignmentset2.question2.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerParser {
   public List<Customer> parseCSVFile(String filePath)   {
       List<Customer> inputCustomerList = new ArrayList<>();
       BufferedReader br = null;
       String st;
       try{
           File file = new File(filePath);
           br = new BufferedReader(new FileReader(file));
           while ((st = br.readLine())!=null){
               Customer customer = CustomerMapper.map(st);
               inputCustomerList.add(customer);
           }
       } catch (IOException e) {
           throw new RuntimeException(e);

       } finally {
           if(br!= null){
               try {
                   br.close();
               }catch (IOException ex){
                   throw new RuntimeException(ex);
                  // throw new IOException(ex);


               }
           }
       }
       return inputCustomerList;
   }
}
