
//Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

import java.util.HashMap;
import java.util.Map.Entry;

public class Occurence {

    public static void byHashMap(int nums[], int n)
    {
          HashMap<Integer,Integer> map = new HashMap<>();
         for (int i : nums) {
            map.put(i,map.getOrDefault(i, 0)+1);
         }

         for(Entry<Integer,Integer> entry: map.entrySet())
         {
            System.out.println(entry.getKey() + " : " + entry.getValue());

            if(entry.getValue()>n/2)
            {
                System.out.println("Element that occurs more than N/2 times is: " + entry.getKey());
                return; // Exit after finding the first element that meets the condition
            }
         }
    }
    public static void main(String[] args) {
         int N = 7, nums[] = {2,2,1,1,1,2,2};
        byHashMap(nums, N);

       
    }
} 
