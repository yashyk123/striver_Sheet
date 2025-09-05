public class PerfectSquare {

    public static void main(String[] args) {
        int num = 808201;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num)
    {
        int low=0, high=num/2;

        while(low<=high)
        {
            int mid = (low+high)/2;

            long result =(long) mid*mid;

            if(result == num)
            {
                return true;
            }
            else if(result < num)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return false;
    }
}