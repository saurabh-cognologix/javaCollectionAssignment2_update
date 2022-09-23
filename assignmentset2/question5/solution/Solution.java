package corejava.collection.assignmentset2.question5.solution;

import corejava.collection.assignmentset2.question5.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution{
    public Map<String,Long> storedMaxDepartmentOfSalary(List<Employee> employeeList){
        Map<String,Long> tempMap = new HashMap<>();
        Long highestSalary = Long.valueOf(0);
        for(Employee employee :employeeList){
            Integer employeeId = employee.getEmployeeId();
            String employeeName = employee.getEmployeeName();
            String departmentName = employee.getDepartmentName();
            Long salary = employee.getEmployeeSalary();
            if(tempMap.containsKey(departmentName) && tempMap.get(departmentName)<salary){
                highestSalary = salary;
                tempMap.put(departmentName,highestSalary);
            }else if(!tempMap.containsKey(departmentName)) {
                tempMap.put(departmentName,salary);
            }
        }
        //tempMap.forEach((k,v)-> System.out.println(k+"  "+v));
        return tempMap;
    }

    public Map<String,Integer> getCandidateIdWithLowestId(List<Employee> list, Map<String,Long> tempMap){
        Map<String,Integer> finalMap = new HashMap<>();
        for(Employee employee: list){
            Integer employeeId = employee.getEmployeeId();
            String employeeName = employee.getEmployeeName();
            String departmentName = employee.getDepartmentName();
            Long salary = employee.getEmployeeSalary();
            if(tempMap.containsKey(departmentName) && tempMap.get(departmentName)==salary){
                finalMap.put(departmentName,employeeId);
            }
        }
       // finalMap.forEach((k,v)-> System.out.println(k+ " "+v));
        return finalMap;
    }
}