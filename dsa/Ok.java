package dsa;

import java.util.Stack;

public class Ok {
    
    public static void main(String[] args) {
        String s = "(a-b/c)*(a/k-l)";
        System.out.println(convertToPrefix(s));
    }

    public static String reverse(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static String  convertToPrefix(String s)
    {
       s= reverse(s);
        int i=0;
        String ans="";
        Stack <Character> st=new Stack<>();
        
        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'|| ch>='a' && ch<='z'|| ch>='0' && ch<='9')
            ans+=ch;
            else if (ch=='(')
            st.push(ch);
            else if(ch==')')
            {
                while(!st.isEmpty() && st.peek()!='(')
                ans+=st.pop();
                st.pop();
          }
            else{
                while(!st.isEmpty() && priority(ch)>=priority(st.peek()))
                st.push(ch);
                
                while(!st.isEmpty() && priority(ch)<priority(st.peek()))
                ans+=st.pop();
                
                st.push(ch);
                }
            }
            
            i++;
        }
        
        while(!st.isEmpty())
        ans+=st.pop();
        
        StringBuilder sv=new StringBuilder(ans);
        return sv.reverse().toString();
    }

    public static int  priority(char ch)
    {
        if(ch=='+'|| ch=='-')
        return 1;
        else if(ch=='*'|| ch=='/')
        return 2;
        else if(ch=='^')
        return 3;
        
        return 0;
    }

}

