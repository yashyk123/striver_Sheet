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
/*
 * Iteration 1

low = 1, high = 81.
Compute mid = (low + high) / 2 = (1 + 81) / 2 = 82 / 2 = 41.
Call findNthroot(41, 4, 81):

Initialize ans = 1.
Loop i from 1 to 4:

i = 1: ans = 1 * 41 = 41.
i = 2: ans = 41 * 41 = 1681.
Since 1681 > 81, return 2 (indicating mid^n > m).




In byBS, since value = 2, set high = mid - 1 = 41 - 1 = 40.


Iteration 2

low = 1, high = 40.
Compute mid = (1 + 40) / 2 = 41 / 2 = 20 (integer division).
Call findNthroot(20, 4, 81):

Initialize ans = 1.
Loop i from 1 to 4:

i = 1: ans = 1 * 20 = 20.
i = 2: ans = 20 * 20 = 400.
Since 400 > 81, return 2.




Since value = 2, set high = mid - 1 = 20 - 1 = 19.


Iteration 3

low = 1, high = 19.
Compute mid = (1 + 19) / 2 = 20 / 2 = 10.
Call findNthroot(10, 4, 81):

Initialize ans = 1.
Loop i from 1 to 4:

i = 1: ans = 1 * 10 = 10.
i = 2: ans = 10 * 10 = 100.
Since 100 > 81, return 2.




Since value = 2, set high = mid - 1 = 10 - 1 = 9.


Iteration 4

low = 1, high = 9.
Compute mid = (1 + 9) / 2 = 10 / 2 = 5.
Call findNthroot(5, 4, 81):

Initialize ans = 1.
Loop i from 1 to 4:

i = 1: ans = 1 * 5 = 5.
i = 2: ans = 5 * 5 = 25.
i = 3: ans = 25 * 5 = 125.
Since 125 > 81, return 2.




Since value = 2, set high = mid - 1 = 5 - 1 = 4.


Iteration 5

low = 1, high = 4.
Compute mid = (1 + 4) / 2 = 5 / 2 = 2 (integer division).
Call findNthroot(2, 4, 81):

Initialize ans = 1.
Loop i from 1 to 4:

i = 1: ans = 1 * 2 = 2.
i = 2: ans = 2 * 2 = 4.
i = 3: ans = 4 * 2 = 8.
i = 4: ans = 8 * 2 = 16.


After the loop, ans = 16. Since 16 < 81, return 0.


Since value = 0, set low = mid + 1 = 2 + 1 = 3.


Iteration 6

low = 3, high = 4.
Compute mid = (3 + 4) / 2 = 7 / 2 = 3.
Call findNthroot(3, 4, 81):

Initialize ans = 1.
Loop i from 1 to 4:

i = 1: ans = 1 * 3 = 3.
i = 2: ans = 3 * 3 = 9.
i = 3: ans = 9 * 3 = 27.
i = 4: ans = 27 * 3 = 81.


After the loop, ans = 81. Since 81 == 81, return 1.

In byBS, since value = 1, return mid = 3.
 */
    public static int findNthroot(int mid, int n, int m) {
       int ans = 1;
      for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }

    public static void main(String[] args) {
        int n = 4; int m = 81;
        int result = findNthRoot(n, m);
        System.out.println(result);

        // n = 4; m = 69;
        result = byBS(n, m);
        System.out.println(result);
    }
}