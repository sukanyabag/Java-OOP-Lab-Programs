import java.util.Scanner;
public class NumberProb {
    public static int sumOfFactors(int n){
         if(n == 1)
           return 1;

        int res= 0;
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                if (i == (n / i))
                    res += i;
                else
                    res += (i + n / i);
            }
        }
     
        
        return (res+ 1);
         
    }
    public static Boolean isPerfect(int n){
        int sum = 0;
        for (int i=1; i<n; i++)
        {
            if (n%i == 0)
            {
                sum = sum + i;
            }
        }
        if (sum == n)
        {
            return true;
        }
        else
        {
            return false;
        }


    }
    public static void main(String args[]){
        NumberProb number = new NumberProb();

        if(number.isPerfect(78))
           System.out.println("It is a perfect number.");
        else  
           System.out.println("It is not a perfect number.");  

    }
}
