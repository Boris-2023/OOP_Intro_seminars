package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Student;

/**
 * Class StudentService implements interface iPersonService<> for Student
 */
public class StudentService implements iPersonService<Student, Integer> {
    private List<Student> students;// all students that we have

    /**
     * Creating new instance of StudentService - list of students:
     * 
     * @see StudentService#StudentService()
     */
    public StudentService() {
        this.students = new ArrayList<>();
    }

    /**
     * List method to get all Students of StudentService object
     * 
     * @see StudentService#getAll()
     */
    @Override
    public List<Student> getAll() {
        return students;
    }

    /**
     * void method to create new record of Employee
     * 
     * @param name -> name of the student
     * @param age  -> age of the student
     * @param id   -> id of Student
     * @see StudentService#create(String, int, Integer)
     */
    @Override
    public void create(String name, int age, Integer id) {
        Student per = new Student(name, age, id);
        students.add(per);
    }

    /**
     * void method to sort students in StudentService object using
     * PersonComparator<>()
     * 
     * @see StudentService#sortByFIO()
     */
    public void sortByFIO() {
        students.sort(new PersonComparator<Student>());
    }

    // можно добавить метод проверки уникальности нового студента - что еще нет в БД

}
