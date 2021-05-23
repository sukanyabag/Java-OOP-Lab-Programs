import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        int n,sum=0,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum+=i*i*i-1;
        }
        System.out.println("sum of the terms is:"+sum);
    }
}