package school.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory {
    private Map<String, List<String>> directory = new HashMap<>();
    private List<String> phoneNumber;

    public void add(String surname, String phoneNumber) {
        if (directory.containsKey(surname)) {
            this.phoneNumber = directory.get(surname);
            this.phoneNumber.add(phoneNumber);
            directory.put(surname, this.phoneNumber);
        } else {
            this.phoneNumber = new ArrayList<>();
            this.phoneNumber.add(phoneNumber);
            directory.put(surname, this.phoneNumber);
        }
    }

    public List<String> get(String surname) {
        return directory.get(surname);
    }
}
