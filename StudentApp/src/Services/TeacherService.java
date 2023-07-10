package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Teacher;

/**
 * Class StudentService implements interface iPersonService<> for Student
 */
public class TeacherService implements iPersonService<Teacher, String> {
    
    private List<Teacher> teachers;// to store all teachers that we have

    /**
     * Creating new instance of TeacherService - list of Teachers:
     * 
     * @see TeacherService#TeacherService()
     */
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    /**
     * List method to get all Teachers of TeacherService object
     * 
     * @see TeacherService#getAll()
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * void method to create new record of Teacher
     * 
     * @param name     -> name of the Teacher
     * @param age      -> age of the Teacher
     * @param acadDegree -> academic degree of Teacher
     * @see TeacherService#create(String, int, String)
     */
    @Override
    public void create(String name, int age, String acadDegree) {
        Teacher per = new Teacher(name, age, acadDegree);
        teachers.add(per);
    }

    /**
     * void method to sort Teachers in TeacherService object using
     * PersonComparator<>()
     * 
     * @see TeacherService#sortByFIO()
     */
    public void sortByFIO() {
        teachers.sort(new PersonComparator<Teacher>());
    }

    /** pays salary to generic type of person*/
    public <T extends Teacher> void paySalary(T person) {
        System.out.println(person.getName() + " - выплачена зарплата 20000 руб.");
    }

    /**
     * method to convert list of Teachers to a string
     * 
     * @see TeacherService#toString()
     */
    @Override
    public String toString() {
        String res = "\nTeachers:";

        for (Teacher teacher : teachers) {
            res = res + "\n" + teacher;// "\nname = " + teacher.getName() + ", age = " + teacher.getAge();
        }
        return res;
    }

}
