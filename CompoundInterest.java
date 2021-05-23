import java.util.Scanner;
public class CompoundInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount : Rs.");

        double principal = sc.nextDouble();
        double interest = principal * 5 * 1 / 100.0;
        System.out.println("Interest for the first year is = Rs. " + interest);
        principal += interest;

        interest = principal * 5 * 1 / 100.0;
        System.out.println("Interest for the second year is = Rs. " + interest);

        principal += interest;
        interest = principal * 5 * 1 / 100.0;
        System.out.println("Interest for the third year is = Rs. " + interest);

    }
    
}