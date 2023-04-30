package ua.lviv.iot.lab5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextTest {

    @Test
    public void testReplaceLastLettersSingleWord() {
        String text = "test";
        String expected = "tesT";
        String result = Text.replaceLastLetters(text);
        assertEquals(expected, result);
    }

    @Test
    public void testReplaceLastLettersMultipleWords() {
        String text = "test string for multiple words";
        String expected = "tesT strinG foR multiplE wordS";
        String result = Text.replaceLastLetters(text);
        assertEquals(expected, result);
    }

    @Test
    public void testReplaceLastLettersEmptyText() {
        String text = "";
        String expected = "";
        String result = Text.replaceLastLetters(text);
        assertEquals(expected, result);
    }
}
