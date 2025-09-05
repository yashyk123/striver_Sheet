public class LongestPalindromicString {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        
        String longestPalindrome = "";
        int maxlen = 0;

        for(int i=0; i<s.length(); i++)
        {
            for(int j=i; j<s.length(); j++)
            {
                String temp = s.substring(i, j+1);
                if(isPalindrom(temp))
                {
                    if(temp.length() > maxlen)
                    {
                        maxlen = temp.length();
                        longestPalindrome = temp;
                    }
                }
            }
        }
        return longestPalindrome;
    
    }

     private static boolean isPalindrom(String s)
     {
        int left =0;
        int right = s.length()-1;

        while(left<right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
     }
}
