import java.util.Scanner;
public class simplePendulum {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of pendulum: ");
        double l = sc.nextDouble();

        System.out.print("Enter value of gravity: ");
        double g = sc.nextDouble();

        double t = 2 * (22.0/7.0) * Math.sqrt(l/g);

        System.out.print("Time period of the pendulum is: " + t);

    }
    
}
