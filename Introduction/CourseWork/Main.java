package Introduction.CourseWork;

public class Main {

    public static void main(String[] args) {

        EmployeeBook storage = new EmployeeBook(10);
        Employee sarah = new Employee("Ebraham Sara Willson", 4, 10000);
        Employee jason = new Employee("Ebraham Jason Willson", 3, 10000);
        Employee mildred = new Employee("Ebraham Mildred Willson", 2, 10000);
        Employee jafar = new Employee("Ebraham JAfar Willson", 1, 10000);
        Employee yawar = new Employee("Ebraham Yawar Willson", 4, 10000);
        Employee nick = new Employee("Ebraham Nick Willson", 5, 10000);
        Employee sofi = new Employee("Ebraham Sofi Willson", 7, 10000);
        Employee jasonNew = new Employee("Ebraham Jason Willson", 3, 10000);

        storage.addEmployee(sarah);
        storage.getEmployees();
        storage.getAllFIOEmployees();
        storage.addEmployee(jason);
        storage.addEmployee(mildred);
        storage.addEmployee(jafar);
        storage.addEmployee(yawar);
        storage.addEmployee(nick);
        storage.addEmployee(sofi);
        storage.getEmployees();
        storage.deleteEmployee("Ebraham Jason Willson");
        storage.getEmployees();
        storage.addEmployee(jasonNew);
        storage.getEmployees();



    }

}
