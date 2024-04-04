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

        Park.Attraction[] attractions = new Park.Attraction[3];
        attractions[0] = new Park.Attraction("Автодром", "08:00 - 16:00", 150);
        attractions[1] = new Park.Attraction("НЛО", "09:00 - 17:00", 210);
        attractions[2] = new Park.Attraction("Супернова", "09:00 - 16:30", 130);

        for (int i = 0; i < attractions.length; i++) {
            System.out.println("Аттракцион " + attractions[i].nameAttraction);
            System.out.println("Время работы: " + attractions[i].workHours);
            System.out.println("Стоимость билета: " + attractions[i].cost);
            System.out.println("-------------");
        }
    }
}