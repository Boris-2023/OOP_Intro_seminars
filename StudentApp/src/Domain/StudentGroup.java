package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Class StudentGroup implements interfaces Iterable<Student> and
 * Comparable<StudentGroup> using private fields <b>List<Student> group</b> and
 * <b>Integer idGroup</b>
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

    private List<Student> group;
    private Integer idGroup;

    /**
     * Creating new instance of Student Group with specified parameters:
     * 
     * @param group   -> group of students
     * @param idGroup -> ID of the group
     * @see StudentGroup#StudentGroup(List, Integer)
     */
    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    /**
     * method to get Student Group
     * 
     * @see StudentGroup#getGroup()
     */
    public List<Student> getGroup() {
        return group;
    }

    /**
     * method to set Student Group
     * 
     * @see StudentGroup#setGroup(List)
     */
    public void setGroup(List<Student> group) {
        this.group = group;
    }

    /**
     * method to get Student Group ID
     * 
     * @see StudentGroup#getIdGroup()
     */
    public Integer getIdGroup() {
        return idGroup;
    }

    /**
     * method to set Student Group ID
     * 
     * @see StudentGroup#setIdGroup(Integer)
     */
    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    /**
     * method to override toString() for a Student Group (includes all students of the group)
     * 
     * @see StudentGroup#toString()
     */
    @Override
    public String toString() {
        String str = "\nStudentGroup ID " + idGroup + ", number of students = " + group.size() + ":";
        for (Student std : group) {
            str += "\n" + std.toString();
        }
        return str;
    }

    /**
     * method to override iterator for a Student Group
     * 
     * @see StudentGroup#iterator()
     */
    @Override
    public Iterator<Student> iterator() {

        return new Iterator<Student>() {
            private int counter;// bounds of the array

            @Override
            public boolean hasNext() {
                if (counter < group.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Student next() {
                return group.get(counter++);
            }
        };
    }

    /**
     * method to override compareTo() for a Student Group (1st by group size, 2nd by
     * group ID)
     * 
     * @see StudentGroup#compareTo(StudentGroup)
     */
    @Override
    public int compareTo(StudentGroup anotherGroup) {

        // sort by age
        if (group.size() == anotherGroup.getGroup().size()) {
            // sort by idGroup
            if (idGroup == anotherGroup.getIdGroup()) {
                return 0;
            } else {
                if (idGroup > anotherGroup.getIdGroup()) {
                    return 1;
                } else {
                    return -1;
                }
            }

        } else {
            if (group.size() > anotherGroup.getGroup().size()) {
                return -1;
            } else {
                return 1;
            }
        }
    }

}
