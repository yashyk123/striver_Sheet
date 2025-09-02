import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SubsetWitoutDup {
   
    public static void main(String [] args)
    {
    int nums[] = {1,2,2};
    System.out.println(setWithoutDuplicate(nums));
    }

    public static List<List<Integer>> setWithoutDuplicate(int [] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>()); //add empty array

        int start , end=0;

        for(int i=0; i<nums.length; i++)
        {
            start =0;

            // Step 2: if current num == previous num → only use subsets created in last round
            if(i>0 && nums[i]==nums[i-1])
            {
                start = end+1;
            }
            end = res.size()-1;

            int resSize = res.size();

            for(int j=start; j<resSize; j++)
            {
                List<Integer> copy = new ArrayList<>(res.get(j));
                copy.add(nums[i]);
                res.add(copy);
            }
        }
        return res;
        
    }
}