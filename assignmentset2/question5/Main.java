package corejava.collection.assignmentset2.question5;
import corejava.collection.assignmentset2.question5.solution.Solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<String> inputData = new ArrayList<>();
       try {
           File file = new File("JavaTraining/src/corejava/collection/assignmentset2/question5/input/input.txt");
           BufferedReader br = new BufferedReader(new FileReader(file));
           String st;
           while ((st = br.readLine()) != null){
               // Print the string
               //System.out.println(st);
               inputData.add(st);
           }
       }catch (IOException e){
           System.out.println("File not found");
       }
        Solution solution = new Solution();
        solution.splitEmployeeData((ArrayList<String>) inputData);
        System.out.println(solution.tempMap.get("Engineering").getId());
        System.out.println(solution.tempMap.get("Testing").getId());
    }
}
