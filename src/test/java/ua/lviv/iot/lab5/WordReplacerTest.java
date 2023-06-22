package ua.lviv.iot.lab5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordReplacerTest {

    @Test
    public void changeLastLetterToUpperCaseSingleWord() {
        final WordReplacer word = new WordReplacer();
        String text = "test";
        String expected = "tesT";
        String result = word.changeLastLetterToUpperCase(text);
        assertEquals(expected, result);
    }

    @Test
    public void changeLastLetterToUpperCaseMultipleWords() {
        final WordReplacer word = new WordReplacer();
        String text = "test string for multiple words";
        String expected = "tesT strinG foR multiplE wordS";
        String result = word.changeLastLetterToUpperCase(text);
        assertEquals(expected, result);
    }

    @Test
    public void changeLastLetterToUpperCaseEmptyWords() {
        final WordReplacer word = new WordReplacer();
        String text = "";
        String expected = "";
        String result = word.changeLastLetterToUpperCase(text);
        assertEquals(expected, result);
    }
    @Test
    public void changeLastLetterToUpperTextWithPunctuations() {
        final WordReplacer word = new WordReplacer();
        String text = "Hello World! Fortunately, i won the lottery.";
        String expected = "HellO WorlD! FortunatelY, I woN thE lotterY.";
        String result = word.changeLastLetterToUpperCase(text);
        assertEquals(expected, result);
    }
}
