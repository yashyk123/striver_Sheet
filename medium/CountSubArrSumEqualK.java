/*Problem Statement: Given an array of integers and an integer k, return the total number of subarrays whose sum equals k. */
public class CountSubArrSumEqualK {

    public static void findSumIndex(int array[], int n, int t)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                sum += array[j]; // sum = 0 + arrya[0] -> 0+3 ->3+1 ->4+2=6  | 0+2->2+4 =6

                if (sum == t) { //check if sum is equal to the target value

                    for (int k = i; k <= j; k++) { //print the array value which total sum is target
                        System.out.print(array[k] + " ");
                    }
                    System.out.println();
                    // System.out.println(i+" " +j);

                }
            }
            sum = 0;
        }
    }
    public static void main(String[] args) {
        int array[] = { 3, 1, 2, 4 };
        int n = array.length;
        int t = 6;
        
    }
}
