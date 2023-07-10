package Controllers;

import Domain.Employee;
import Services.EmployeeService;

public class EmployeeController implements iPersonController<Employee, String> {
    
    private final EmployeeService empService = new EmployeeService();

    /**
     * method to create new employee
     * 
     * @param name   -> name of the employee
     * @param age -> age of the employee
     * @param position -> academic degree of the employee
     * @see EmployeeController#create(String, int, String)
     */
    @Override
    public void create(String name, int age, String position) {
        empService.create(name, age, position);
        empService.sortByFIO();
    }
}
