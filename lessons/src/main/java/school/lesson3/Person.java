package school.lesson3;

public class Person {
    String name;
    String position;
    String email;
    int phoneNumber;
    int salary;
    int age;

    public Person(String name, String position, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printPerson() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println();
    }
}