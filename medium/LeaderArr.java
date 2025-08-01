/*Problem Statement: Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array. */
public class LeaderArr {

    public static void Leader(int arr[], int n)

    {
        for(int i = 0; i < n; i++) {
            boolean isLeader = true;
            for(int j = i + 1; j < n; j++) {

                // Check if the current element is greater than  elements to its left 
                // If any element to the right is greater than or equal to the current element, it is not a leader
                if(arr[j] >= arr[i]) {
                    isLeader = false;
                    break;
                }
            }

            // If no element to the right is greater than the current element, it is a leader
            if(isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={10, 22, 12, 3, 0, 6};

        int n = arr.length;
        // int max=0;
        // for(int i=0; i<n; i++)
        // {
            
        //         if(arr[i]> arr[i+1])
        //         {
        //             max = arr[i];
        //         }
        //         else 
        //         {
        //             continue;
        //         }
        //          System.out.println(max);
        // }

        
        
       
    }
}
