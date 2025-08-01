/*Problem Statement: You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target value in the array. */

public class SearchInsertPos {
    public static int Search(int arr[], int start, int end, int x) {
        int ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 9 }, x = 6;
        int start = 0, end = arr.length - 1;
        // for(int i=0; i<arr.length; i++)
        // {
        // if(arr[i]>x)
        // {
        // System.out.println(i);
        // break;
        // }
        // }

        int result = Search(arr, start, end, x);
        System.out.println(result);
    }
}