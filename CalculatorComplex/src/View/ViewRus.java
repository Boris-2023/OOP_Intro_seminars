package View;

import java.util.Scanner;

import Controller.iGetView;

/**
 * Class ViewRus implements interface iGetView and intended to communicate with
 * user in Russian
 */
public class ViewRus implements iGetView {

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
     * method to return Russian invitation message
     * 
     * @see ViewRus#msgOnInvite()
     */
    @Override
    public String msgOnInvite() {
        return "Это калькулятор комплексных чисел!\n====================================";
    }

    /**
     * method to display whole sentence of the problem with result
     * 
     * @param arg1      - 1st argument
     * @param arg2      - 2nd argument
     * @param operation - math operation applied
     * @param result    - result of the operation
     * @see ViewRus#displaySolved(String, String, String, String)
     */
    @Override
    public String displaySolved(String arg1, String arg2, String operation, String result) {
        return msgOnResult() + arg1 + " " + operation + " " + arg2 + " = " + result;
    }

    /**
     * method to return Russian message on bad operation
     * 
     * @see ViewRus#msgOnBadCommand()
     */
    @Override
    public String msgOnBadCommand() {
        return "Такой операции нет!";
    }

    /**
     * return Russian message inviting to new calculation 
     * 
     * @see ViewRus#msgOnNewCalculation()
     */
    @Override
    public String msgOnNewCalculation() {
        return "\nПосчитаем еще? (Y/N): ";
    }

    /**
     * return Russian message inviting to enter 1st argument 
     * 
     * @see ViewRus#msgOn1stArgument()
     */
    @Override
    public String msgOn1stArgument() {
        return "Введите первое число (действительное или комплексное с мнимой частью при i): ";
    }

    /**
     * return Russian message inviting to enter 2nd argument 
     * 
     * @see ViewRus#msgOn2ndArgument()
     */
    @Override
    public String msgOn2ndArgument() {
        return "Введите второе число (действительное или комплексное с мнимой частью при i): ";
    }

    /**
     * return Russian message inviting to enter an operation to compute
     * 
     * @see ViewRus#msgOnOperation()
     */
    @Override
    public String msgOnOperation() {
        return "Введите операцию для вычисления (доступны '+', '-', '*' и '/'): ";
    }

    /**
     * return Russian message informing the value entered is not a number
     * 
     * @see ViewRus#msgOnBadNumber()
     */
    @Override
    public String msgOnBadNumber() {
        return "Введенная строка не является числом!";
    }

    /**
     * method to return Russian message on result
     * 
     * @see ViewRus#msgOnExit()
     */
    @Override
    public String msgOnResult() {
        return "Результат: ";
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

}
