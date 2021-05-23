import java.util.Scanner;
public class digcamPrice {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter printed price of the dig-camera: Rs. ");
        double printed_price = sc.nextDouble();
        double discount = printed_price * 10 / 100.0;
        double price = printed_price - discount;
        double GST = price * 6 / 100.0;
        price += GST;
        System.out.print("Price of the Digital Camera is: Rs. " + price);

    } 
}
