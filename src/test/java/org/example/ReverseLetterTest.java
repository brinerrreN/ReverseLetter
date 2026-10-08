package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class ReverseLetterTest {

        @Test
        void reversesOnlyLetters() {
            assertEquals("t@eb eht av$J!123",
            ReverseLetter.reverseLetters("J@va the be$t!123"));
        }

        @Test
        void returnsEmptyForEmptyInput() {
            assertEquals("", ReverseLetter.reverseLetters(""));
        }

        @Test
        void returnsSameForSingleLetter() {
            assertEquals("a", ReverseLetter.reverseLetters("a"));
        }

        @Test
        void keepsNonLettersInPlace() {
            assertEquals("123 !@#", ReverseLetter.reverseLetters("123 !@#"));
        }

        @Test
        void reversesAllLetters() {
            assertEquals("dcba", ReverseLetter.reverseLetters("abcd"));
        }

        @Test
        void keepsSymbolsAtEdgesAndMiddle() {
            assertEquals("@ab!c#", ReverseLetter.reverseLetters("@cb!a#"));
        }

        @Test
        void preservesCaseWhenSwapping() {
            assertEquals("AbCd", ReverseLetter.reverseLetters("dCbA"));
        }

        @Test
        void returnsNullForNullInput() {
            assertNull(ReverseLetter.reverseLetters(null));
        }
}
