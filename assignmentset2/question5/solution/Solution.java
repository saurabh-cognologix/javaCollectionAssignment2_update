package corejava.collection.assignmentset2.question5.solution;

import corejava.collection.assignmentset2.question5.model.Employee;
import java.util.*;
public class Solution {
    public Map<String, Employee> tempMap = new HashMap<>();

    public  void splitEmployeeData(ArrayList<String> arrayList){
        for(String token : arrayList){
            String[] arr = token.split(",");

            // 0 index position --> ID
            // 1 index position --> Name
            // 2 index postion --> Department
            // 3 index position --> Salary
            if( tempMap.containsKey(arr[2].trim())){
                tempMap.get(arr[2].trim()).setEmployeeById(arr);
            }else{
                tempMap.put(arr[2].trim(),new Employee(Integer.parseInt(arr[0].trim()),Long.parseLong(arr[3].trim())));
            }

        }
    }
}
