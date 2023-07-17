// Single responsibility principle - принцип единственной ответственности
// У класса есть одно предназначение

import java.util.Date;

public class Task01_SRP {
    public static void main(String[] args) {

        Employee emp = new Employee("Petrovich", null, 30000);

        System.out.println("Base salary " + emp.getBaseSalary() + " -> net salary "
                + new Salary(emp.getBaseSalary()).calculateNetSalary());

    }
}

// Думаю, информация о базовой з/п должна храниться не здесь, а в отдельной БД
// (типа 1C), и извлекаться по ID сотрудника, но в рамках данной задачи
// baseSalary (ставка) - часть личной информации сотрудника
class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }

}

class Salary {
    private int baseSalary;

    public Salary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }

}