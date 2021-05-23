import java.util.Scanner;

public class Series1 {

    public void displaySeries(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + (int)(Math.pow(i, 3) - 1);
        }
    }

    public void displaySeries(int x, int n){
        double sum = 0;
        int j = 2;
        for(int i = 0; i < n; i++){
            sum += (factorial(x + (2 * i)) / (j * 5.0));
            j++;
        }
        System.out.println("Sum = " + sum);
    }

    public int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        Series1 obj_1 = new Series1();
        switch (choice){
            case 1:
                obj_1.displaySeries(5);
                break;

            case 2:
                obj_1.displaySeries(6,2);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}