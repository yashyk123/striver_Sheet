/*Problem Statement: A monkey is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas. An integer ‘h’ is also given, which denotes the time (in hours) for all the bananas to be eaten.

Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas. If the pile contains less than ‘k’ bananas, then the monkey consumes all the bananas and won’t eat any more bananas in that hour.

Find the minimum number of bananas ‘k’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours. */

public class MinRateToEatBanan {

    // Function to find maximum element in the array
    private static int findMax(int[] v) {
        int max = Integer.MIN_VALUE;
        int n = v.length;

        for(int i=0; i<n; i++)
        {
            max = Math.max(max, v[i]);
        }
        return max;
    }

    // Function to calculate total hours to eat all bananas at given rate
    private static int calculateTotalHours(int[] v, int hourly) {
       int totalHr=0;
        int n = v.length;

       for(int i=0; i<n;i++)
       {
        totalHr += Math.ceil((double)(v[i])/(double)(hourly));
       }
       return totalHr;
    }

    // Function to find minimum rate to eat all bananas in given hours
    public static int minimumRateToEatBananas(int []v, int h)
    {
        int max = findMax(v);

        for(int i=1;i<max; i++)
        {
            int reqTime = calculateTotalHours(v,i);
            if(reqTime<=h)
            {
                return i;
            }
        }
        return max;
    }
    

    // Function to find minimum rate using binary search
    public static int byBinarySearch(int[] v, int h) {
        int low =1, high = findMax(v);

        while(low<=high)
        {
            int mid = (low+high)/2;
            int reqTime = calculateTotalHours(v, mid);
            if(reqTime<=h){
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
        int[] v = {7, 15, 6, 3};
        int h = 8;
        System.out.println("By Liner search: "+minimumRateToEatBananas(v, h));
        System.out.println("By Binary search: "+byBinarySearch(v, h));
    }
}