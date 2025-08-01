/*Problem statement: You are given a sorted array of integers and a target, your task is to search for the target in the given array. Assume the given array does not contain any duplicate numbers. */

public class FindTarget {
    public static int FindTarget(int arr[], int start, int end,int target)
    {
        if(start > end)
        {
            return -1; // Target not found
        }
        int mid = (start + end )/2;
        if(arr[mid] == target)
        {
            return mid; // Target found
        }

        else if(arr[mid]< target)
        {
            return FindTarget(arr,start+1,end, target); // Search in the right half
        }
        else
        {
            return FindTarget(arr,start, end-1,target); // Search in the left half
        }

    }
    

    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 9;
        int n = arr.length;
        int start =0;
        int end = n-1;
        int result = FindTarget(arr, start, end, target);
        if(result == -1)
        {
            System.out.println("Target not found");
        }
        else
        {
            System.out.println("Target found at index: " + result);
        }
    
    }
}