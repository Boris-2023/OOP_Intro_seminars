package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Student;

/**
 * Class Controller using private fields
 * <b>model</b>, <b>view</b> and <b>students</b>
 */
public class Controller {

    // контроллер - владелец и модели и вьюхи, он может хранить данные (MVP), а
    // может и нет (MVC)

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<>();

    /**
     * Creating new instance of Controller with specified parameters:
     * 
     * @param model -> model for the students
     * @param view  -> view of the students, depends on the language chosen
     * @see Controller#Controller(iGetModel, iGetView)
     */
    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * method to test the list ofstudents is not empty
     * 
     * @see Controller#testData(List)
     */
    private boolean testData(List<Student> list) {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * method to update the record on the student
     * 
     * @see Controller#update()
     */
    public void update() {

        // MVP
        students = model.getAll();
        if (testData(students)) {
            view.printAllSudents(students);
        } else {
            System.out.println(view.msgEmptyStudentList());
        }

        // MVC
        // view.printAllSudents(model.getAll());
    }

    /**
     * basic method to run the program
     * 
     * @see Controller#update()
     */
    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt(view.msgOnInvite()).toUpperCase();

            try {
                com = Command.valueOf(command);

            } catch (Exception e) {
                System.out.println(view.msgOnBadCommand());
                com = Command.NONE;
            }

            switch (com) {
                case ВЫХОД:
                case EXIT:
                    System.out.println(view.msgOnExit());
                    getNewIteration = false;
                    break;
                case СПИСОК:
                case LIST:
                    view.printAllSudents(model.getAll());
                    break;
                case УДАЛИТЬ:
                case DELETE:
                    long id = view.getStudentIdToDelete();
                    boolean res = model.deleteStudent(id);
                    System.out.println(view.msgOnDelete(id, res));
                    break;
                case READ:
                case ПРОЧИТАТЬ:
                case CREATE:
                case СОЗДАТЬ:
                case UPDATE:
                case ИЗМЕНИТЬ:
                case NONE:
                default:
                    break;
            }
        }
    }
}
