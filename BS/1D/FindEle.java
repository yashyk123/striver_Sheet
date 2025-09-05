/*Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values). Now the array is rotated between 1 to N times which is unknown. Find the minimum element in the array.  */

public class FindEle {

    public static int findmin(int arr[], int n) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void findMinByBS(int arr[]) {
        int start = 0, end = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;

            // if left part is sorted:
            if (arr[start] < arr[mid]) {
                // keep the minimum:
                min = Math.min(arr[start], min);
                // Eliminate left half:
                start = mid + 1;
            } else {// if right part is sorted:
                    // keep the minimum:
                min = Math.min(arr[end], min);

                // Eliminate right half:
                end = mid - 1;
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 1, 2, 3 };
        int n = arr.length;
        int result = findmin(arr, n);
        System.out.println(result);
        findMinByBS(arr);
    }
}