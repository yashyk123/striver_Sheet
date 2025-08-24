import java.util.ArrayList;

public class MinimumSizeArrSum {
    public static void main(String[] args) {
        int arr[] ={2,3,1,2,4,3};
        int target = 7;
        MinimumSizeArrSum result = new MinimumSizeArrSum();
       System.out.println( result.minSubArrayLen(target, arr));;
    }

     public int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            int sum =0;
            for(int j=i; j<nums.length; j++)
            {
                sum +=nums[j];
               if(sum>=target)
               {
                 minlen = Math.min(minlen, j-i+1);
                 break;
               }
               
            }
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}
