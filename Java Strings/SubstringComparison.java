import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<=s.length()-k;i++)
        {
            String str=s.substring(i,i+k);
            if(i==0)
            {
                smallest=str;
            }
            if(str.compareTo(smallest)<0)
            {
                smallest=str;
            }
            else if(str.compareTo(largest)>0)
            {
                largest=str;
            }
        }
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
