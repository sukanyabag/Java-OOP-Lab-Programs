import java.util.Scanner;
public class displayDiscounts {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the article: Rs. ");
        double price = sc.nextDouble();

        double discount1 = price * 30 / 100.0;
        double to_pay = price - discount1;
        System.out.println("30% discount equals = Rs. " + discount1);
        System.out.println("Amount to pay after 30% discount = Rs. " + to_pay);

        double discount2 = price * 20 / 100.0;
        double to_pay2 = price - discount2;
        double discount3 = to_pay2 * 10 / 100.0;
        to_pay2 -= discount3;

        System.out.println("20% discount equals = Rs. " + discount2);
        System.out.println("10% discount equals = Rs. " + discount3);
        System.out.println("Amount to pay after successive discounts of 20% and 10% = Rs. " + to_pay2);
    }
}
