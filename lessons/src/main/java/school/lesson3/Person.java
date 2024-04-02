package school.lesson3;

public class Person {
    String name;
    String position;
    String email;
    int phoneNumber;
    int salary;
    int age;

    // constructor
    public Person (String _name, String _position, String _email, int _phoneNumber, int _salary, int _age) {
        name = _name;
        position = _position;
        email = _email;
        phoneNumber = _phoneNumber;
        salary = _salary;
        age = _age;
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