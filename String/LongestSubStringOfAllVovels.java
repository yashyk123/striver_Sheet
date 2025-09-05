import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubStringOfAllVovels {

    public static void main(String[] args) {
        String s = "aeeeiiiioooauuuaeiou";
        LongestSubStringOfAllVovels obj = new LongestSubStringOfAllVovels();
        System.out.println(obj.longestBeautifulSubstring(s));
    }

    public int longestBeautifulSubstring(String word) {

        int n = word.length();
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = word.substring(i, j + 1);

                if (isValid(sub)) {
                    maxlen = Math.max(maxlen, sub.length());
                }
            }
            
        }
        return maxlen;
    }

    private static boolean isValid(String s) {
        String vowel = "aeiou";
        int idx = 0;

        for (char c : s.toCharArray()) {
            if (idx < 5 && c == vowel.charAt(idx)) {
                // move to next vowel when matched
            } else if (idx < 5 && idx > 0 && c == vowel.charAt(idx - 1)) {
                // same vowel, okay
            } else if (idx < 5 && c == vowel.charAt(idx + 1)) {
                idx++;
            } else {
                return false; // order breaks
            }
        }
        return idx == 4;
    }

}
