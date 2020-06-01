package LeetcodeMAYchallenge;

import java.util.HashMap;
import java.util.Map;

public class Leetcodemay31 {
	public int minDistance(String word1, String word2) {
        // top-down dp
        return topDown(word1, word2, word1.length(), word2.length());
    }

    Map<String, Integer> map = new HashMap();

    private int topDown(String word1, String word2, int i, int j) {
        if (i == 0) return j; // if word1 empty then we have to do Insert operation of all word2 remaining chars
        if (j == 0) return i; // if word2 empty then we have to do Delete operation of all word1 remaining chars
        String key = i + "$" + j;
        if (map.containsKey(key)) return map.get(key); // if already computed then return from map
        if (word1.charAt(i - 1) == word2.charAt(j - 1)) // if both words char same just reduce the problem size i-1, j-1
            map.put(key, topDown(word1, word2, i - 1, j - 1));
        else {
            // take min from all 3 allowed operations, Insert, Delete, Replace
            map.put(key, 1 + Math.min(topDown(word1, word2, i, j - 1),
                    Math.min(topDown(word1, word2, i - 1, j),
                            topDown(word1, word2, i - 1, j - 1))));
        }

        return map.get(key);
    }
}


