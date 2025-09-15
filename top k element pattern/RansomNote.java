/*
 * 383. Ransom Note
 * 
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 
 */

import java.util.HashMap;

public class RansomNote {
     public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> fre1 = buildFre(ransomNote);
        HashMap<Character, Integer> fre2 = buildFre(magazine);
        
       for (char c : fre1.keySet()) {
            int count1 = fre1.get(c);
            int count2 = fre2.getOrDefault(c, 0);

            // System.out.println(count1);
            // System.out.println(count2);
            if(count1 > count2)
            {
                return false;
            }
       }
       return true;
    }
    public static HashMap<Character, Integer> buildFre(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";

        System.out.println(canConstruct(ransomNote, magazine));
        //System.out.println(buildFre(magazine));

    }
    



}
