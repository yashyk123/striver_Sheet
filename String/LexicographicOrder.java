public class LexicographicOrder {

    public static void main(String[] args) {
        char[] store = {'c','d','e','f'};
        char target = 'c';
        System.out.println(findGreater(store,target));
    }

    public static char findGreater(char[] store, char target)
    {
        int low=0, high=store.length-1;
        char result = store[0];

        while(low<=high)
        {
            int mid = low+(high-low)/2;

            if(store[mid] > target)
            {
                result = store[mid];
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return result;
    }
}