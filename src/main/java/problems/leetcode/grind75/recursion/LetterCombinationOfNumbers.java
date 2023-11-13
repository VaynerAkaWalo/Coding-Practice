package problems.leetcode.grind75.recursion;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfNumbers {

    Map<Character, List<Character>> map = Map.of(
            '2', List.of('a', 'b', 'c'),
            '3', List.of('d', 'e', 'f'),
            '4', List.of('g', 'h', 'i'),
            '5', List.of('j', 'k', 'l'),
            '6', List.of('m', 'n', 'o'),
            '7', List.of('p', 'q', 'r', 's'),
            '8', List.of('t', 'u', 'v'),
            '9', List.of('w', 'x', 'z', 'y')
    );

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return Collections.emptyList();
        List<String> result = new LinkedList<>();

        helper(result, new char[digits.length()], 0, digits);

        return result;
    }

    private void helper(List<String> result, char[] current, int index, String digits) {
        if (index == digits.length()) {
            result.add(new String(current));
            return;
        }

        char currentChar = digits.charAt(index);
        for (char c : map.get(currentChar)) {
            current[index] = c;

            helper(result, current, index + 1, digits);
        }
    }
}
