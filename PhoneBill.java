//ssssssssspackage com.examples.objectexamples;

import java.util.Scanner;

public class PhoneBill {
    String name;
    int cust_no;
    int unit;

    PhoneBill(){
        this.name = null;
        this.cust_no = 0;
        this.unit = 0;
    }

    public double compute(int unit){
        double cost = 0;
        
        if(unit <= 50)
            cost = unit * 5;
        else if(unit > 50 && unit <= 250)
            cost = compute(50) + (unit - 50) * 1.20;
        else if(unit > 250 && unit <= 400)
            cost = compute(250) + (unit - 250) * 1.10;
        else if(unit > 400)
            cost = compute(400) + (unit - 400) * 1.0;
        return cost;
    }

    public void display(){
        System.out.println("Customer name\tCustomer no.\tBill Amnt");
        System.out.println(this.name + "\t" + this.cust_no + "\t" + compute(this.unit));
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        this.name = sc.nextLine();
        System.out.print("Enter customer number: ");
        this.cust_no = sc.nextInt();
        System.out.print("Enter units: ");
        this.unit = sc.nextInt();
    }

    public static void main(String[] args) {

        PhoneBill bill_1 = new PhoneBill();
        bill_1.input();
        bill_1.display();
    }
}
