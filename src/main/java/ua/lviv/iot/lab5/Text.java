package ua.lviv.iot.lab5;

import java.util.Scanner;

public class Text {
    public static String replaceLastLetters(String text) {
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                String newWord = word.substring(0, word.length()-1) + Character.toUpperCase(word.charAt(word.length()-1));
                result.append(newWord).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        scanner.close();

        String result = replaceLastLetters(text);
        System.out.println(result);
    }
}
