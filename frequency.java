import java.util.HashMap;
import java.util.Map;

public class frequency {
    public static void main(String[] args) {
        String text = "The headphones were on. They had been utilized on purpose. She could hear her mom yelling in the background, but couldn't make out exactly what the yelling was about. That was exactly why she had put them on. She knew her mom would enter her room at any minute, and she could pretend that she hadn't heard any of the previous yelling.";

        // Normalize and split the text into words based on whitespace
        String[] words = text.toLowerCase().split("\\s+");

        // Create a HashMap to track word frequencies
        Map<String, Integer> wordFrequencies = new HashMap<>();
        for (String word : words) {
            // Skip punctuation and normalize word
            String normalizedWord = word.replaceAll("[^a-zA-Z]", "");

            if (!normalizedWord.isEmpty()) {
                // Update word frequency in the HashMap
                wordFrequencies.put(normalizedWord, wordFrequencies.getOrDefault(normalizedWord, 0) + 1);
            }
        }

        // Print word frequencies using the wordFrequencies HashMap
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
