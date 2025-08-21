public class MaximumDepthParanthesis {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int count =0;
        int maxCount = 0; //if the input is s = "abc", the loop will not update maxCount (since there are no parentheses), and the function will incorrectly return Integer.MIN_VALUE.
        char c []= s.toCharArray();
        for(int i=0; i<c.length; i++)
        {
            if(c[i] == '(')
            {
                count++;
                maxCount = Math.max(maxCount, count);
                
            }
            else if(c[i] == ')')
            {
                count--;
            }
        }
        return maxCount;
        
    }
}
