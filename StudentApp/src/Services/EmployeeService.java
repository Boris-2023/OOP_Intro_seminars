package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.PersonComparator;

/**
 * Class EmployeeService implements interface iPersonService<> for Employee
 */
public class EmployeeService implements iPersonService<Employee, String> {
    private List<Employee> employees;// all students that we have

    /**
     * Creating new instance of EmployeeService - list of employees:
     * 
     * @see EmployeeService#EmployeeService()
     */
    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    /**
     * List method to get all employees of EmployeeService object
     * 
     * @see EmployeeService#getAll()
     */
    @Override
    public List<Employee> getAll() {
        return employees;
    }

    /**
     * void method to create new record of Employee
     * 
     * @param name     -> name of the employee
     * @param age      -> age of the employee
     * @param position -> position of employee
     * @see EmployeeService#create(String, int, String)
     */
    @Override
    public void create(String name, int age, String position) {
        Employee per = new Employee(name, age, position);
        employees.add(per);
    }

    /**
     * void method to sort employees in EmployeeService object using
     * PersonComparator<>()
     * 
     * @see EmployeeService#sortByFIO()
     */
    public void sortByFIO() {
        employees.sort(new PersonComparator<Employee>());
    }

    /** pays salary to generic type of person*/
    public <T extends Employee> void paySalary(T person) {
        System.out.println(person.getName() + " - выплачена зарплата 10000 руб.");
    }

    /**
     * method to convert list of employees to a string
     * 
     * @see EmployeeService#toString()
     */
    @Override
    public String toString() {
        String res = "\nEmployees:";

        for (Employee em : employees) {
            res = res + "\n" + em;
        }

        return res;
    }

}
