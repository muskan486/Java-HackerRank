import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String s1=a.toLowerCase();
        String s2=b.toLowerCase();
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        int count=0;
        if(arr1.length==arr2.length)
        {
            for(int i=0;i<arr1.length;i++)
            {
                for(int j=0;j<arr2.length;j++)
                {
                    if(arr1[i]==arr2[j])
                    {
                        count++;
                        arr2[j]=' ';
                        break;
                    }
                }
            }
            if(count==arr1.length)
            return true;
            else
            return false;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
