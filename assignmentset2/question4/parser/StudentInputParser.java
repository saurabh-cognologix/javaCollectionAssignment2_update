package corejava.collection.assignmentset2.question4.parser;

import corejava.collection.assignmentset2.question4.mapper.StudentMapper;
import corejava.collection.assignmentset2.question4.model.Student;
import java.util.*;
public class StudentInputParser {
    public List<Student> parseArray(String[] inputData) {
        List<Student> list = new ArrayList<Student>();
        for(String data: inputData) {
            Student student = StudentMapper.map(data);
            list.add(student);
        }
        return list;
    }
    public List<Student> parseCSVFile(String filePath) {
        List<Student> list = new ArrayList<Student>();
        // TODO: write code to read file line by line and parse the line.
        return list;
    }

}
