package Introduction.CourseWork;

import static java.lang.Math.abs;

public class EmployeeBook {
    private final Employee[] Storage;

    public EmployeeBook(int arrayLength) {
        this.Storage = new Employee[arrayLength];
    }

    // Employees
    public void addEmployee(Employee employee) {
        for (int i = 0; i < Storage.length; i++) {
            if (Storage[i] != null) {
                this.Storage[i] = employee;
                break;
            }
        }
    }

    public void deleteEmployee(int id, String fio){
        for (int i = 0; i < Storage.length; i++) {
            if (Storage[i].getId() == id && Storage[i].getFIO().equals(fio)) {
                this.Storage[i] = null;
                break;
            }
        }
    }

    public String getEmployees(){
        StringBuilder employees = new StringBuilder("");
        for (Employee employee : Storage) {
            if (employee != null) {
                employees.append(employee).append(", ");
            } else break;
        }
        return employees.substring(0, employees.lastIndexOf(","));
    }

    public void changeSalaryByFIO(String fio, float newSalary){
        for (Employee employee : Storage) {
            if (employee != null && employee.getFIO().equals(fio)) {
                employee.setSalary(newSalary);
            }else if (employee == null) break;
        }
    }

    public void changeDepartmentByFIO(String fio, int newDepartment){
        for (Employee employee : Storage) {
            if (employee != null && employee.getFIO().equals(fio)) {
                employee.setDepartment(newDepartment);
            }else if (employee == null) break;
        }
    }

    public void getAllFIOEmployees(){
        StringBuilder allFio = new StringBuilder();
        for (Employee employee : Storage) {
            if (employee != null) {
                allFio.append(employee.getFIO()).append(", ");
            } else break;
        }
        System.out.println(allFio.substring(0, allFio.lastIndexOf(",")));
    }

    public void departmentsEmployees(){
//        Employee[][] departments = new Employee[5][storage.length];
        StringBuilder department1 = new StringBuilder("First department: ");
        StringBuilder department2 = new StringBuilder("Second department: ");
        StringBuilder department3 = new StringBuilder("Third department: ");
        StringBuilder department4 = new StringBuilder("Fourth department: ");
        StringBuilder department5 = new StringBuilder("Fifth department: ");

        for (Employee employee : Storage) {
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
                }
            }
        }
        System.out.println(department1);
        System.out.println(department2);
        System.out.println(department3);
        System.out.println(department4);
        System.out.println(department5);
    }

    // Departments
    public Employee employeeWithMinSalary(int department){
        float minSalary = Storage[0].getSalary();
        int id = 0;

        for (int i = 1; i < Storage.length; i++) {
            if (Storage[i].getSalary() < minSalary && Storage[i].getDepartment() == department) {
                id = Storage[i].getId();
            }else if (Storage[i] == null) {
                break;
            }
        }
        return Storage[id];
    }

    public Employee employeeWithMaxSalary(int department){
        float maxSalary = Storage[0].getSalary();
        int id = 0;

        for (int i = 1; i < Storage.length; i++) {
            if (Storage[i].getSalary() > maxSalary && Storage[i].getDepartment() == department) {
                id = Storage[i].getId();
            }else if (Storage[i] == null) {
                break;
            }
        }
        return Storage[id];
    }

    public String getEmployees(int department){
        StringBuilder employeesString = new StringBuilder("");
        for (Employee employee : Storage) {
            if (employee != null && employee.getDepartment() == department) {
                employeesString.append(employee.getId()).append(", ").append(employee.getFIO()).append(", ").append(employee.getSalary()).append("; ");
            }else if (employee == null) {
                break;
            }
        }
        return employeesString.substring(0, employeesString.lastIndexOf(";"));
    }

    public float salaryCosts(int department){
        float total = 0.0f;

        for (Employee employee : Storage) {
            if (employee != null && employee.getDepartment() == department) {
                total += employee.getSalary();
            }else if (employee == null) {
                break;
            }
        }
        return total;
    }

    public float averageSalary(int department, float totalSalary){
        int countEmployees = 0;
        for (Employee employee : Storage) {
            if (employee != null && employee.getDepartment() == department) {
                countEmployees++;
            }else if (employee == null) {
                break;
            }
        }
        return totalSalary/countEmployees;
    }

    public void diffSalaryWithChange(int department, float percent){
        for (Employee employee : Storage) {
            if (employee != null && employee.getDepartment() == department) {
                float diff = abs(employee.getSalary() - employee.getSalary()*percent);
                System.out.println(employee.getFIO() + ": " + diff);
            }else if (employee == null) {
                break;
            }

        }
    }

    // Salary
    public float salaryCosts(){
        float total = 0.0f;

        for (Employee employee : Storage) {
            if (employee != null) {
                total += employee.getSalary();
            } else break;
        }
        return total;
    }

    public Employee getEmployeeWithMinSalary(){
        float minSalary = Storage[0].getSalary();
        int id = 0;

        for (int i = 1; i < Storage.length; i++) {
            if (Storage[i] != null && Storage[i].getSalary() < minSalary) {
                id = Storage[i].getId();
            } else break;
        }
        return Storage[id];
    }

    public Employee getEmployeeWithMaxSalary(){
        float maxSalary = Storage[0].getSalary();
        int id = 0;

        for (int i = 1; i < Storage.length; i++) {
            if (Storage[i] != null && Storage[i].getSalary() > maxSalary) {
                id = Storage[i].getId();
            } else break;
        }
        return Storage[id];
    }

    public float averageSalary(float total){
        int employeesCount = 0;
        for (Employee employee : Storage) {
            if (employee != null) {
                employeesCount++;
            } else break;
        }
        return total / employeesCount;
    }

    public void diffSalaryWithChange(float percent){
        for (Employee employee : Storage) {
            if (employee != null) {
                float diff = abs(employee.getSalary() - employee.getSalary()*percent);
                System.out.println(employee.getFIO() + ": " + diff);
            } else break;

        }
    }

    public void employeesWithSalaryLT(float salary){
        for (Employee employee : Storage) {
            if (employee != null && employee.getSalary() < salary){
                System.out.println(employee.getId() + ", " + employee.getFIO() + ", " + employee.getSalary());
            }else if (employee == null) break;
        }
    }

    public void employeesWithSalaryGTE(float salary){
        for (Employee employee : Storage) {
            if (employee != null && employee.getSalary() >= salary){
                System.out.println(employee.getId() + ", " + employee.getFIO() + ", " + employee.getSalary());
            }else if (employee == null) break;
        }
    }

}
