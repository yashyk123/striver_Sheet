public class LongestCommonPrefix {
    // Function to find the longest common prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        int minlen = Integer.MAX_VALUE;
        for(String s : strs)
        {
            minlen = Math.min(minlen,s.length());
        }


        // this loop work for first string from string array
        for(int i=0; i<minlen; i++)
        {
            // store the first char of the first string from string array
            char c = strs[0].charAt(i);


            // this loop work from index 1 to last string of array
            for(int j=1; j<strs.length; j++)
            {
                // compare the char of the first string with rest of the string
                if(strs[j].charAt(i) != c)
                {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0].substring(0,minlen);
    }

    public static void main(String[] args) {
        String s[] = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(s);
        System.out.println("Longest Common Prefix: " + result);
    }
}