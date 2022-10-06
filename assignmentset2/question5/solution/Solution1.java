package corejava.collection.assignmentset2.question5.solution;
import corejava.collection.assignmentset2.question4.model.Student;
import corejava.collection.assignmentset2.question5.Comparator.CompareBySalary;
import corejava.collection.assignmentset2.question5.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution1 {
    public Map<String,Integer> getEmployeeId(List<Employee> employeeList){

        /* 1)  Java Optional class provided a way to deal with null values.
        *  2)  It is used to represent a value is present or not.
        *  3)  A null pointer exception is common issue in java application. To prevent this,
        *      we normally add frequent Null Checks in our code to check if a variable is not empty before
        *      we use it in our program. Option provide a bettar way to handle this situation.
        *  4) Optinal class Overcome the null pointer exception
        * */

        /*
         Method 1
        */

        Map<String, Optional<Integer>> tempMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentName,
                        Collectors.maxBy(Comparator.comparing(Employee::getEmployeeSalary))))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        e -> e.getValue().map(Employee::getEmployeeId)));

        tempMap.forEach((k,v)-> System.out.println(k+"  "+v));

        /*
        *   Method 2
        * */


        System.out.println("-----------------Method 2 --------------");

        Map<String, Optional<Integer>> result =  employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartmentName,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getEmployeeSalary)),
                                e-> e.map(Employee::getEmployeeId))));

        result.forEach((k,v)-> System.out.println(k+"  "+v));

        /*
        * Method 3
        * */

        System.out.println("-----------------Method 3 --------------");


        Map<Integer, Long> employeeSalary = employeeList.stream()
                .collect(Collectors.toMap(Employee::getEmployeeId, Employee::getEmployeeSalary));

        Map<String, Integer> retVal = employeeList.stream()
                .collect(Collectors.toMap(
                        Employee::getDepartmentName,
                        Employee::getEmployeeId,
                        BinaryOperator.maxBy(Comparator.comparing(employeeSalary::get))));
        retVal.forEach((k,v)-> System.out.println(k+" : " +v));

        return null;
    }
}
