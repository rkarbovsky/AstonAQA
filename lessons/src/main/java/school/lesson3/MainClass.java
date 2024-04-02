package school.lesson3;

public class MainClass {
    public static void main(String[] args) {

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Mike Jordan", "Owner", "mike@mailbox.com",
                5557686, 12000, 35);
        personArray[1] = new Person("Sarah Connor", "QA", "jhooon@mailbox.com",
                5552122, 10000, 26);
        personArray[2] = new Person("Ryan Gosling", "Driver", "driver2049@mailbox.com",
                5554633, 13500, 44);
        personArray[3] = new Person("Robert Downey Jr.", "Iron Man", "tonystark@mailbox.com",
                5558486, 16000, 35);
        personArray[4] = new Person("Jason Statham", "Transporter", "frank@mailbox.com",
                5552082, 18000, 56);

        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].age > 40) {
                personArray[i].printPerson();
            }

        }
    }
}