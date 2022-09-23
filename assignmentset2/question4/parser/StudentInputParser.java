package corejava.collection.assignmentset2.question4.parser;

import corejava.collection.assignmentset2.question4.mapper.StudentMapper;
import corejava.collection.assignmentset2.question4.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentInputParser {
 /*   public List<Student> parseArray(String[] inputData) {
        List<Student> list = new ArrayList<Student>();
        for(String data: inputData) {
            Student student = StudentMapper.map(data);
            list.add(student);
        }
        return list;
    }*/
    public List<Student> parseCSVFile(String filePath) {
        List<Student> list = new ArrayList<>();
        BufferedReader br = null;
        String st;
        try {
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine())!=null){
                Student student = StudentMapper.map(st);
                list.add(student);
            }
           // System.out.println(list);
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            if(br!=null){
                 try {
                     br.close();
                 }catch (Exception e){
                     throw new RuntimeException(e);
                 }
            }
        }

        return list;
    }

}
