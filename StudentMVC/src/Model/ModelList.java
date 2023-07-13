package Model;

import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

/**
 * Class ModelList implements interface iGetModel and keeps the students in a
 * List using private field List <b>students</b>
 */
public class ModelList implements iGetModel {
    private List<Student> students = new ArrayList<>();

    /**
     * Creating new instance of ModelList with specified parameter:
     * 
     * @param students -> List of students to work with
     * @see ModelList#ModelList(List)
     */
    public ModelList(List<Student> students) {
        this.students = students;
    }

    /**
     * method to get full list of Students as a List
     * 
     * @see ModelList#getAll()
     */
    public List<Student> getAll() {
        return students;
    }

    /**
     * method to delete a student from the List by ID; it returns true if
     * successfull, otherwise - false
     * 
     * @param id - ID of the student to delete
     * @see ModelList#deleteStudent(long)
     */
    @Override
    public boolean deleteStudent(long id) {
        boolean res = false;

        for (Student stud : students) {

            if (stud.getId() == id) {
                students.remove(students.indexOf(stud));
                res = true;
                break;
            }
        }
        return res;
    }

}
