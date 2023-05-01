package ua.lviv.iot.lab5;

public class WordReplacer {
    public String changeLastLetterToUpperCase(String text) {
        String[] words = text.split("\\s+");
        final StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                int lastLetterPos = findLastLetterPositionInWord(word);
                if (lastLetterPos >= 0) {
                    char lastLetter = word.charAt(lastLetterPos);
                    char newLastLetter = Character.toUpperCase(lastLetter);
                    String newWord = word.substring(0, lastLetterPos) + newLastLetter + word.substring(lastLetterPos + 1);
                    result.append(newWord).append(" ");
                } else {
                    result.append(word).append(" ");
                }
            }
        }
        return result.toString().trim();
    }

    private int findLastLetterPositionInWord(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            if (Character.isLetter(c)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "my name is walter hartwell white. i live at 308 negra arroyo lane, albuquerque, new mexico. 87104. this is my confession.";
        WordReplacer word = new WordReplacer();
        String result = word.changeLastLetterToUpperCase(text);
        System.out.println(result);
    }
}
