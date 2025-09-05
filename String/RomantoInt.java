public class RomantoInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
        
    }

    public static int romanToInt(String s) {
        // Define Roman numeral values
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int currentValue;
            
            // Map current character to its value
            if (c == 'M') currentValue = M;
            else if (c == 'D') currentValue = D;
            else if (c == 'C') currentValue = C;
            else if (c == 'L') currentValue = L;
            else if (c == 'X') currentValue = X;
            else if (c == 'V') currentValue = V;
            else currentValue = I;

            // Check if we need to subtract (current value < next value)
            if (i < s.length() - 1) {
                char next = s.charAt(i + 1);
                int nextValue;
                
                // Map next character to its value
                if (next == 'M') nextValue = M;
                else if (next == 'D') nextValue = D;
                else if (next == 'C') nextValue = C;
                else if (next == 'L') nextValue = L;
                else if (next == 'X') nextValue = X;
                else if (next == 'V') nextValue = V;
                else nextValue = I;

                // If current value is less than next value, subtract
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                // Last character is always added
                result += currentValue;
            }
        }
        return result;

    }
}
