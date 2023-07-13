package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/**
 * Class ViewEng implements interface iGetView and intended to communicate with
 * user in English
 */
public class ViewEng implements iGetView {

    /**
     * method to print all students from a list in English
     * 
     * @param students - List of students to print
     * @see ViewEng#printAllSudents(List)
     */
    public void printAllSudents(List<Student> students) {
        System.out.println("=======List of students=======>");
        for (Student stud : students) {
            System.out.println(wordStudent() + ": [" + wordName() + " = " + stud.getName() + ", " + wordAge() + " = "
                    + stud.getAge() + ", ID = " + stud.getId() + "]");
        }
        System.out.println("==============================");
    }

    /**
     * method to prompt from user by invitation
     * 
     * @param msg - message to print, invite user
     * @see ViewEng#prompt(String)
     */
    @Override
    public String prompt(String msg) {
        Scanner iScan = new Scanner(System.in);
        System.out.println(msg);
        return iScan.nextLine();
    }

    /**
     * method to get ID of the student to delete; uses prompt(); return ID
     * 
     * @see ViewEng#getStudentIdToDelete()
     */
    @Override
    public Long getStudentIdToDelete() {
        long id = Integer.parseInt(prompt("Enter ID of the student to delete: "));
        return id;
    }

    /**
     * method to display student's record with some additional information
     * 
     * @see ViewEng#displayStudent(String, String)
     */
    @Override
    public void displayStudent(String msg, Student stud) {
        System.out.println(msg + stud);
    }

    /**
     * method to read student's record
     * 
     * @see ViewEng#readStudent()
     */
    @Override
    public Student readStudent() {
        return null;
    }

    /**
     * method to get ID of the student to update; uses prompt(); return ID
     * 
     * @see ViewEng#getStudentIdToUpdate()
     */
    @Override
    public Long getStudentIdToUpdate() {
        long id = Integer.parseInt(prompt("Enter ID of the student to update: "));
        return id;
    }

    /**
     * method to return English invitation message
     * 
     * @see ViewEng#msgOnInvite()
     */
    @Override
    public String msgOnInvite() {
        return "Enter new command: ";
    }

    /**
     * method to return English message on empty list
     * 
     * @see ViewEng#msgEmptyStudentList()
     */
    @Override
    public String msgEmptyStudentList() {
        return "The list of students is empty!";
    }

    /**
     * method to return English message on exit
     * 
     * @see ViewEng#msgOnExit()
     */
    @Override
    public String msgOnExit() {
        return "Exiting the application...";
    }

    /**
     * method to return English message on student's record deletion depending on
     * result
     * 
     * @param id     - ID of the student (to show in message)
     * @param result - result of operation
     * @see ViewEng#msgOnDelete(long, result)
     */
    @Override
    public String msgOnDelete(long id, boolean result) {
        if (result) {
            return "Student with ID " + id + " has been successfully deleted!";
        } else {
            return "Student with ID " + id + " has NOT been found in database!";
        }
    }

    /**
     * method to return English message on bad command
     * 
     * @see ViewEng#msgOnBadCommand()
     */
    @Override
    public String msgOnBadCommand() {
        return "There is no such command!";
    }

    /**
     * method to return English word 'Student'
     * 
     * @see ViewEng#wordStudent()
     */
    @Override
    public String wordStudent() {
        return "Student";
    }

    /**
     * method to return English word 'Name'
     * 
     * @see ViewEng#wordStudent()
     */
    @Override
    public String wordName() {
        return "Name";
    }

    /**
     * method to return English word 'Age'
     * 
     * @see ViewEng#wordStudent()
     */
    @Override
    public String wordAge() {
        return "Age";
    }

}
