/**
 * Abstract class of a person that will be extended to the classes of specified entities e.g. students, professors or employees with fields
 * <b>name</b> and <b>age</b>
 */
public abstract class Person<T, V> {
    private T name;
    private V age;
    
    public Person(T name, V age) {
        this.name = name;
        this.age = age;
    }

    
    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name = " + name + ", age = " + age + "]";
    }
    
}