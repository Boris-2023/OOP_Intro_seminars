package Domain;

import java.util.Comparator;

/**
 * Class PersonComparator of generic type T which extends class Person implements interface
 * Comparator<T>
 */
public class PersonComparator<T extends Person> implements Comparator<T> {

    /**
     * method to compare 2 objects of generic type T (extends Person): 1st by name, then by age
     @see PersonComparator#compare(T, T)
     */
    @Override
    public int compare(T o1, T o2) {
        int res = o1.getName().compareTo(o2.getName());
        if (res == 0) {
            if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            return res;
        }
    }

}
