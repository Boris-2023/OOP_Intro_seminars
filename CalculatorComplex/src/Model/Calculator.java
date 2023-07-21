package Model;

import Controller.iGetModel;

/**
 * Class Calculator implementing iGetModel and using private fields
 *<b>result</b>, <b>arg1</b> and <b>arg2</b>
 */
public class Calculator implements iGetModel {

    private double[] result = new double[] { 0, 0 };
    private ComplexNumber arg1, arg2;

    /**
     * method to set 1st argument for the calculator
     * 
     * @param value - value to set as argument #1
     * @see Calculator#setArg1(String)
     */
    public void setArg1(String value) {
        arg1 = new ComplexNumber(value);
    }

    /**
     * method to set 2nd argument for the calculator
     * 
     * @param value - value to set as argument #2
     * @see Calculator#setArg2(String)
     */
    public void setArg2(String value) {
        arg2 = new ComplexNumber(value);
    }

    /**
     * method to get 1st argument as a complex number
     * 
     * @see Calculator#getArg1()
     */
    public ComplexNumber getArg1() {
        return arg1;
    }

    /**
     * method to get 2nd argument as a complex number
     * 
     * @see Calculator#getArg2()
     */
    public ComplexNumber getArg2() {
        return arg2;
    }

    /**
     * method to perform division of two complex numbers
     * 
     *@see Calculator#divide()
     */
    public double[] divide() {
        result[0] = ((arg1.getRealPart()) * (arg2.getRealPart())
                + (arg1.getImagineryPart()) * (arg2.getImagineryPart()))
                / ((arg2.getRealPart() * arg2.getRealPart()) + (arg2.getImagineryPart() * arg2.getImagineryPart()));

        result[1] = ((arg2.getRealPart()) * (arg1.getImagineryPart())
                - (arg1.getRealPart()) * (arg2.getImagineryPart()))
                / ((arg2.getRealPart() * arg2.getRealPart()) + (arg2.getImagineryPart() * arg2.getImagineryPart()));

        return result;
    }

    /**
     * method to perform multiplication of two complex numbers
     * 
     *@see Calculator#multiply()
     */
    public double[] multiply() {
        result[0] = (arg1.getRealPart()) * (arg2.getRealPart()) - (arg1.getImagineryPart()) * (arg2.getImagineryPart());
        result[1] = (arg1.getRealPart()) * (arg2.getImagineryPart()) + (arg1.getImagineryPart()) * (arg2.getRealPart());

        return result;
    }

    /**
     * method to perform summation of two complex numbers
     * 
     *@see Calculator#sum()
     */
    public double[] sum() {
        result[0] = arg1.getRealPart() + arg2.getRealPart();
        result[1] = arg1.getImagineryPart() + arg2.getImagineryPart();

        return result;
    }

     /**
     * method to perform deduction of two complex numbers
     * 
     *@see Calculator#deduct()
     */
    public double[] deduct() {
        result[0] = arg1.getRealPart() - arg2.getRealPart();
        result[1] = arg1.getImagineryPart() - arg2.getImagineryPart();

        return result;
    }

}
