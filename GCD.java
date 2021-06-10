import java.util.Scanner;
public class GCD 
{
	public static void main(String[] args) 
	{
		System.out.printf("Enter two numbers : ");
        	Scanner sc=new Scanner(System.in);
        	int x1 = sc.nextInt();
        	int x2 = sc.nextInt();
        	int get_gcd = gcd(x1, x2);
        	System.out.printf("G.C.D of "+ x1 +" and " + x2 +" is " +get_gcd);
        
        sc.close();
    	}
	public static int gcd(int x1, int x2)
    	{
        	if(x1<0 || x2<0)
			return -1;
		else
		{
			if (x2 != 0)
        		    return gcd(x2, x1 % x2);
        		else
        		    return x1;

		}
    	}

    
}