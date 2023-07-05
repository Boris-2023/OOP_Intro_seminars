package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Class StudentStream implements interface Iterable<Student> using private fields <b>List<StudentGroup> stream</b> and
 * <b>Integer idStream</b>
 */
public class StudentStream implements Iterable<StudentGroup> {

    private List<StudentGroup> stream;
    private Integer idStream;

    /**
     * Creating new instance of Student Stream (consisting of Student Groups) with specified parameters:
     * 
     * @param stream   -> stream of student groups
     * @param idGroup -> ID of the stream
     * @see StudentStream#StudentStream(List, Integer)
     */
    public StudentStream(List<StudentGroup> stream, Integer idStream) {
        this.stream = stream;
        this.idStream = idStream;
    }

    /**
     * method to get Student Stream
     * 
     * @see StudentStream#getStream()
     */
    public List<StudentGroup> getStream() {
        return stream;
    }

    /**
     * method to set Student Stream
     * 
     * @see StudentStream#setStream(List)
     */
    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    /**
     * method to get Student Stream's ID
     * 
     * @see StudentStream#getIdStream()
     */
    public Integer getIdStream() {
        return idStream;
    }

    /**
     * method to set Student Stream's ID
     * 
     * @see StudentStream#setIdStream(Integer)
     */
    public void setIdStream(Integer idStream) {
        this.idStream = idStream;
    }

    /**
     * method to override toString() for a Student Stream (includes groups and the students of the stream)
     * 
     * @see StudentStream#toString()
     */
    @Override
    public String toString() {
        String str = "\nStudentStream ID " + idStream + ", number of groups = " + stream.size() + ":";
        for (StudentGroup grp : stream) {
            str += "\n" + grp.toString();
        }
        return str;
    }

    /**
     * method to override iterator for a Student Stream
     * 
     * @see StudentStream#iterator()
     */
    @Override
    public Iterator<StudentGroup> iterator() {

        return new Iterator<StudentGroup>() {
            private int counter;// bounds of the array

            @Override
            public boolean hasNext() {
                if (counter < stream.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public StudentGroup next() {
                return stream.get(counter++);
            }
        };
    }
}
