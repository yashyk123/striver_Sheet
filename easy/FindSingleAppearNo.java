import java.security.KeyStore.Entry;
import java.util.HashMap;

public class FindSingleAppearNo {

    public static void findSingleAppearNo(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the number that appears only once
        // for (Integer key : map.keySet()) {
        //     if (map.get(key) == 1) {
        //         System.out.println("The number that appears only once is: " + key);
        //         return; // Exit after finding the single appearance number
        //     }
        // }


        for(java.util.Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                System.out.println("The number that appears only once is: " + entry.getKey());
                return; // Exit after finding the single appearance number
            }
        }
        
        System.out.println("No number appears only once.");
    }

    public static void byBruteForce(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int count =0; 
            for(int j=0; j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println("The number that appears only once is: " + arr[i]);
                return; // Exit after finding the single appearance number
            }
        }
    }

    public static int  byXor(int arr[])
    {
        int xor = 0;
         for(int i : arr)
         {
            xor = xor ^ i;
         }
        return xor;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1, 4, 4};
         findSingleAppearNo(arr);
         byBruteForce(arr);

         int xorResult = byXor(arr);
            System.out.println("The number that appears only once using XOR is: " + xorResult);
        
    } 
}
