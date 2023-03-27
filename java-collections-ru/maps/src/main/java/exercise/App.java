package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String s : words) {
            if (!wordCount.containsKey(s)) {
                wordCount.put(s, 1);
            } else {
                int currVal = wordCount.get(s);
                wordCount.put(s, currVal + 1);
            }
        }

        if (words.length == 1) {
            wordCount.clear();
        }

        return wordCount;
    }

    public static String toString(Map<String, Integer> words) {
        String result = "{";

        for (Map.Entry<String, Integer> word : words.entrySet()) {
            result = result + "\n" + "  " + word.getKey() + ": " + word.getValue();
        }

        if (words.size() == 0) {
            result = result + "}";
        } else {
            result = result + "\n}";
        }

        return result;
    }
}
//END
