/*Problem Statement: You are given a sorted array containing N integers and a number X, you have to find the occurrences of X in the given array. */

public class CountOc {

    /*Using loop */
    public static int findOccurrence(int arr[], int x)
    {
        int count = 0;

        for(int i : arr)
        {
            if(i==x)
            {
                count++;
            }
        }
        return count;
    }


    /*Using Binary Search calculate first occurrence of value x */
    public static int firstOccurence(int arr[], int start, int end, int x)
    {
        
        int first =-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==x)
            {
                first=mid;
                end = mid-1;
            }
            else if(arr[mid]>x)
            {
                end = mid-1;
            }
            else
            {
                start=mid+1;
            }
            
        }
        return first; 
    }

     /*Using Binary Search calculate last occurrence of value x */
    public static int lastOccurance(int arr[],int start, int end, int x)
    {
        int last = -1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]== x)
            {
                last = mid;
                start = mid+1;
            }
            else if(arr[mid]>x)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
       return last;
    }

    /*Calculate Count */
    public static int[] firstAndLast(int arr[], int start,int end, int x)
    {
        int firstocc = firstOccurence(arr, start, end, x);
        if(firstocc==-1) return new int []{-1,-1};
        int lastocc = lastOccurance(arr, start, end, x);
        return new int[] {firstocc, lastocc};
    }

    public static int count(int arr[], int start,int end, int x)
    {
        int ans[] = firstAndLast(arr, start, end, x);
        if(ans[0]==-1)
        {
            return 0;
        }
        else
        {
            return (ans[1]-ans[0]+1);
        }
    }
    public static void main(String[] args) {
        int X = 3 , array[] = {2, 2 , 3 , 3 , 3 , 3 , 4};

        int start =0,end=array.length-1;
        int result = findOccurrence(array, X);
        System.out.println(result);

        int count = count(array, start, end, X);
        System.out.println(count);
        
    }
}