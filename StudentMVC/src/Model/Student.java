package Model;

/**
 * Class Student extends class Person and implements interface
 * Comparable<Student> using super fields
 * <b>name</b>, <b>age</b> and private <b>id</b>
 */
public class Student extends Person implements Comparable<Student> {

    private int id;

    /**
     * Creating new instance of Student with specified parameters:
     * 
     * @param name -> name of the student
     * @param age  -> age of the student
     * @param id   -> ID of the student
     * @see Student#Student(String, int, int)
     */
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    /**
     * method to get Student's ID
     * 
     * @see Student#getId()
     */
    public int getId() {
        return id;
    }

    /**
     * method to set Student's ID
     * 
     * @see Student#setId()
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * method to override toString() for a Student
     * 
     * @see Student#toString()
     */
    @Override
    public String toString() {
        return "Student [age = " + super.getAge() + ", name = " + super.getName() + ", id = " + id + "]";
    }

    /**
     * method to override comparing for a Student (1st by age, 2nd by ID)
     * 
     * @see Student#compareTo(Student)
     */
    @Override
    public int compareTo(Student o) {

        // sort by age
        if (super.getAge() == o.getAge()) {
            // sort by id
            if (id == o.id) {
                return 0;
            } else {
                if (id > o.id) {
                    return 1;
                } else {
                    return -1;
                }
            }

        } else {
            if (super.getAge() > o.getAge()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

}
