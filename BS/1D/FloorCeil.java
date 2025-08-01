/*Problem Statement: You're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
The floor of x is the largest element in the array which is smaller than or equal to x.
The ceiling of x is the smallest element in the array greater than or equal to x. */

public class FloorCeil {

    // Helper class to store floor and ceil
    static class Result {
        int floor;
        int ceil;
        Result(int floor, int ceil) {
            this.floor = floor;
            this.ceil = ceil;
        }
    }

    public static Result floorCeil(int arr[], int x)
    {
        int start = 0, end = arr.length-1;
        int floor = -1, ceil = -1;

        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(arr[mid] <= x)
            {
                floor = arr[mid];
                start = mid + 1;
            }
            else
            {
                ceil = arr[mid];
                end = mid - 1;
            }
        }
        return new Result(floor, ceil);
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 4, 7, 8, 10}, x = 5;
        Result res = floorCeil(arr, x);
        System.out.println(res.floor + " "+ res.ceil);
    }
}
