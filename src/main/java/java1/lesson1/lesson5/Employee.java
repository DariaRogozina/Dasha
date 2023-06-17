package lesson5;

public class Employee {
    String name;
    String position;
    String email;
    String phonenumber;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phonenumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }

void printInfo() {
    System.out.println(String.format("ФИО сотрудника: %s\n Должность: %s\n Email: %s\n Номер телефона: %s\n  Зарплата %s\n Возраст: %s\n", name, position, email, phonenumber, salary, age));
}
}
