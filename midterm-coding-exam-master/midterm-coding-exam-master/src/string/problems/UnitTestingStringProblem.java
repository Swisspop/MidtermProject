package string.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTestingStringProblem {


    @Test
    void testIsAnagram() {
        String str1 = "CAT";
        String str2 = "ACT";
        assertTrue(Anagram.isAnagram(str1, str2), "Failed for " + str1 + " and " + str2);

    @Test
    public void testIsAnagramWithEmptyStrings() {
        assertTrue(Anagram.isAnagram("", ""));
        assertFalse(Anagram.isAnagram("", "A"));
        assertFalse(Anagram.isAnagram("A", ""));
    }




    @Test
    public void testFindTheLargestWord() {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = DetermineLargestWord.findTheLargestWord(s);

        assertEquals(10, (int)wordNLength.keySet().toArray()[wordNLength.size()-1]);
        assertEquals("biological", wordNLength.get(10));
    }


    @Test
    public void testIsPalindrome() {
        String str = "MADAM";
        assertTrue(Palindrome.isPalindrome(str));
    }


    @Test
    void testPermutation() {
        String expected = "ABC\nACB\nBAC\nBCA\nCAB\nCBA\n";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Permutation.permute("ABC", 0, 2);
        Assertions.assertEquals(expected, outContent.toString());
    }


}
