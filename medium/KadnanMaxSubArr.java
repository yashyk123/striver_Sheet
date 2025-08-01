public class KadnanMaxSubArr {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxsum= 0;

        for(int i=0; i<arr.length;i++)
        {
           
            for(int j =i+1; j<arr.length; j++)
            {
                 int sum =0;
                for(int k=i; k<=j; k++)
                {

                     sum +=arr[k];    
                }
                //System.out.println(sum);
                maxsum = Math.max(maxsum, sum);
                // sum = 0; // Reset sum for the next subarray
            }
            
        }
        System.out.println("Max sum of subarray: " + maxsum);

       
    }
    
}