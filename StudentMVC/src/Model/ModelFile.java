package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

/**
 * Class ModelFile implements interface iGetModel, takes/saves the students
 * from/to file and keeps in a
 * List using private fields <b>fName</b> (name of file) and List
 * <b>students</b>
 */
public class ModelFile implements iGetModel {
    private String fName;
    private List<Student> students = new ArrayList<>();

    /**
     * Creating new instance of ModelFile with specified parameter:
     * 
     * @param fName -> name of the file to load or save the students' data
     * @see ModelFile#ModelFile(String)
     */
    public ModelFile(String fName) {
        this.fName = fName;

        try (FileWriter fw = new FileWriter(fName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to get full list of Students as a List (from file)
     * 
     * @see ModelFile#getAll()
     */
    @Override
    public List<Student> getAll() {
        if (students.size() == 0) {// should load from file for the first time only, otherwise will append loaded
                                   // list to existing every time getAll() is called
            try {
                FileReader fr = new FileReader(fName);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                while (line != null) {
                    String[] details = line.split(" ");
                    Student stud = new Student(details[0], Integer.parseInt(details[1]), Integer.parseInt(details[2]));
                    students.add(stud);
                    line = reader.readLine();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return students;

    }

    /**
     * method to save a List of students to the file
     * 
     * @param students - List of students to save
     * @see ModelFile#saveAllToFile(List)
     */
    public void saveAllToFile(List<Student> students) {
        try (FileWriter fw = new FileWriter(fName, true)) {
            for (Student stud : students) {
                fw.write(stud.getName() + stud.getAge() + " " + stud.getId() + " ");
                fw.append("\n");
            }
            fw.flush();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to delete a student from the List by ID; it returns true if
     * successfull, otherwise - false
     * 
     * @param id - ID of the student to delete
     * @see ModelFile#deleteStudent(long)
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
