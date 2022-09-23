package corejava.collection.assignmentset2.question5.parser;

import corejava.collection.assignmentset2.question5.mapper.EmployeeMapper;
import corejava.collection.assignmentset2.question5.model.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeParser {
    public List<Employee> parseTextFile(String filePath){
        List<Employee> employeeList = new ArrayList<>();
        BufferedReader br = null;
        String st;
        try{
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine())!=null){
                Employee employee = EmployeeMapper.map(st);
                employeeList.add(employee);
            }

        }catch (IOException ioException){
            throw new RuntimeException(ioException);
        }
        return employeeList;
    }
}
