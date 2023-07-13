import java.util.Iterator;
import java.util.List;

/**
 * Class StudentGroup implements interfaces Iterable<Student> and
 * Comparable<StudentGroup> using private fields <b>List<Student> group</b> and
 * <b>Integer idGroup</b>
 */
public class StudentGroup<T extends Comparable<T>, V> implements Iterable<Student<T, V>> {

    private List<Student<T, V>> group;
    private T idGroup;

    /**
     * Creating new instance of Student Group with specified parameters:
     * 
     * @param group   -> group of students
     * @param idGroup -> ID of the group
     * @see StudentGroup#StudentGroup(List, Integer)
     */
    public StudentGroup(List<Student<T, V>> group, T idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    /**
     * method to get Student Group
     * 
     * @see StudentGroup#getGroup()
     */
    public List<Student<T, V>> getGroup() {
        return group;
    }

    /**
     * method to set Student Group
     * 
     * @see StudentGroup#setGroup(List)
     */
    public void setGroup(List<Student<T, V>> group) {
        this.group = group;
    }

    /**
     * method to get Student Group ID
     * 
     * @see StudentGroup#getIdGroup()
     */
    public T getIdGroup() {
        return idGroup;
    }

    /**
     * method to set Student Group ID
     * 
     * @see StudentGroup#setIdGroup(Integer)
     */
    public void setIdGroup(T idGroup) {
        this.idGroup = idGroup;
    }

    /**
     * method to override toString() for a Student Group (includes all students of
     * the group)
     * 
     * @see StudentGroup#toString()
     */
    @Override
    public String toString() {
        String str = "\nStudentGroup ID " + idGroup + ", number of students = " + group.size() + ":";
        for (Student<T, V> std : group) {
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
    public Iterator<Student<T, V>> iterator() {

        return new Iterator<Student<T, V>>() {
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
            public Student<T, V> next() {
                return group.get(counter++);
            }
        };
    }

}
