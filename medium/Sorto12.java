import java.util.Arrays;
import java.util.HashMap;

public class Sorto12 {

    public static void sort012(int arr[],int n) {
         int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0; i<n; i++)
        {
            if(arr[i]==0)
            {
                count0++;
            }
            else if(arr[i]==1)
            {
                count1++;
            }
            else if(arr[i]==2)
            {
                count2++;
            }
        }
        System.out.println("Count of 0s: " + count0);
        System.out.println("Count of 1s: " + count1);
        System.out.println("Count of 2s: " + count2);
        for(int i=0; i<n; i++)
        {
            if(i<count0)
            {
                arr[i]=0;
            }
            else if(i<count0+count1)
            {
                arr[i]=1;
            }
            else
            {
                arr[i]=2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void byHashMap(int arr[], int n) {
        // Using the count method
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
       System.out.println("Map: " + map.get(1));

       // Using the map to sort the array
       for(int i=0; i<n; i++)
       {
        if(i<map.get(0))
        {
            arr[i] = 0;
        } else if(i < map.get(0) + map.get(1)) {
            arr[i] = 1;
        } else {
            arr[i] = 2;
        }
       }
       System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,0,0,2,2};
        int n = arr.length;

       
       
    }
}
