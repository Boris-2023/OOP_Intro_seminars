import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Employee;
import Domain.Person;
import Domain.PersonComparator;
import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;
import Domain.Teacher;
import Services.AverageAge;
import Services.EmployeeService;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        // Students input
        Student s01 = new Student("Иван", 25, 121);
        Student s02 = new Student("Игорь", 23, 301);
        Student s03 = new Student("Иван", 22, 121);
        Student s04 = new Student("Игорь", 23, 444);
        Student s05 = new Student("Даша", 23, 171);
        Student s06 = new Student("Лена", 23, 104);
        //Student s07 = new Student("Семен", 27, 51);
        // Student s08 = new Student("Ирина", 22, 144);
        // Student s09 = new Student("Порфирий", 123, 01);
        // Student s10 = new Student("Леопольд", 26, 75);
        // Student s11 = new Student("JohnDoe", 17, 111);

        // // groups formation
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s01);
        listStud.add(s02);
        // StudentGroup group01 = new StudentGroup(listStud, 01);

        // listStud = new ArrayList<Student>();
        listStud.add(s03);
        listStud.add(s04);
        listStud.add(s05);
        listStud.add(s06);
        StudentGroup group02 = new StudentGroup(listStud, 02);

        // listStud = new ArrayList<Student>();
        // listStud.add(s07);
        // listStud.add(s08);
        // listStud.add(s09);
        // StudentGroup group03 = new StudentGroup(listStud, 03);

        // listStud = new ArrayList<Student>();
        // listStud.add(s10);
        // listStud.add(s11);
        // StudentGroup group04 = new StudentGroup(listStud, 04);

        // System.out.println("\n===print students of a group===>");

        // // print by foreach
        // for (Student std : group02) {
        // System.out.println(std);
        // }

        // System.out.println("\n=============students sorted===>");

        // // sort students by the age, then - by their IDs
        // Collections.sort(group02.getGroup());

        // // print by @override toString()
        // System.out.println(group02);

        // // streams formation
        // List<StudentGroup> listGroup = new ArrayList<StudentGroup>();
        // listGroup.add(group01);
        // listGroup.add(group03);
        // listGroup.add(group04);
        // StudentStream stream01 = new StudentStream(listGroup, 01);

        // listGroup = new ArrayList<StudentGroup>();
        // listGroup.add(group02);
        // StudentStream stream02 = new StudentStream(listGroup, 02);

        // System.out.println("\n====print groups of a stream===>");

        // // print by foreach
        // for (StudentGroup group : stream01) {
        // System.out.println(group);
        // }

        // System.out.println("\n==============groups sorted===>");

        // // sort groups by the number of students, then by group ID
        // Collections.sort(stream01.getStream());

        // // print by @override toString()
        // System.out.println(stream01);

        // // students
        // // Student s01 = new Student("Иван", 25, 121);
        // // Student s02 = new Student("Мария", 23, 301);

        // PersonComparator<Student> comS = new PersonComparator<Student>();
        // System.out.println(comS.compare(s01, s02));

        // employees
        Employee e01 = new Employee("Матвеич", 55, "грузчик");

        EmployeeService employees = new EmployeeService();

        employees.create(e01.getName(), e01.getAge(), e01.getPosition());
        employees.create("Гориллыч", 65, "разнорабочий");
        employees.create("Джоб", 30, "газонокосильщик");

        // employees.paySalary(e01);

        // teachers
        Teacher t01 = new Teacher("Семен Семеныч", 35, "кандидат наук");
        Teacher t02 = new Teacher("Лев Маргаритыч", 45, "доктор наук");

        TeacherService teachers = new TeacherService();
        teachers.create(t01.getName(), t01.getAge(), t01.getAcadDegree());
        teachers.create(t02.getName(), t02.getAge(), t02.getAcadDegree());
        teachers.create("Петя", 22, "магистр");
        teachers.create("Василий Петрович", 32, "кандидат наук");

        System.out.println("\n===========pay to professor===>");
        teachers.paySalary(t02);

        System.out.println("\n==========teachers unsorted===>");
        System.out.println(teachers);

        System.out.println("\n============teachers sorted===>");
        teachers.sortByFIO();
        System.out.println(teachers);

        // average age of teachers
        System.out.println("\nAverage age of teachers  = " + (new AverageAge<Teacher>()).getAveAge(teachers.getAll()));

        // average age of employees
        System.out.println("\n==========employees sorted===>");
        employees.sortByFIO();
        System.out.println(employees);
        System.out.println("\nAverage age of employees = " + (new AverageAge<Employee>()).getAveAge(employees.getAll()));

        // average age of students
        System.out.println(group02);
        System.out.println("\nAverage age of students = " + (new AverageAge<Student>()).getAveAge(group02.getGroup()));
    }
}
