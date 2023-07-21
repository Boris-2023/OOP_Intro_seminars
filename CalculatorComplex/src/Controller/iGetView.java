package Controller;

/**
 * public interface for the views
 */
public interface iGetView {
    // prints whole the problem with result
    String displaySolved(String arg1, String arg2, String operation, String result);

    // request for user input (command or data from user)
    String prompt(String msg);

    // invite msg
    String msgOnInvite();

    // message to invite for new calculation
    String msgOnNewCalculation();

    // message to request 1st argument
    String msgOn1stArgument();

    // message to request 2nd argument
    String msgOn2ndArgument();

    // message to request an operation
    String msgOnOperation();

    // bad command message
    String msgOnBadCommand();

    // message on bad number input
    String msgOnBadNumber();

    // message on exit
    String msgOnExit();

    // message on result
    String msgOnResult();
}
