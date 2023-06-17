package lesson5;

public class Main {
    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
                30000, 30);
        persArray[1] = new Employee("Petrov Vlad", "Engineer", "petr@mailbox.com", "892545666",
                33000, 45);
        persArray[2] = new Employee("Solitin Dmitrii", "Engineer", "solo@mailbox.com", "892654289",
                40000, 32);
        persArray[3] = new Employee("Popova Polina", "Engineer", "joric@mailbox.com", "892542761",
                33000, 39);
        persArray[4] = new Employee("Romanov Igor", "Engineer", "5647883@mailbox.com", "890321457",
                35000, 25);

        for (Employee employee : persArray) {
             if (employee.age > 40)
            employee.printInfo();

        }
    }
}