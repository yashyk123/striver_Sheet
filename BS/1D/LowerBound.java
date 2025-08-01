/*Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.
 * What is Lower Bound?
The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.

The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.
 */

 public class LowerBound {
 
    public static void main(String[] args) {
        int arr[] ={3,5,8,15,19}; int x = 9; int n = arr.length;
        int start =0, end = n-1;


        /****** by recursion ******/
        // int result = lowerBound(arr, start, end, x);
        // if(result == -1)
        // {
        //     System.out.println("Lower bound not found");
        // }
        // else
        // {
        //     System.out.println("Lower bound of " + x + " is: " + result);
        // }
  

        /****** by while ******/
       
        lowerB(arr, start, end, x);
        
    }

    public static void lowerB(int arr[], int start, int end, int x) {
        int ans = 0;
       while(start <= end)
        {
            
            int mid = (start+end)/2;
            if(arr[mid] >=x)
            {
                ans = arr[mid];
                end = mid-1; // Move to the left half to find a smaller index
            }
            else 
            {
                start = mid+1;
            }
            
        }
       System.out.println("Lower bound of " + x + " is: " + ans);
    }


 // Recursive approach to find lower bound
    private static int lowerBound(int[] arr, int start, int end, int x) {
        if(start > end)
        {
            return -1; // Lower bound not found
        }
        int mid = (start+end)/2;

        if(arr[mid] >= x) 
        {

            return arr[mid];

        }
        else if(arr[mid]<x)
        {
            return lowerBound(arr, mid+1, end, x);
        }
        else
        {
            return lowerBound(arr, start, mid-1, x);
        }
    }
 }