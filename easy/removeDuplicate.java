import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class removeDuplicate {

static void byHashSet(int arr[])
{
    // Using HashSet to remove duplicates
    // HashSet does not allow duplicate values, so it will only keep unique elements
    HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length;i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
}

static void byHashMap(int arr[])
{
    // Using HashMap to remove duplicates
    // HashMap allows us to store key-value pairs, where keys are unique
    // Here we use the element as key and a dummy value (1) as value
    // This way, we can keep track of unique elements
    HashMap<Integer,Integer> map = new HashMap<>();
        for (int key : arr) {
            map.put(key, map.getOrDefault(key, 1));
        }
        System.out.println(map.keySet());
}

    public static void main(String[] args) {
        int arr[] ={ 1,1,2,2,2,3,3,4,4,4};
        byHashSet(arr);
        byHashMap(arr);

    }
}