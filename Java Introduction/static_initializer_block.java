import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int B,H;
static boolean flag=false;
static 
{
    
    Scanner in=new Scanner(System.in);
    B=in.nextInt();
    H=in.nextInt();
    if(B>0 && H>0)
    flag=true;
    else if(flag==false)
    {
       System.out.println("java.lang.Exception: Breadth and height must be positive"); 
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

