package Introduction.CourseWork;

public class Employee {
    private static int Counter;
    private int Id;
    private String FIO;
    private int department;
    private float salary;

    public String getFIO() {return FIO;}
    public float getSalary() {return salary;}
    public int getDepartment() {return department;}
    public int getId() {return Id;}
    public void setSalary(float salary) {this.salary = salary;}
    public void setDepartment(int department) {this.department = department;}

    public Employee(String fio, int department, int salary){
        this.Id = ++Counter;
        this.FIO = fio;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + Id + ". FIO: " + FIO + ". Department: " + department + ". Salary: " + salary + ".";
    }
}
