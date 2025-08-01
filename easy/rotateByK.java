public class rotateByK {

    static void rightRotate(int arr[],int n, int k)
    {
        int temp[] = new int[n];
        int start[] = new int[n];


        // store element in temp[] from n-k+i index to k
        for(int i=0; i<k; i++)
        {
            temp[i] = arr[n-k+i];
        }

        // store the staring element in start[] from 0 index to n-k
        for(int i=0;i<n-k;i++)
        {
            start[i] =arr[i];
        }

        // add temp[] into original arr[]
        for(int i=0; i<k; i++)
        {
            arr[i] = temp[i];
        }

        // add start[] into original arr[]
        for(int i=0; i<n-k; i++)
        {
            arr[i+k]= start[i];
        }

        // print arr
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]  + " ");
        }
    }

    public static void revese(int arr[], int start , int end)
    {
        while(start <= end)
        {
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateR(int arr[], int n, int k)
    {
        // rotate from 0 index to n-k-1
        revese(arr, 0, n-k-1);

        // rotate from n-k to last
        revese(arr, n-k, n-1);

        // rotate hole arr
        revese(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7}; //Output: 6 7 1 2 3 4 5
        int k=2;
        int n = arr.length;
        //rightRotate(arr, n, k);

        rotateR(arr, n, k);
        System.out.println("After Rotating");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]  + " ");
        }
        
        
    }
}
