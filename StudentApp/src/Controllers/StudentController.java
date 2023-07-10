package Controllers;

import Domain.Student;
import Services.StudentService;

public class StudentController implements iPersonController<Student, Integer>{
    
    private final StudentService dataService = new StudentService();

    /**
     * method to create new student
     * 
     * @param name   -> name of the student
     * @param age -> age of the student
     * @param id -> id of the student
     * @see StudentController#create(String, int, Integer)
     */
    @Override
    public void create(String name, int age, Integer id) {
        dataService.create(name, age, id);
        dataService.sortByFIO();
    }
}
