package View;

import java.util.Scanner;

import Controller.iGetView;

/**
 * Class LangSelector - one-method class to select a language of the
 * program
 */
public class LangSelector {

    /**
     * method to select user language for the program, English & Russian are
     * available; depending on user's choice different View classes are used
     * 
     * @see LangSelector#select()
     */
    public static iGetView select() {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Choose the language / Выберите язык (1 - English, 2 - Русский): ");
        int choice = Integer.parseInt(iScan.nextLine());

        if (choice == 1) {
            return new ViewEng();
        } else {
            return new ViewRus();
        }
    }

}
