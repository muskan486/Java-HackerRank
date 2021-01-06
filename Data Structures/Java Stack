import java.util.*;
class Solution
{
	int top=-1;
    int maxSize;
    char[] stack;
    public Solution(int length)
    {
        maxSize=length;
        stack=new char[length];
    }
    public void push(char ch)
    {
        if(top==maxSize)
        {
            //Stack overflow
            return;
        }
        else
        top++;
        stack[top]=ch;
    }
    public int pop(char ch)
    {
        if(top==-1)
        {
          //stack underflow
            return -1;
        }
        else
        {
        if(stack[top]=='[' && ch==']' || stack[top]=='{' && ch=='}' || stack[top]=='(' &&        ch==')')
            {
                top--; 
                return 1; 
            }
            else 
            return 0;
        }
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		int i,pushVar=0,popVar=0;
		while (sc.hasNext()) 
        {
            pushVar=0;
            popVar=0;
			String input=sc.next();
 
            Solution obj=new Solution(input.length());
            for(i=0;i<input.length();i++)
            {
                if(input.charAt(i)=='[' || input.charAt(i)=='{' || input.charAt(i)=='(')
                {
                obj.push(input.charAt(i));
                pushVar++;
                }   
                else if(input.charAt(i)==']' || input.charAt(i)=='}' || input.charAt(i)==')')
                {
                    popVar+=obj.pop(input.charAt(i));   
                }
            }
            if(pushVar==popVar)
            System.out.println("true");
            else
            System.out.println("false");
         
		}
		
	}
}
