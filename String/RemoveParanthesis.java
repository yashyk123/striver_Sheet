public class RemoveParanthesis {

    public static String removeOuterParanthesis(String s)
     {
        // Initialize a StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        // Counter to track the nesting level of parentheses
        int counter = 0;

        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // 1. Increase counter for an opening parenthesis
                counter++;
                // 2. If counter > 1, this is not the outermost '(', so include it
                if (counter > 1) {
                    result.append(c);
                }
            } else {
                // 3. Decrease counter for a closing parenthesis
                counter--;
                // 4. If counter > 0, this is not the outermost ')', so include it
                if (counter > 0) {
                    result.append(c);
                }
            }
        }

        // 5. Return the final string with outermost parentheses removed
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "((()))";
        System.out.println(removeOuterParanthesis(s));;
    }
}