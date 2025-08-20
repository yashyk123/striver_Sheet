import java.util.ArrayList;
import java.util.HashMap;

public class SortByFreq {
    // Function to sort characters in a string by their frequency in descending order
    public static String sortbyFreq(String s)
    {
        // Create a HashMap to store frequency of each character
        HashMap<Character,Integer> map = new HashMap<>();

        // Count frequency of each character in the string
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        //keyset return the value of map holding
        System.out.println("KeySet() :"+ map.keySet());
        // Create a list of unique characters from the map
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        // Sort the list based on frequency in descending order
        list.sort((a,b) -> map.get(b)- map.get(a));

        System.out.println("List :"+ list);

        StringBuilder result = new StringBuilder();
        // Build the result string by appending each character by its frequency
        for(char c : list)
        {
            int frq = map.get(c);
            for(int i=0; i<frq; i++)
            {
                result.append(c);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        // Print the string sorted by character frequency
        System.out.println(sortbyFreq(s));
    }
}