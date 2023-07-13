package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

/**
 * Class HashModel implements interface iGetModel, keeps the students in a
 * HashMap with consequent numbers as a map keys. Uses private fields HashMap '
 * <b>students</b> and long <b>count</b> - for cross numbering keys
 */
public class HashModel implements iGetModel {
    private HashMap<Long, Student> students = new HashMap<>();
    private long count;

    /**
     * Creating new instance of HashModel with specified parameter:
     * 
     * @param studList -> list of students in a form of a List
     * @see HashModel#HashModel(List)
     */
    public HashModel(List<Student> studList) {
        count = 1;
        for (Student stud : studList) {
            students.put(count, stud);
            count++;
        }
    }

    /**
     * method to get full list of Students as a List
     * 
     * @see HashModel#getAll()
     */
    public List<Student> getAll() {
        return new ArrayList<Student>(students.values());
    }

    /**
     * method to get full list of Students as a HashMap
     * 
     * @see HashModel#getStudentsAsHashMap()
     */
    public HashMap<Long, Student> getStudentsAsHashMap() {
        return students;
    }

    /**
     * method to delete a student from the HashMap by ID; it returns true if
     * successfull, otherwise - false
     * 
     * @param id - ID of the student to delete
     * @see HashModel#deleteStudent(long)
     */
    @Override
    public boolean deleteStudent(long id) {
        boolean res = false;

        for (long key : students.keySet()) {
            if (students.get(key).getId() == id) {
                students.remove(key);
                res = true;
                break;
            }
        }
        return res;
    }
}
