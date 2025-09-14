/* 169 most frequent element

 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
 */
import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int maxfreq =0;
        int mostFrequent = -1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > maxfreq)
            {
                maxfreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,4,2,2};
        System.out.println(majorityElement(nums));
    }
}
