import java.util.ArrayList;
import java.util.Arrays;

public class RearrangePosNegVal {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,-1,-2,3}, N = 6;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>(); 
        for(int i=0; i<N; i++)
        {
            if(arr[i]>0)
            {
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        System.out.println("Positive values: " + pos);
        System.out.println("Negative values: " + neg);
        for(int i=0; i<N/2; i++)
        {
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
            
        }
       System.out.println(Arrays.toString(arr));
    }
}
