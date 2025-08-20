import java.util.HashMap;

public class CheckAnagram {
    public static void main(String[] args) {
        String a = "RULES";
        String b = "LESRT ";

        // Create HashMaps to store character frequencies for both strings
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        // Count frequency of each character in string 'a'
        for(int i=0; i<a.length(); i++)
        {   
            map1.put(a.charAt(i), map1.getOrDefault(a.charAt(i), 0)+1);
        }

        // Print the frequency map for string 'a'
        System.out.println(map1);

        // For each character in string 'b', remove it from map1 if present
        for(int i=0; i<b.length(); i++)
        {   
            if(map1.containsKey(b.charAt(i)))
            {
                map1.remove(b.charAt(i));
            }
        }

        // Print the map after removals
        System.out.println(map1);

        // Check if map1 is empty (would be true if 'b' is an anagram of 'a')
        System.out.println(map1.isEmpty());
    }

}