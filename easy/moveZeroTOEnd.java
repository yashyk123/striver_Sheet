import java.util.Arrays;

public class moveZeroTOEnd {

    public static void moveZeros(int arr[])
    {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 0; // Count of non-zero elements

        // Count the number of zeroes in the array
        // This will help us to know how many elements we need to move to the end
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count++;
            }
        }

        System.out.println(count + " zeroes found in the array");

        // Move non-zero elements to the front of the array
        for(int i=0; i<arr.length-count; i++)
        {
            arr[i] = arr[i+count];
        }

        // Fill the end of the array with zeroes
        // After moving non-zero elements, we fill the remaining positions with zeroes
        for(int i=arr.length-count; i<arr.length; i++)
        {
            arr[i] = 0;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] byTwoPointers(int arr[]) {
        int n = arr.length;
        int j=0;

        for(int i=0; i<n;i++)
        {
            if(arr[i] == 0)
            {
                j=i;
                break;
            }
        }

        for(int i=j+1; i<n; i++)
         {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
                j++;
            }
         }
        return arr;
    }
    
    public static void main(String[] args) {
        int arr[] = { 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        System.out.println("Before moving zeroes to end:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }  
        System.out.println("\nAfter moving zeroes to end:");
        moveZeros(arr);

        System.out.println("\nUsing Two Pointers:");
        int[] result = byTwoPointers(arr);
        System.out.println(Arrays.toString(result));
    }
}