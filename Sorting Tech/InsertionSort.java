import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int a[])
{
    int n = a.length;
    // 1. Start with the second element (index 1) as the key.
    for(int i = 1; i < n; i++)
    {
        // 2. Select the key to be compared with previous elements.
        int key = a[i];
        // 3. Set j to the index of the element before the key.
        int j = i - 1;

        // 4. Compare key with previous elements; shift larger elements one position ahead.
        while(j >= 0 && a[j] > key)
        {
            // 5. Shift the larger element forward.
            a[j + 1] = a[j];
            // 6. Move to the previous element.
            j = j - 1;
        }

        // 7. Insert the key in its correct position.
        a[j + 1] = key;
    }
}

    public static void main(String[] args) {
        int arr[] = {2,5,1,10,4,0};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}