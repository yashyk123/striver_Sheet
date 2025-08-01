public class LongestSubArrLen {
    public static void main(String[] args) {
        int arr[] ={2,3,5};
        int n = arr.length;
        int k = 5;
        int maxLength = 0;
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            sum += arr[i];
            if(sum == k)
            {
                maxLength = Math.max(maxLength, i+1);
            }
        }
        System.out.println("Length of longest subarray with sum: " + maxLength);
    }
}
