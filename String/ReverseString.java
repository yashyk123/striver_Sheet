import java.util.Arrays;
import java.util.Stack;

public class ReverseString {

    public static String reverseString(String s)
    {
        String a[] = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=a.length-1; i>=0; i--)
        {
            result.append(a[i]+ " ");// it will add space after the last word
        }
        //System.out.println(Arrays.toString(a));
       // System.out.println(result);
        return result.toString();
    }

    /*******By Using Stack *********/
    public static void revString(String s)
    {
        System.out.println("Before revers");
        System.out.println(s);

        String str ="";
        Stack<String> st = new Stack<>();

        // store the string value in the stack 
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                st.push(str);
                str="";
            }
            else{
                str += s.charAt(i);
            }
        }

        // access the stack value which in reverse form
        String ans = "";
        while(st.size() != 1)
        {
            ans += st.peek()+" ";
            st.pop();
        }
        // it will not add a space after the last word
        ans += st.peek(); //The last word should'nt have a space after it
        System.out.println("After reverse");
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s = "Yash Shankar Kore";
        s +=" "; // to add in stack 
        System.out.println(s.length());
        
        System.out.println(reverseString(s));;
        revString(s);

    }
}