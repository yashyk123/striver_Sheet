/*Search Single Element in a sorted array
 * Problem Statement: Given an array of N integers. Every number in the array except one appears twice. Find the single number in the array.
 * Example 1:
Input Format: arr[] = {1,1,2,2,3,3,4,5,5,6,6}
Result: 4
Explanation: Only the number 4 appears once in the array.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class FindeSinfgleOcc {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,5,5,6,6));

        byMap(arr);
        int asnByXOR = byXOR(arr);
        System.out.println("The single element by XOR is: "+asnByXOR);

        int res = byBS(list);
        System.out.println("The single element by BS is: "+res);
    
    }

    public static void byMap(int arr[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault( num, 0)+1);
        }
         System.out.println(map);

        // find number appears once in the array
        for (Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue()==1)
            {
                System.out.println("The single element by Hashap is: "+entry.getKey());
            }
        }
    }

    public static int byXOR(int arr[])
    {

        /*
         * 0^0 = 0 1^1 = 0 2^2=0 2^0=2 1^0=1
         */
        int ans =0;

        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static int byBS(ArrayList<Integer> list)
    {
        int n = list.size();

        if(n==1)
        {
            return list.get(0);
        }
        if(!list.get(0).equals(list.get(1)))
        {
            return list.get(0);
        }
        if(!list.get(n-1).equals(list.get(n-2)))
        {
            return list.get(n-1);
        }


        int low=0, high=n-1;
        while (low<=high) {
            int mid = (low+high)/2;

            // if mid value is single element
            if(!list.get(mid).equals(list.get(mid+1)) && !list.get(mid).equals(list.get(mid-1)))
            {
                return list.get(mid);
            }

            //we are in left
            if((mid%2 == 1 && list.get(mid).equals(list.get(mid-1))) ||(mid%2 == 0) && list.get(mid).equals(list.get(mid+1)))
            {
                //eliminate left half
                low = mid+1;
            }
            //we are in the right half
            else
            {
                //eliminate right half
                high=mid-1;
            }
        }
        return -1;
    }
}
