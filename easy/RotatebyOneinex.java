/*Problem Statement: Given an array of N integers, left rotate the array by one place.

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
Explanation: 
Since all the elements in array will be shifted 
toward left by one so ‘2’ will now become the 
first index and and ‘1’ which was present at 
first index will be shifted at last.*/


public class RotatebyOneinex {

 static void rotate(int arr[])
    {
      int temp = arr[0];
      
      for(int i=0; i<arr.length-1; i++)
      {
        arr[i] = arr[i+1];
      }
      arr[arr.length-1] = temp;

       for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static void withoutStoringFrist(int array[])
    {
      for(int i=0; i<array.length-1; i++)
        {

                int temp = array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            
        }

        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();

        // for(int i=0; i<array.length; i++)
        // {
        //     System.out.println(array[i]);
        // }

    }
    public static void main(String[] args) {
        int array[]= {1,2,3,4,5};

        //rotate(array);
        withoutStoringFrist(array);

        
        
    }
}