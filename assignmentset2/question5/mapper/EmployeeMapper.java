package corejava.collection.assignmentset2.question5.mapper;

import corejava.collection.assignmentset2.question5.model.Employee;

import java.util.ArrayList;

public class EmployeeMapper {
    public  static Employee map(String data){
        String[] arr = data.split(",");
        Integer employeeId= Integer.parseInt(arr[0].trim());
        String employeeName = arr[1].trim();
        String departmentName = arr[2].trim();
        Long employeeSalary = Long.parseLong(arr[3].trim());

        Employee employee = new Employee(employeeId,employeeName,departmentName,employeeSalary);
      //  System.out.println(employee);
        return employee;
    }
}
