import java.util.Arrays;

public class Selection {

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            int minIndex=i;

            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int arr[] = {10, 20, -2, 30, 40, 50,-5};
        selectionSort(arr);
    }
}