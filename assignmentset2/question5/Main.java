package corejava.collection.assignmentset2.question5;
import corejava.collection.assignmentset2.question5.model.Employee;
import corejava.collection.assignmentset2.question5.parser.EmployeeParser;
import corejava.collection.assignmentset2.question5.solution.Solution;


import java.util.*;



public class Main {

    public static void main(String[] args) {
        String filePath = "JavaTraining/src/corejava/collection/assignmentset2/question5/input/input.txt";
        EmployeeParser employeeParser = new EmployeeParser();
        List<Employee> employeeList =employeeParser.parseTextFile(filePath);
        Solution solution = new Solution();
        Map<String,Long> map = solution.storedMaxDepartmentOfSalary(employeeList);
        Map<String,Integer> solMap = solution.getCandidateIdWithLowestId(employeeList,map);
       // System.out.println(solMap);
        solMap.forEach((k,v)-> System.out.println(k+" : "+v));
       // System.out.println(employeeList);

    }
}
