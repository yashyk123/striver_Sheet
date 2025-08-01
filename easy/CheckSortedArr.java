public class CheckSortedArr {

    public static boolean isSorted(int arr[]) {


        //Check if there is no element in array or their is only 1 element in array so its already in sorted form
        if (arr == null || arr.length <= 1) {
            return true;
        }

        /*use single for loop and compair the current element and next to the current element if current element is 
        greater than next so it's not in sorte*/
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4 };
        int arr[] = {2,3,1,5,3,1};
        System.out.println(isSorted(arr));;
    }
}