public class MaximumOnes {

    public static int maxConsecutiveOnes(int[] arr) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0; // Reset count when a 0 is encountered
            }
        }
        // Final check in case the array ends with 1s
        maxCount = Math.max(maxCount, count);

        return maxCount;
    }

    public static void main(String[] args) {
        int ar[] = {1, 1, 0, 1, 1, 1};
        int result = maxConsecutiveOnes(ar);
        System.out.println("Maximum consecutive ones: " + result);
    }
}