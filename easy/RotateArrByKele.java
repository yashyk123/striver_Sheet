/*Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

Examples:

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position. */

public class RotateArrByKele {

    static void right(int arr[], int k)
    {
        int end[] = new int[k];
        int a = arr.length-k;
        for(int i=0; i<k; i++)
        {
            end[i]= arr[a];
            System.out.println(end[i]);
            a++;
        }

        int start[] = new int[arr.length];
        a =0;
        for(int i=k; i<arr.length; i++)
        {
            start[i]=arr[a];
            a++;
        }

        for(int i=0; i<k; i++)
        {
            start[i]=end[i];
        }

       for (int i : start) {
          System.out.print(i);
       }

    }

    static void left(int arr[], int k,int n)
    {
        int temp[] = new int[k];

    // store first element in temp
        for(int i=0; i<k; i++)
        {
            temp[i]=arr[i];
        }

        //shift i+k element to i 
        for(int i=0; i<n-k;i++)
        {
            arr[i]=arr[i+k];
        }

        // add temp element in arr
        for(int i=n-k; i<n; i++)
        {
            arr[i]= temp[i-n+k];
        }

    }



public static void reverse(int arr[], int start, int end)
{
    while (start<=end) {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]= temp;
        start++;
        end--;
    }
}

    static void revleft(int arr[],int n, int k)
    {
        // reverse first k element
        reverse(arr, 0, k-1);
        
        // reverse from k to last element
        reverse(arr, k, n-1);

        // reverse all element
        reverse(arr, 0, n-1);

    }


    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        int k=2;
        int n =7;
       // right(array, k);
       //revleft(array, n, k);

      // left(array, k, n);
      
       for (int i : array) {
        System.out.print(i + " ");
       }
    }
}
