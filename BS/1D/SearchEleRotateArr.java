/*Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values) and a target value k. Now the array is rotated at some pivot point unknown to you. Find the index at which k is present and if k is not present return -1. */

import java.util.ArrayList;
import java.util.Arrays;

public class SearchEleRotateArr {

    /*Using loop find index of k element */
    public static int findIndex(int arr[], int k, int n)
    {
        for(int i=0; i<n;i++)
        {
            if(arr[i]==k)
            {
                return i;
            }
        }
        return 0;
    }

    public static int findIndexByBS(ArrayList<Integer> arr, int k)
    {
        int start = 0; int end =arr.size()-1;
        
        while (start<=end) {
            int mid = (start+end)/2;
            if(arr.get(mid)==k){
                
                return mid;
            }

            if(arr.get(start)<=arr.get(mid))
            {
                if(arr.get(start)<=k && k <= arr.get(mid))
                {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr.get(mid)<=k && k<= arr.get(end))
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
                
            }
        }
        return -1;
        
    }

    /*Problem Statement: Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and a target value k. Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False.  
     * Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 3
    Result: True
    Explanation: The element 3 is present in the array. So, the answer is True.

    */
    public static boolean isValueInArr(ArrayList<Integer> arr, int k)
    {
        int start = 0; int end =arr.size()-1;
        boolean isthere = false;
        while (start<=end) {
            int mid = (start+end)/2;
            if(arr.get(mid)==k){
                isthere = true;
                return isthere;
            }

            if(arr.get(start)<=arr.get(mid))
            {
                if(arr.get(start)<=k && k <= arr.get(mid))
                {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr.get(mid)<=k && k<= arr.get(end))
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
                
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6}, n=arr.length, k = 0;
        int result = findIndex(arr, k, n);
        System.out.println(result);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 8, 1, 2, 3, 3, 3, 4, 5, 6));
        int ans = findIndexByBS(list, k);

        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);

        boolean a = isValueInArr(list, k);
        if (a == false)
            System.out.println("Target is not present." + a);
        else
            System.out.println("The target is present: " + a);
    }
}