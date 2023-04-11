package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        int maxLength = 0;
        String longestWord = "";
        for(Map.Entry<Integer, String> entry : wordNLength.entrySet()){
            if(entry.getKey() > maxLength){
                maxLength = entry.getKey();
                longestWord = entry.getValue();
            }
        }
        System.out.println(maxLength + " " + longestWord);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String[] words = wordGiven.split(" ");
        for(String word : words){
            map.put(word.length(), word);
        }
        return map;
    }
}
