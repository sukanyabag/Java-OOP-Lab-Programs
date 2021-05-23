import java.util.Scanner;
public class javaIsBoring {
    public static boolean specialNum(int n) {
        int t = n;
        int sum = 0, ld = 0;
        while(t>0) {

            ld = t%10;
            sum = sum + fact(ld);
            t = t/10;
        }
        if(sum==n)
           return true;
        else
           return false;
    }
    public static int fact(int m) {
        int f = 1;
    for(int i=m; i>0; i--) {
        f = f*i;
    }
    return f;
}

    public static void main (String args[]) {
        int n =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        if(specialNum(n))
           System.out.println( n + " is a special number.");
        else
           System.out.println(n + " is not a special number");
        sc.close();
    }    
}