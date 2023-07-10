package Services;

import java.util.List;

import Domain.Person;

/**
 * Class AverageAge of generic type T (extending Person) includes a method to compute average age of persons in a group
 */
public class AverageAge<T extends Person> {
    
    /**
     * method to compute an average age in a group of generic type T (extending Person)
     * 
     * @param group     -> group of persons of corresponding type
     * @see AverageAge#getAveAge(List)
     */
    public String getAveAge(List<T> group) {
        double res = 0;
        for (T per : group)
            res += per.getAge();
        return String.format("%.2f", res / group.size());
    }
    
}
