package Controller;

import java.util.List;

import Model.Student;

/**
 * public interface for the views
 */
public interface iGetView {
    // prints info on all/every students
    void printAllSudents(List<Student> students);

    // request for user input (command or data from user)
    String prompt(String msg);

    // to receive ID of the srudent to be deleted
    Long getStudentIdToDelete();

    // to display info of the student with some add message
    void displayStudent(String msg, Student stud);

    // read data on a student
    Student readStudent();

    // to receive ID of the student to be updated
    Long getStudentIdToUpdate();

    // invite msg
    String msgOnInvite();

    // display empty list message
    String msgEmptyStudentList();

    // message on exit
    String msgOnExit();

    // message on delete
    String msgOnDelete(long id, boolean result);

    // bad command message
    String msgOnBadCommand();

    // student
    String wordStudent();

    // name
    String wordName();

    // age
    String wordAge();
}
