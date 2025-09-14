import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKelement {

     public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(map, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());

        maxHeap.addAll(map.entrySet());

        int result[] = new int[k];

        for(int i=0; i<k; i++)
        {
            result[i] = maxHeap.poll().getKey();
        }

        return result;
     }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3}; 
        int k = 2;
       System.out.println(Arrays.toString( topKFrequent(nums, k)));;

    }
}
