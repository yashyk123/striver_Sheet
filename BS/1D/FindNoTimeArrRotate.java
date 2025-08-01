/*Find out how many times the array has been rotated
 * Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values). Now the array is rotated between 1 to N times which is unknown. Find how many times the array has been rotated
 * 
 * Example 1:
Input Format: arr = [4,5,6,7,0,1,2,3]
Result: 4
Explanation: The original array should be [0,1,2,3,4,5,6,7]. So, we can notice that the array has been rotated 4 times.
 */
public class FindNoTimeArrRotate {

    public static void main(String[] args) {
          int arr[] = {4,5,6,7,0,1,2,3};
          int result = findMinIndex(arr);
          System.out.println(result);

          int res = findMinIndexByBS(arr);
          System.out.println(res);
    }

    public static int findMinIndex(int arr[])
    {
        int n = arr.length;
        int index= -1;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<ans)
            {
                index = i;
                ans = arr[i];
            }
        }
        return index;
    }

    public static int findMinIndexByBS(int arr[])
    {
        int low = 0, high= arr.length-1, index=-1,ans= Integer.MAX_VALUE;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(arr[low]<=arr[high])
            {
                if(arr[low]<ans)
                {
                    index=low;
                    ans=arr[low];
                }
                break;
            }

            
            if(arr[low]<=arr[mid])
            {
                if(arr[low]<=ans)
                {
                    index=low;
                    ans=arr[low];
                }
                low = mid+1;
            }
            else
            {
                if(arr[mid]<=ans)
                {
                    index=mid;
                    ans = arr[mid];
                }
                high =mid-1;
            }

        }
        return index;
    }
  
}
