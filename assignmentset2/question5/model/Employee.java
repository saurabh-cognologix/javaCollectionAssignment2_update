package corejava.collection.assignmentset2.question5.model;

public class Employee {
    private long salary;
    private String id;

    public Employee(long salary, String id) {
        this.salary = salary;
        this.id = id;
    }

    public Employee() {
    }

    public long getSalary() {
        return salary;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        String placeholder = "id ={0}, Salary={1}";
        return "Employee{" +
                "salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
    public  void setEmployeeById(String str[]){
        if(this.salary<Long.parseLong(str[3].trim())){
            this.salary = Long.parseLong(str[3]);
            this.id = str[0].trim();
        }
    }
}
