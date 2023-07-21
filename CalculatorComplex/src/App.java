import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.CalcDecoLogging;
import Model.Calculator;
import Model.Logging;
import View.ViewRus;

public class App {
    public static void main(String[] args) throws Exception {

        iGetView view = new ViewRus();

        iGetModel model = new Calculator();

        //model with logging via Decorator
        iGetModel modelLog = new CalcDecoLogging(model, new Logging());

        Controller calc = new Controller(view, modelLog);
        
        calc.run();
    }
}
