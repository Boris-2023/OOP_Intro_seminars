package Model;

import Controller.iGetModel;

/**
 * Class CalcDecoLogging of calculator with logging (as decorator) implementing iGetModel and using private fields
 *<b>result</b>, <b>oldCalc</b>, <b>arg1</b>, <b>arg2</b> and <b>logger</b>
 */
public class CalcDecoLogging implements iGetModel {

    private double[] result = new double[] { 0, 0 };
    private iGetModel oldCalc;
    private ComplexNumber arg1, arg2;
    private Logging logger;

    /**
     * Create new instance of CalcDecoLogging (Calculator with logging via Decorator)
     * @param oldCalc - model of standard calculator
     * @param logger - instance to support logging
     * @see CalcDecoLogging#CalcDecoLogging(iGetModel, Logging)
     */
    public CalcDecoLogging(iGetModel oldCalc, Logging logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;

        logger.log("Запуск калькулятора с логированием (шаблон Decorator)!");
    }

    /**
     * method to set 1st argument for the calculator with logging
     * 
     * @param value - value to set as argument #1
     * @see CalcDecoLogging#setArg1(String)
     */
    @Override
    public void setArg1(String value) {
        oldCalc.setArg1(value);

        if (oldCalc.getArg1().isNumber()) {
            logger.log("Успешная установка параметра №1 => " + oldCalc.getArg1());
        } else {
            logger.log("Неудачная попытка установки параметра №1!");
        }

    }

    /**
     * method to set 2nd argument for the calculator with logging
     * 
     * @param value - value to set as argument #2
     * @see CalcDecoLogging#setArg2(String)
     */
    @Override
    public void setArg2(String value) {
        oldCalc.setArg2(value);

        if (oldCalc.getArg2().isNumber()) {
            logger.log("Успешная установка параметра №2 => " + oldCalc.getArg2());
        } else {
            logger.log("Неудачная попытка установки параметра №2!");
        }
    }

    /**
     * method to get 1st argument as a complex number with logging
     * 
     * @see CalcDecoLogging#getArg1()
     */
    @Override
    public ComplexNumber getArg1() {
        logger.log("Извлечение параметра №1 => " + oldCalc.getArg1().toString());

        return oldCalc.getArg1();
    }

    /**
     * method to get 2nd argument as a complex number with logging
     * 
     * @see CalcDecoLogging#getArg2()
     */
    @Override
    public ComplexNumber getArg2() {
        logger.log("Извлечение параметра №2 => " + oldCalc.getArg2().toString());

        return oldCalc.getArg2();
    }

    /**
     * method to perform division of two complex numbers with logging
     * 
     *@see CalcDecoLogging#divide()
     */
    @Override
    public double[] divide() {

        logger.log("Установка математической операции => деление");

        arg1 = oldCalc.getArg1();
        arg2 = oldCalc.getArg2();

        result[0] = ((arg1.getRealPart()) * (arg2.getRealPart())
                + (arg1.getImagineryPart()) * (arg2.getImagineryPart()))
                / ((arg2.getRealPart() * arg2.getRealPart()) + (arg2.getImagineryPart() * arg2.getImagineryPart()));

        result[1] = ((arg2.getRealPart()) * (arg1.getImagineryPart())
                - (arg1.getRealPart()) * (arg2.getImagineryPart()))
                / ((arg2.getRealPart() * arg2.getRealPart()) + (arg2.getImagineryPart() * arg2.getImagineryPart()));

        logger.log("Получение результата => " + arg1.toString() + " / " + arg2.toString() + " = "
                + (new ComplexNumber(result)).toString());

        return result;
    }

    /**
     * method to perform multiplication of two complex numbers with logging
     * 
     *@see CalcDecoLogging#multiply()
     */
    @Override
    public double[] multiply() {

        logger.log("Установка математической операции => умножение");

        arg1 = oldCalc.getArg1();
        arg2 = oldCalc.getArg2();

        result[0] = (arg1.getRealPart()) * (arg2.getRealPart()) - (arg1.getImagineryPart()) * (arg2.getImagineryPart());
        result[1] = (arg1.getRealPart()) * (arg2.getImagineryPart()) + (arg1.getImagineryPart()) * (arg2.getRealPart());

        logger.log("Получение результата => " + arg1.toString() + " * " + arg2.toString() + " = "
                + (new ComplexNumber(result)).toString());

        return result;
    }

    /**
     * method to perform summation of two complex numbers with logging
     * 
     *@see CalcDecoLogging#sum()
     */
    @Override
    public double[] sum() {

        logger.log("Установка математической операции => сложение");

        arg1 = oldCalc.getArg1();
        arg2 = oldCalc.getArg2();

        result[0] = arg1.getRealPart() + arg2.getRealPart();
        result[1] = arg1.getImagineryPart() + arg2.getImagineryPart();

        logger.log("Получение результата => " + arg1.toString() + " + " + arg2.toString() + " = "
                + (new ComplexNumber(result)).toString());

        return result;
    }

    /**
     * method to perform decuction of two complex numbers with logging
     * 
     *@see CalcDecoLogging#deduct()
     */
    @Override
    public double[] deduct() {

        logger.log("Установка математической операции => вычитание");

        arg1 = oldCalc.getArg1();
        arg2 = oldCalc.getArg2();

        result[0] = arg1.getRealPart() - arg2.getRealPart();
        result[1] = arg1.getImagineryPart() - arg2.getImagineryPart();

        logger.log("Получение результата => " + arg1.toString() + " - " + arg2.toString() + " = "
                + (new ComplexNumber(result)).toString());

        return result;
    }
    
}
