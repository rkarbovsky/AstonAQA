package school.lesson6;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();

        directory.add("Иванов", "375441730934");
        directory.add("Родина", "375446474317");
        directory.add("Васильев", "375449242461");
        directory.add("Уваров", "375445842392");
        directory.add("Рябова", "375446565813");
        directory.add("Иванов", "375445009281");
        directory.add("Иванова", "375299232114");
        directory.add("Васильев", "375330694256");
        directory.add("Васильев", "375335162049");

        System.out.println(directory.get("Иванов"));
        System.out.println(directory.get("Уваров"));
        System.out.println(directory.get("Васильев"));
        System.out.println(directory.get("Рябова"));
    }
}
