package corejava.collection.assignmentset2.question5.mapper;

import corejava.collection.assignmentset2.question5.model.Employee;

import java.util.ArrayList;

public class EmployeeMapper {
    public  static Employee map(String data){
        String[] arr = data.split(",");
        Integer empId = Integer.parseInt(arr[0].trim());
       // String empDepartment = arr[2];
        Long empSalary = Long.parseLong(arr[3].trim());
        Employee employee = new Employee(empId,empSalary);
        System.out.println(employee);
        return employee;
    }
}
