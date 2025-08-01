import java.util.HashMap;

public class TwoSum {

    public static void byBruteForce(int arr[], int target,int n)
    {
        boolean found = false;

        for(int i=0; i<n; i++)
        {
            int sum = 0;
            for(int j=i+1; j<n; j++)
            {
                sum = arr[i]+arr[j];
                if(sum == target)
                {
                    found = true;
                    System.out.println(found);
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = "+ sum);
                    System.out.println("Indices: " + i + " and " + j);
                    return; // Exit after finding the first pair
                }
            }
        }
    }

    public static String ByHashMap(int arr[], int target, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            int num = arr[i];
            int moreEle = target-num;
            if(map.containsKey(moreEle))
            {
                return "Pair found: " + moreEle + " + " + num + " = " + target + "\nIndices: " + map.get(moreEle) + " and " + i;
            }
            map.put(num, i);
        }
        return "No pair found";
    }
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target = 14;
        int n = arr.length;
        //byBruteForce(arr, target, n);
        String result = ByHashMap(arr, target, n);
        System.out.println(result);
        

          
    

    }
}
