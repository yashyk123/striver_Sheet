/*Finding Sqrt of a number using Binary Search
 * Problem Statement: You are given a positive integer n. Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of 'sqrt(n)'.
 */
public class FindSqrt {

    public int findSqrt(int n)
    {
        int low = 1, high = n;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int value = mid*mid;
            if(value<=n)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int n= 36;
        FindSqrt sqrt = new FindSqrt();
        System.out.println(sqrt.findSqrt(n));
    }
}
