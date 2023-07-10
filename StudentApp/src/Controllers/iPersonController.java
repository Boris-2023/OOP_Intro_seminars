package Controllers;

import Domain.Person;

/**
 * public interface using generic T (extending Person) and U for extra field of
 * records (e.g. id for Student, position for employee and degree for teacher)
 */
public interface iPersonController<T extends Person, U> {
    
    /**
     * method to create new record of Person-related object
     * 
     * @param name   -> name of the person
     * @param age -> age of the person
     * @param fld -> extra info on the person (e.g. id for Student, position for employee and degree for teacher)
     * @see iPersonController#create(String, int, U)
     */
    void create(String name, int age, U fld);
}
