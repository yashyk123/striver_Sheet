public class missingNum {
    public static void main(String[] args) {
        int arr[] ={1,2,4};
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(arr[i]!=i+1)
            {
                System.out.println("Missing number is: " + (i+1));
               // return; // Exit after finding the missing number
            }
        }
    }
}
