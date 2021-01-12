import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList> al=new ArrayList<ArrayList>();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=0;
        while(t --!=0)
        {
            n=sc.nextInt();
            ArrayList<Integer> a=new ArrayList<Integer>();
            for(int i=0;i<n;i++)
            {
                a.add(sc.nextInt());
            }
            al.add(a);
        }
        int q=sc.nextInt();
        int x=0,y=0;
        while(q--!=0)
        {
            x=sc.nextInt()-1;
            y=sc.nextInt()-1;
            if(x<al.size() && y<al.get(x).size())
            {
                System.out.println(al.get(x).get(y));
            }
            else
            {
                System.out.println("ERROR!");
            }
        }
        
        
        
    }
}
