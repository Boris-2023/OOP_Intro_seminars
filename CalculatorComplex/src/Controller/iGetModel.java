package Controller;

import Model.ComplexNumber;

/**
 * public interface for the models
 */
public interface iGetModel {
    public void setArg1(String value);

    public void setArg2(String value);

    public ComplexNumber getArg1();

    public ComplexNumber getArg2();

    public double[] divide();

    public double[] multiply();

    public double[] sum();

     public double[] deduct();

}
