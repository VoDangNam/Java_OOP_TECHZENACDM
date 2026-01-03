package lession09_SetAndMap.excercie.Set;

import java.util.HashMap;
import java.util.Map;

public class MapExcercie {
    public static void main(String[] args) {
        String text = "Nam là một sinh viên của Duy Tân, Nam sinh năm 2004";
        countString(text);
        String[] names = {
                "Nam", "An", "Bình", "Nam", "Hùng", "An", "Minh"
        };
        checkName(names);
    }

    public static void countString(String text) {
        String[] words = text.toLowerCase().split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);

            } else {
                wordCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }


    public static void checkName(String[] text) {

        Map<String, Integer> nameCount = new HashMap<>();

        for (String name : text) {
            name = name.toLowerCase();
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }
        System.out.println("Tên DUY NHẤT:");
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("\nTên BỊ TRÙNG:");
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + " lần)");
            }
        }
    }
}
