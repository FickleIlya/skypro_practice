package Introduction.CourseWork;

import static java.lang.Math.abs;

public class EmployeeBook {
    private final Employee[] storage;

    public EmployeeBook(int arrayLength) {
        if (arrayLength <= 0) {
            throw new IllegalArgumentException("arrayLength must be greater than 0");
        }
        this.storage = new Employee[arrayLength];
    }

    // Employees
    public void addEmployee(Employee employee) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                this.storage[i] = employee;
                break;
            } else if (i == storage.length - 1){
                throw new ArrayStoreException("EmployeeBook is full");
            }
        }
    }

    public void deleteEmployee(String fio) {
        if (fio == null) {
            throw new IllegalArgumentException("FIO must be not null and ID be in [0, array length - 1]");
        }

        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getFio().equals(fio)){
                storage[i] = null;
                break;
            }
        }
    }

    public String getEmployees(){
        StringBuilder employees = new StringBuilder("");
        for (Employee employee : storage) {
            if (employee != null) {
                employees.append(employee).append(", ");
            }
        }
        return employees.substring(0, employees.lastIndexOf(","));
    }

    public void changeSalaryByFIO(String fio, float newSalary){
        int cnt = 1;
        for (Employee employee : storage) {
            if (employee != null && employee.getFio().equals(fio)) {
                employee.setSalary(newSalary);
                break;
            }
            cnt += 1;
        }

        if (cnt == storage.length) {
            throw new ArrayStoreException("Employee not found");
        }
    }

    public void changeDepartmentByFIO(String fio, int newDepartment){
        int cnt = 1;
        for (Employee employee : storage) {
            if (employee != null && employee.getFio().equals(fio)) {
                employee.setDepartment(newDepartment);
                break;
            }
            cnt += 1;
        }

        if (cnt == storage.length) {
            throw new ArrayStoreException("Employee not found");
        }
    }

    public void getAllFIOEmployees(){
        StringBuilder allFio = new StringBuilder();
        for (Employee employee : storage) {
            if (employee != null) {
                allFio.append(employee.getFio()).append(", ");
            }
        }

        if (allFio.toString().equals("")) {
            throw new ArrayStoreException("EmployeeBook is empty");
        }

        System.out.println(allFio.substring(0, allFio.lastIndexOf(",")));
    }

    // Departments
    public void departmentsEmployees(){
        StringBuilder department1 = new StringBuilder("First department: ");
        StringBuilder department2 = new StringBuilder("Second department: ");
        StringBuilder department3 = new StringBuilder("Third department: ");
        StringBuilder department4 = new StringBuilder("Fourth department: ");
        StringBuilder department5 = new StringBuilder("Fifth department: ");

        for (Employee employee : storage) {
            if (employee != null) {
                switch (employee.getDepartment()){
                    case 1:
                        department1.append(employee);
                    case 2:
                        department2.append(employee);
                    case 3:
                        department3.append(employee);
                    case 4:
                        department4.append(employee);
                    case 5:
                        department5.append(employee);
                    default:
                        throw new IllegalArgumentException("Unknown department");
                }
            }
        }
        System.out.println(department1);
        System.out.println(department2);
        System.out.println(department3);
        System.out.println(department4);
        System.out.println(department5);
    }

    public Employee employeeWithMinSalaryInDepartment(int department){
        int id = 0;
        float minSalary = storage[id].getSalary();

        for (int i = 1; i < storage.length; i++) {
            if (storage[i].getSalary() < minSalary && storage[i].getDepartment() == department) {
                id = i;
                minSalary = storage[i].getSalary();
            }
        }
        return storage[id];
    }

    public Employee employeeWithMaxSalaryInDepartment(int department){
        int id = 0;
        float maxSalary = storage[id].getSalary();


        for (int i = 1; i < storage.length; i++) {
            if (storage[i].getSalary() > maxSalary && storage[i].getDepartment() == department) {
                id = i;
                maxSalary = storage[i].getSalary();
            }
        }
        return storage[id];
    }

    public String employeesInDepartment(int department){
        StringBuilder employeesString = new StringBuilder("");
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department) {
                employeesString.append(employee.getId()).append(", ").append(employee.getFio()).append(", ").append(employee.getSalary()).append("; ");
            }
        }

        if (employeesString.toString().equals("")) {
            throw new ArrayStoreException("Department is empty");
        }

        return employeesString.substring(0, employeesString.lastIndexOf(";"));
    }

    public float salaryCostsInDepartment(int department){
        float total = 0.0f;

        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public float averageSalaryInDepartment(int department){
        int countEmployees = 0;
        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department) {
                countEmployees++;
            }
        }
        return this.salaryCostsInDepartment(department)/countEmployees;
    }

    public void diffSalaryWithChangeInDepartment(int department, float percent){
        float diff;

        for (Employee employee : storage) {
            if (employee != null && employee.getDepartment() == department) {
                diff = abs(employee.getSalary() - employee.getSalary()*percent);
                System.out.println(employee.getFio() + ": " + diff);
            }

        }
    }

    // Salary
    public float salaryCosts(){
        float total = 0.0f;

        for (Employee employee : storage) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public Employee employeeWithMinSalary(){
        int id = 0;
        float minSalary = storage[id].getSalary();

        for (int i = 1; i < storage.length; i++) {
            if (storage[i] != null && storage[i].getSalary() < minSalary) {
                id = i;
                minSalary = storage[i].getSalary();
            }
        }
        return storage[id];
    }

    public Employee employeeWithMaxSalary(){
        int id = 0;
        float maxSalary = storage[id].getSalary();


        for (int i = 1; i < storage.length; i++) {
            if (storage[i] != null && storage[i].getSalary() > maxSalary) {
                id = i;
                maxSalary = storage[i].getSalary();
            }
        }
        return storage[id];
    }

    public float averageSalary(){
        int employeesCount = 0;
        for (Employee employee : storage) {
            if (employee != null) {
                employeesCount++;
            }
        }
        return this.salaryCosts() / employeesCount;
    }

    public void diffSalaryWithChange(float percent){
        for (Employee employee : storage) {
            if (employee != null) {
                float diff = abs(employee.getSalary() - employee.getSalary()*percent);
                System.out.println(employee.getFio() + ": " + diff);
            }

        }
    }

    public void employeesWithSalaryLT(float salary){
        for (Employee employee : storage) {
            if (employee != null && employee.getSalary() < salary){
                System.out.println(employee.getId() + ", " + employee.getFio() + ", " + employee.getSalary());
            }
        }
    }

    public void employeesWithSalaryGTE(float salary){
        for (Employee employee : storage) {
            if (employee != null && employee.getSalary() >= salary){
                System.out.println(employee.getId() + ", " + employee.getFio() + ", " + employee.getSalary());
            }
        }
    }

}
