package school.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Апельсин");
        words.add("Груша");
        words.add("Яблоко");
        words.add("Яблоко");
        words.add("Банан");
        words.add("Кокос");
        words.add("Яблоко");
        words.add("Лимон");
        words.add("Апельсин");
        words.add("Мандарин");
        words.add("Черешня");
        words.add("Виноград");
        words.add("Персик");
        words.add("Арбуз");
        words.add("Яблоко");
        words.add("Клубника");

        HashSet<String> unique = new HashSet<>(words);
        System.out.println("Уникальные значения: " + unique);

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word) + 1;
                wordCount.put(word, count);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
