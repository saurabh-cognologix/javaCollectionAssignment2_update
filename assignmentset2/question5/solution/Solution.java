package corejava.collection.assignmentset2.question5.solution;

import corejava.collection.assignmentset2.question5.model.Employee;
import java.util.*;
public class Solution {
    public Map<String, Employee> tempMap = new HashMap<>();
//    Employee employee = new Employee();
////
//    long salary = employee.getSalary();
//    String id = employee.getId();
//    public  void setEmployeeById(String str[]){
//        if(this.salary<Long.parseLong(str[3].trim())){
//            this.salary = Long.parseLong(str[3]);
//            this.id = str[0].trim();
//        }
//    }
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
                tempMap.put(arr[2].trim(),new Employee(Long.parseLong(arr[3].trim()),arr[0].trim()));
            }

        }
    }
}
