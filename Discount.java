import java.util.Scanner;
public class Discount
{
    int purchase;
    double disc;
    double total;
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter article purchase: ");
        purchase = in.nextInt();
    }
    
    public void calc() {
        if (purchase <= 5000)
            disc = 0;
        else if (purchase > 5000 && purchase <= 10000)
            disc = (purchase-5000) * 0.1;
        else if (purchase > 10000 && purchase <= 20000)
            disc = (purchase-10000) * 0.2;
        else if (purchase > 20000 && purchase <= 30000)
            disc = (purchase-20000) * 0.3;
	else if (purchase > 30000)
            disc = (purchase-30000) * 0.5 + purchase * .02;
            
        total = purchase - disc;
    }
    
    public void display() {
        System.out.println("price\tDiscount\tAmount to be paid");
        System.out.println(purchase + "\t" + disc + "\t\t" + total);   
    }
    
    public static void main(String args[]) {
        Discount obj = new Discount();
        obj.input();
        obj.calc();
        obj.display();
    }
}