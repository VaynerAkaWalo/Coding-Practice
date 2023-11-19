package problems.leetcode.leetcode75.arraystring;

import java.util.ArrayDeque;
import java.util.Deque;


public class ReverseWordsInString {

    public String reverseWords(String s) {
        Deque<String> words = new ArrayDeque<>();

        String[] wordsArray = s.split("\\w+");
        for (String string : wordsArray) {
            words.push(string);
        }

        return String.join(" ", words).trim();
    }
}
