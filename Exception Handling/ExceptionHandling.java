import java.util.Scanner;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public int power(int num,int power) throws Exception
    {
        if(num==0 && power==0)
        {
            throw new Exception("n and p should not be zero.");
        }
        else if(num<0 || power<0)
        {
            throw new Exception("n or p should not be negative.");
        }
        else
        {
            int res=(int)Math.pow(num,power);
            return res;
        }
    }
    
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
