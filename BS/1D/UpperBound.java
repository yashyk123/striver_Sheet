/*Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.
 * What is Upper Bound?
The upper bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than the given key i.e. x.

The upper bound is the smallest index, ind, where arr[ind] > x.
 */

public class UpperBound {
    public static void main(String[] args) {
        int arr[] = {3,5,8,9,15,19}, x = 9, n = arr.length;
        int start =0, end = n-1;
        upperBbyloop(arr, x, n);
        upperBoundByWhile(arr, start, end, x);


    }

    public static void upperBbyloop(int arr[], int x, int n)
    {
        for(int i=0; i<n; i++)
        {
            if(arr[i]>x)
            {
                System.out.println(arr[i]);
                break; // Print the first element greater than x
            }
        }
    }

    public static void upperBoundByWhile(int arr[], int start, int end, int x)
    {
        int ans = 0;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(arr[mid] > x)
            {
                ans = arr[mid]
;                end = mid - 1; // Move to the left half to find a smaller index
            }
            else 
            {
                start = mid + 1; // Move to the right half
            }
        }2
        System.out.println("Upper bound of " + x + " is: " + ans);
    }
}
