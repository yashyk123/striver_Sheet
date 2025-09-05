import java.util.ArrayList;
import java.util.Arrays;
public class KthMissNo {
public static void findKthMissing(ArrayList<Integer> list, int k) {
    int n  = list.size();
    int max = Integer.MIN_VALUE;
    for(int i=0; i<n; i++) {
        max = Math.max(max, list.get(i));
    }

    ArrayList<Integer> temp = new ArrayList<>();

    for(int i=0; i<=max; i++) {
        if(!list.contains(i)) {
            temp.add(i);
        }
    }

 System.out.println(temp.get(k));

}
    public static void main(String[] args) {
        ArrayList<Integer> vec = new ArrayList<>(Arrays.asList(4,7,9,10));
        int k=4;
        findKthMissing(vec, k);
    }
}
