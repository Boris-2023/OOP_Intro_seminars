package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/**
 * Class ViewRus implements interface iGetView and intended to communicate with
 * user in Russian
 */
public class ViewRus implements iGetView {

    /**
     * method to print all students from a list in Russian
     * 
     * @param students - List of students to print
     * @see ViewRus#printAllSudents(List)
     */
    public void printAllSudents(List<Student> students) {
        System.out.println("=======Список студентов=======>");
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
     * @see ViewRus#prompt(String)
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
     * @see ViewRus#getStudentIdToDelete()
     */
    @Override
    public Long getStudentIdToDelete() {
        long id = Integer.parseInt(prompt("Введите ID студента для удаления: "));
        return id;
    }

    /**
     * method to display student's record with some additional information
     * 
     * @see ViewRus#displayStudent(String, String)
     */
    @Override
    public void displayStudent(String msg, Student stud) {
        System.out.println(msg + stud);
    }

    /**
     * method to read student's record
     * 
     * @see ViewRus#readStudent()
     */
    @Override
    public Student readStudent() {
        return null;
    }

    /**
     * method to get ID of the student to update; uses prompt(); return ID
     * 
     * @see ViewRus#getStudentIdToUpdate()
     */
    @Override
    public Long getStudentIdToUpdate() {
        long id = Integer.parseInt(prompt("Введите ID студента для изменения данных: "));
        return id;
    }

    /**
     * method to return Russian invitation message
     * 
     * @see ViewRus#msgOnInvite()
     */
    @Override
    public String msgOnInvite() {
        return "Введите команду: ";
    }

    /**
     * method to return Russian message on empty list
     * 
     * @see ViewRus#msgEmptyStudentList()
     */
    @Override
    public String msgEmptyStudentList() {
        return "Список студентов пуст!";
    }

    /**
     * method to return Russian message on exit
     * 
     * @see ViewRus#msgOnExit()
     */
    @Override
    public String msgOnExit() {
        return "Выполняется выход из приложения...";
    }

    /**
     * method to return Russian message on student's record deletion depending on
     * result
     * 
     * @param id     - ID of the student (to show in message)
     * @param result - result of operation
     * @see ViewRus#msgOnDelete(long, result)
     */
    @Override
    public String msgOnDelete(long id, boolean result) {
        if (result) {
            return "Студент с ID " + id + " успешно удален!";
        } else {
            return "Студент с ID " + id + " в базе данных НЕ найден!";
        }
    }

    /**
     * method to return Russian message on bad command
     * 
     * @see ViewRus#msgOnBadCommand()
     */
    @Override
    public String msgOnBadCommand() {
        return "Такой команды нет!";
    }

    /**
     * method to return Russian word 'Student'
     * 
     * @see ViewRus#wordStudent()
     */
    @Override
    public String wordStudent() {
        return "Студент";
    }

    /**
     * method to return Russian word 'Name'
     * 
     * @see ViewRus#wordStudent()
     */
    @Override
    public String wordName() {
        return "Имя";
    }

    /**
     * method to return Russian word 'Age'
     * 
     * @see ViewRus#wordStudent()
     */
    @Override
    public String wordAge() {
        return "Возраст";
    }

}
