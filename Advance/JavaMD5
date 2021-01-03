import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String str=in.next();
        try
        {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] bytes=md.digest(str.getBytes());
        
        for(byte b:bytes)
        System.out.format("%02x",b);
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
