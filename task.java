import java.util.HashSet;

public class task {
    public static void main(String[] args) {
        String text = "The headphones were on. They had been utilized on purpose. She could hear her mom yelling in the background, but couldn't make out exactly what the yelling was about. That was exactly why she had put them on. She knew her mom would enter her room at any minute, and she could pretend that she hadn't heard any of the previous yelling.";


        processTextStatistics(text);

        printWordFrequencies(text);
    }


    private static void processTextStatistics(String text) {
        String[] split_text = text.split("\\s+");

        HashSet<String> uniqueWords = new HashSet<>();
        HashSet<Character> uniqueCharacters = new HashSet<>();
        HashSet<String> sentences = new HashSet<>();

        System.out.println("Words:");
        for (String word : split_text) {
            System.out.println(word);

            uniqueWords.add(word.toLowerCase());

            for (char c : word.toCharArray()) {
                uniqueCharacters.add(c);
            }
        }

        int totalWords = split_text.length;
        System.out.println("Total Words: " + totalWords);

        int uniqueWordCount = uniqueWords.size();
        System.out.println("Unique Words: " + uniqueWordCount);

        int uniqueCharacterCount = uniqueCharacters.size();
        System.out.println("Unique Characters: " + uniqueCharacterCount);

        String[] split_sentences = text.split("\\.");
        for (String sentence : split_sentences) {
            if (!sentence.trim().isEmpty()) {
                sentences.add(sentence.trim());
            }
        }

        int totalSentences = sentences.size();
        System.out.println("Total Sentences: " + totalSentences);
    }


    private static void printWordFrequencies(String text) {
        String[] split_text = text.toLowerCase().split("\\s+");


        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : split_text) {
            uniqueWords.add(word);
        }


        System.out.println("Word Frequencies:");
        for (String uniqueWord : uniqueWords) {
            int frequency = countWordFrequency(text, uniqueWord);
            System.out.println(uniqueWord + ": " + frequency);
        }
    }


    private static int countWordFrequency(String text, String targetWord) {
        int frequency = 0;



        int index = text.toLowerCase().indexOf(targetWord);
        while (index != -1) {
            frequency++;
            index = text.toLowerCase().indexOf(targetWord, index + 1);
        }

        return frequency;
    }
}
