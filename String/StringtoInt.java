public class StringtoInt {
    public static void main(String[] args) {
    String s = " -042";
    System.out.println(myAtoi(s));;
    }

     public static int myAtoi(String s) {
       if (s == null || s.isEmpty()) return 0;

    int index = 0;
    int sign = 1;
    long result = 0;

    // Step 1: Ignore leading whitespace
    while (index < s.length() && s.charAt(index) == ' ') {
        index++;
    }

    // Step 2: Handle sign
    if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
        sign = s.charAt(index) == '+' ? 1 : -1;
        index++;
    }

    // Step 3: Read digits and convert
    while (index < s.length() && Character.isDigit(s.charAt(index))) {
        result = result * 10 + (s.charAt(index) - '0');
        index++;

        // Step 4: Check for overflow/underflow
        if (result * sign > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result * sign < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
    }

    // Return 0 if no digits were read
    if (index == 0 || (index == 1 && (s.charAt(0) == '+' || s.charAt(0) == '-'))) {
        return 0;
    }

    return (int) (result * sign);
    }
}
