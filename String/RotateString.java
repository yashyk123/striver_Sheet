public class RotateString {

    public static boolean rotateString(String s, String goal) {
      StringBuilder result = new StringBuilder();
        int a = 0;
        if(s.length() != goal.length())
        {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                result.append(s.charAt(j));
            }
            for (int k = 0; k <= a; k++) {
                result.append(s.charAt(k));
            }
            a++;
            // Compare result with goal
            if (result.toString().equals(goal)) {
                return true;
            }
            result.delete(0, result.length());
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "bcdea";
       System.out.println( rotateString(s, goal));
    }
}
