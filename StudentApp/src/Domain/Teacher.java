package Domain;

/**
 * Class Teacher extends class Person using super fields
 * <b>name</b>, <b>age</b> and private <b>acadDegree</b>
 */
public class Teacher extends Person {
    private String acadDegree;

    /**
     * Creating new instance of Teacher with specified parameters:
     * @param name -> name of the teacher
     * @param age  -> age of the tescher
     * @param acadDegree  -> academic degree of the teacher
     * @see Teacher#Teacher(String, int, String)
     */
    public Teacher(String name, int age, String acadDegree) {
        super(name, age);
        this.acadDegree = acadDegree;
    }

    /**
     * method to get teacher's academic degree
     * 
     * @see Teacher#getAcadDegree()
     */
    public String getAcadDegree() {
        return acadDegree;
    }

    /**
     * method to set teacher's academic degree
     * 
     * @see Teacher#getAcadDegree()
     */
    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    /**
     * method to override toString() for a Teacher
     * 
     * @see Teacher#toString()
     */
    @Override
    public String toString() {
        return "Teacher [age = " + super.getAge() + ", name = " + super.getName() + ", Academic Degree = " + acadDegree
                + "]";
    }
}
