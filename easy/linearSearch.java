public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 3;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return; // Exit after finding the element
            }
        }
    }
}
