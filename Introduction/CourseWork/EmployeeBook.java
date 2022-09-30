package Introduction.CourseWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.abs;

public class EmployeeBook {
    private final Map<Integer, Employee> storage;

    public EmployeeBook() {
        this.storage = new HashMap<>();
    }

    // Employees
    public void addEmployee(Employee employee) {
        if (storage.containsKey(employee.getId())) {
            throw new IllegalArgumentException("Employee with id " + employee.getId() + " already exists.");
        } else {
            storage.put(employee.getId(), employee);
        }
    }

    public void deleteEmployee(String fio) {
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (entry.getValue().getFio().equals(fio)) {
                storage.remove(entry.getKey());
                return;
            }
        }
        throw new IllegalArgumentException("Employee with fio " + fio + " not found.");
    }

    public void getEmployees(){
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void changeSalaryByFIO(String fio, float newSalary){
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (entry.getValue().getFio().equals(fio)) {
                entry.getValue().setSalary(newSalary);
                return;
            }
        }
        throw new IllegalArgumentException("Employee with fio " + fio + " not found.");
    }

    public void changeDepartmentByFIO(String fio, int newDepartment){
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (entry.getValue().getFio().equals(fio)) {
                entry.getValue().setDepartment(newDepartment);
                return;
            }
        }
        throw new IllegalArgumentException("Employee with fio " + fio + " not found.");
    }

    public void getAllFIOEmployees(){
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            System.out.println(entry.getValue().getFio());
        }
    }

    // Departments
    public void listOfEmployeesInDepartments(){
        List<Employee> department1 = new ArrayList<>();
        List<Employee> department2 = new ArrayList<>();
        List<Employee> department3 = new ArrayList<>();
        List<Employee> department4 = new ArrayList<>();
        List<Employee> department5 = new ArrayList<>();

        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            switch (entry.getValue().getDepartment()){
                case 1 -> department1.add(entry.getValue());
                case 2 -> department2.add(entry.getValue());
                case 3 -> department3.add(entry.getValue());
                case 4 -> department4.add(entry.getValue());
                case 5 -> department5.add(entry.getValue());
            }
        }
        System.out.println(department1);
        System.out.println(department2);
        System.out.println(department3);
        System.out.println(department4);
        System.out.println(department5);
    }

    public Employee employeeWithMinSalaryInDepartment(int department){
        Employee employeeWithMinSalary = null;
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (entry.getValue().getDepartment() == department) {
                if (employeeWithMinSalary == null) {
                    employeeWithMinSalary = entry.getValue();
                } else if (entry.getValue().getSalary() < employeeWithMinSalary.getSalary()) {
                    employeeWithMinSalary = entry.getValue();
                }
            }
        }
        if (employeeWithMinSalary == null) {
            throw new IllegalArgumentException("Department " + department + " not found.");
        }
        return employeeWithMinSalary;
    }

    public Employee employeeWithMaxSalaryInDepartment(int department){
        Employee employeeWithMaxSalary = null;
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (entry.getValue().getDepartment() == department) {
                if (employeeWithMaxSalary == null) {
                    employeeWithMaxSalary = entry.getValue();
                } else if (entry.getValue().getSalary() > employeeWithMaxSalary.getSalary()) {
                    employeeWithMaxSalary = entry.getValue();
                }
            }
        }
        if (employeeWithMaxSalary == null) {
            throw new IllegalArgumentException("Department " + department + " not found.");
        }
        return employeeWithMaxSalary;
    }

    public String employeesInDepartment(int department){
        StringBuilder employeesInDepartment = new StringBuilder("Employees in department " + department + ": ");
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (entry.getValue().getDepartment() == department) {
                employeesInDepartment.append(entry.getValue().getFio()).append(", ");
            }
        }
        return employeesInDepartment.toString();
    }

    public float salaryCostsInDepartment(int department){
        float salaryCostsInDepartment = 0;
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (entry.getValue().getDepartment() == department) {
                salaryCostsInDepartment += entry.getValue().getSalary();
            }
        }
        return salaryCostsInDepartment;
    }

    public float averageSalaryInDepartment(int department){
        float averageSalaryInDepartment = 0;
        int count = 0;
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (entry.getValue().getDepartment() == department) {
                averageSalaryInDepartment += entry.getValue().getSalary();
                count++;
            }
        }
        return averageSalaryInDepartment / count;
    }

    public void diffSalaryWithChangeInDepartment(int department, float percent){
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (entry.getValue().getDepartment() == department) {
                entry.getValue().setSalary(entry.getValue().getSalary() * (1 + percent / 100));
            }
        }
    }

    // Salary
    public float salaryCosts(){
        float salaryCosts = 0;
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            salaryCosts += entry.getValue().getSalary();
        }
        return salaryCosts;
    }

    public Employee employeeWithMinSalary(){
        Employee employeeWithMinSalary = null;
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (employeeWithMinSalary == null) {
                employeeWithMinSalary = entry.getValue();
            } else if (entry.getValue().getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = entry.getValue();
            }
        }
        return employeeWithMinSalary;
    }

    public Employee employeeWithMaxSalary(){
        Employee employeeWithMaxSalary = null;
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (employeeWithMaxSalary == null) {
                employeeWithMaxSalary = entry.getValue();
            } else if (entry.getValue().getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = entry.getValue();
            }
        }
        return employeeWithMaxSalary;
    }

    public float averageSalary(){
        float averageSalary = 0;
        int count = 0;
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            averageSalary += entry.getValue().getSalary();
            count++;
        }
        return averageSalary / count;
    }

    public void diffSalaryWithChange(float percent){
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            entry.getValue().setSalary(entry.getValue().getSalary() * (1 + percent / 100));
        }
    }

    public void employeesWithSalaryLT(float salary){
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (entry.getValue().getSalary() < salary) {
                System.out.println(entry.getValue());
            }
        }
    }

    public void employeesWithSalaryGTE(float salary){
        for (Map.Entry<Integer, Employee> entry : storage.entrySet()) {
            if (entry.getValue().getSalary() >= salary) {
                System.out.println(entry.getValue());
            }
        }
    }

}
