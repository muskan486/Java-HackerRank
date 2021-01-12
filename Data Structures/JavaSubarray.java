import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,i,sum=0,j,count=0,num;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        
        for(i=0;i<n;i++)
        {
            sum=0;            
            for(j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum<0)
                {
                count++;
                }
            }
        }
        System.out.print(count);
    }
}
