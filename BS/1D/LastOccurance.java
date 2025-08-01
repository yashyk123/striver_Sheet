/*Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key. If the target is not found then return -1. */

public class LastOccurance {

    public static void main(String[] args) {
        int target=20, array[] = {3,4,13,13,13,20,20,40};
        int start =0, end = array.length-1;
        int ans = 0;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(array[mid]==target)
            {
                ans = mid;
                start = mid+1;
            }
            else if(array[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        System.out.println(ans);
    }
}