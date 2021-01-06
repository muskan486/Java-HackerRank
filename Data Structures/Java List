import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int value=0;
        List l=new ArrayList();
        for(int i=0;i<n;i++)
        {
            value=sc.nextInt();
            l.add(value);
        }
        int q=sc.nextInt();
        String query="";
        int index=0,nValue=0;
        
        while(q--!=0)
        {
            query=sc.next();
            if(query.equals("Insert"))
            {
                index=sc.nextInt();
                nValue=sc.nextInt();
                l.add(index,nValue);
            }
            else if(query.equals("Delete"))
            {
                index=sc.nextInt();
                l.remove(index);
            }
        }
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
    }
}
