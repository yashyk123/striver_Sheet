/*Problem Statement: You are given an array of integers 'arr' and an integer i.e. a threshold value 'limit'. Your task is to find the smallest positive integer divisor, such that upon dividing all the elements of the given array by it, the sum of the division's result is less than or equal to the given threshold value.

Examples

Example 1:
Input Format: N = 5, arr[] = {1,2,3,4,5}, limit = 8
Result: 3
Explanation: We can get a sum of 15(1 + 2 + 3 + 4 + 5) if we choose 1 as a divisor. 
The sum is 9(1 + 1 + 2 + 2 + 3)  if we choose 2 as a divisor. Upon dividing all the elements of the array by 3, we get 1,1,1,2,2 respectively. Now, their sum is equal to 7 <= 8 i.e. the threshold value. So, 3 is the minimum possible answer. */
public class FindDevisor {
    // calculate the maximum element in the array
    public static int findMax(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    // find the minimum positive integer divisor
    public static int findDevisor(int arr[], int limit){
        
        int max = findMax(arr);
        for(int i=1; i<=max; i++)
        {
            int sum =0;
            for(int j=0; j<arr.length; j++)
            {
                sum += Math.ceil(arr[j]/i);
            }

            if(sum<=limit)
        {
            return i;
        }
        }
        return -1;
        
    }
/*****************************Binary Search Solution*************** */
    public static int calculateTarget(int arr[], int divisor){
        int target =0;
        for(int i=0; i<arr.length; i++)
        {
            target += Math.ceil((double)arr[i]/(double)divisor); // add double to handle decimal values
        }
        return target;
    }

    public static int byBinarySearch(int arr[], int limit)
    {
        int low = 1, high = findMax(arr);
        while(low<=high)
        {
            int mid = (low+high)/2;
            int target = calculateTarget(arr, mid);
            if(target<=limit)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,9};
        int limit = 6;
        System.out.println(findDevisor(arr, limit));
        System.out.println(byBinarySearch(arr, limit));
    }
}
