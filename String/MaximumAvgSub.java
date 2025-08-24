public class MaximumAvgSub {

    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));;
    }

     public static double findMaxAverage(int[] nums, int k) {
        
        double sum =0;
        double max = 0;

        //calculate sum of first k element
        for(int i=0; i<k; i++)
        {
             sum+=nums[i];
        }

        max = sum;
        for(int i=k; i<nums.length; i++)
        {
            // add new element and remove first element
            sum = sum + nums[i] - nums[i-k];

            max = Math.max(max, sum);
        }
        return max/k;
    }
}