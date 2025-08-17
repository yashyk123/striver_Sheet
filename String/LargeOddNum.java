public class LargeOddNum {

    public static String largestOddNumber(String num) {
        // Traverse the string from right to left
        for (int i = num.length() - 1; i >= 0; i--) {
            // Convert the character to its numeric value
            int digit = num.charAt(i) - '0';
            // Check if the digit is odd
            if (digit % 2 != 0) {
                // Return the substring from start to i (inclusive)
                return num.substring(0, i + 1);
            }
        }
        // Return empty string if no odd digit is found
        return "";
    }

    public static void main(String[] args) {
        String s = "52";
        System.out.println(largestOddNumber(s));;
    }
}