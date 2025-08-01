public class LongestSubArrSum {

    public static void byBruteForce(int arr[], int n, int k)
    {
        int maxLength =0;

        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                int sum =0;
                for(int m=i; m<=j; m++)
                {
                    sum +=arr[m];
                }

                if(sum ==k)
                {
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        System.out.println(maxLength);
    }

    public static void byOneLoop(int arr[],int n,int k)
    {
        int maxLength =0;
        int sum =0;
        
        for(int i=0; i<n; i++)
        {
            sum +=arr[i];
            if(sum==k)
            {
                maxLength = Math.max(maxLength, i+1);
            }
        }
        System.out.println("Length of longest subarray with sum: " + maxLength);
    }
    public static void main(String[] args) {
        int arr[] ={2,3,3,2,1,9};
        int n = arr.length;
        
        int k= 10;
        byOneLoop(arr, n, k);

        byBruteForce(arr, n, k);
    }
}
