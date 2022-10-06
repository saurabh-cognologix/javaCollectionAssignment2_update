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
        /*
        *         Method 1
        * */
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

        System.out.println();
        System.out.println("-----------------Method 2 --------------");
        System.out.println();
        Map<String, Optional<Integer>> result =  employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentName,
                        Collectors.collectingAndThen(Collectors
                                        .maxBy(Comparator.comparing(Employee::getEmployeeSalary)),
                                e-> e.map(Employee::getEmployeeId))));

        result.forEach((k,v)-> System.out.println(k+"  "+v));

        /*
        * Method 3
        * */
        System.out.println();
        System.out.println("-----------------Method 3 --------------");
        System.out.println();

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
