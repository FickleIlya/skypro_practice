package Introduction.CourseWork;

public class Employee {
    private static int counter;
    private int id;
    private String fio;
    private int department;
    private float salary;

    public String getFio() {return fio;}
    public float getSalary() {return salary;}
    public int getDepartment() {return department;}
    public int getId() {return id;}
    public void setSalary(float salary) {this.salary = salary;}
    public void setDepartment(int department) {this.department = department;}

    public Employee(String fio, int department, float salary){
        this.id = ++counter;
        this.fio = fio;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ". FIO: " + fio + ". Department: " + department + ". Salary: " + salary + ".";
    }
}
