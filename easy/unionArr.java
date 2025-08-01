import java.util.HashSet;

public class unionArr {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,5,6,7};

        HashSet<Integer> unionSet = new HashSet<>();
        for (Integer integer : arr1) {
            unionSet.add(integer);
        }
         for (Integer integer : arr2) {
            unionSet.add(integer);
        }
        System.out.println("Union of arrays: " + unionSet);
    }
}
