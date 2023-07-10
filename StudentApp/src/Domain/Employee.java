package Domain;

/**
 * Class Employee extends class Person using super fields
 * <b>name</b>, <b>age</b> and private <b>position</b>
 */
public class Employee extends Person {
    private String position;

    /**
     * Creating new instance of Employee with specified parameters:
     * @param name -> name of the employee
     * @param age  -> age of the employee
     * @param position  -> position of the employee
     * @see Employee#Employee(String, int, String)
     */
    public Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    /**
     * method to override toString() for an Employee
     @see Employee#toString()
     */
    @Override
    public String toString() {
        return "Employee [age = " + super.getAge() + ", name = " + super.getName() + ", position = " + position + "]";
    }

    /**
     * method to get position of an Employee
     @see Employee#getPosition()
     */
    public String getPosition() {
        return position;
    }

    /**
     * method to set position of an Employee
     @see Employee#setPosition(String)
     */
    public void setPosition(String position) {
        this.position = position;
    }
}
