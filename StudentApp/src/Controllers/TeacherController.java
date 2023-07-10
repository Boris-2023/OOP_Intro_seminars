package Controllers;

import Domain.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher, String> {
    
    private final TeacherService tchService = new TeacherService();

    /**
     * method to create new teacher
     * 
     * @param name   -> name of the teacher
     * @param age -> age of the teacher
     * @param acadDegree -> academic degree of the teacher
     * @see TeacherController#create(String, int, String)
     */
    @Override
    public void create(String name, int age, String acadDegree) {
        tchService.create(name, age, acadDegree);
        tchService.sortByFIO();
    }
}