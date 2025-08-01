/*Problem Statement: You are given an array of ‘N’ integers. You need to find the length of the longest sequence which contains the consecutive elements. */

import java.util.Arrays;

public class ConsucativeSeq {
    public static void main(String[] args) {
        int arr[] = { 3, 8, 5, 7, 6};
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n-1; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                count++;
            } 
        }
        System.out.println(count+1);
    }
}
