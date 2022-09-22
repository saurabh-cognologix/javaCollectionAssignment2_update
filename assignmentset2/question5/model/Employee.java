package corejava.collection.assignmentset2.question5.model;

public class Employee {
    private Integer id;
    private Long salary;

    public Employee(Integer id, Long salary) {
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public Long getSalary() {
        return salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public  void setEmployeeById(String str[]){
        if(this.salary<Long.parseLong(str[3].trim())){
            this.salary = Long.parseLong(str[3]);
            this.id = Integer.parseInt(str[0].trim());
        }
    }
}
