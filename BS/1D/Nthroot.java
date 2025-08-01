/* Nth Root of a Number using Binary Search
 * Problem Statement: Given two numbers N and M, find the Nth root of M. The nth root of a number M is defined as a number X when raised to the power N equals M. If the 'nth root is not an integer, return -1.
 * 
 * Example 1:
Input Format: N = 3, M = 27
Result: 3
Explanation: The cube root of 27 is equal to 3.

Example 2:
Input Format: N = 4, M = 69
Result: -1
Explanation: The 4th root of 69 does not exist. So, the answer is -1.

*/

public class Nthroot {

    public static int findNthRoot(int n, int m)
    {
        for(int i=1; i<=m;i++)
        {
            long ans = funC(i,n);
            if(ans==(long)m) 
            {
                return i;
            }
            else if(ans>m)
            {
                break;
            }
        }
        return -1;
    }

    // Function to calculate nth root of a number 

    public static long funC(int i, int exp) {
        // TODO Auto-generated method stub
        long base = i;
        long result = 1;

        while(exp>0)
        {
            if(exp%2==1)
            {
                exp--;
                result *= base;
            }
            else
            {
                exp /=2;
                base *= base;
            }
        }
        return result;
    }


    // Function to find Nth root of a number using binary search 
    public static int byBS(int n, int m)
    {
        int low = 1, high = m;
        while(low<=high)
        {
            int mid = (low+high)/2;

            int value = findNthroot(mid,n,m);
            if (value == 1) {
                return mid;
            } else if (value == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        } 
        return -1;
    }

    public static int findNthroot(int mid, int n, int m) {
       int ans = 1;
       for (int i = 1; i <= n; i++) {
          ans = ans*mid;
          if(ans >m)
          {
            return 2;
          }
          else if(ans == m)
          {
            return 1;
          }
          else {
            return 0;
          }
       }
       return -1;
    }

    public static void main(String[] args) {
        int n = 4; int m = 81;
        int result = findNthRoot(n, m);
        System.out.println(result);

        // n = 4; m = 69;
        result = findNthRoot(n, m);
        System.out.println(result);
    }
}