

import java.util.Scanner;

public class MenuDriven_2 {
    public static void main(String[] args){
        int option = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        option = sc.nextInt();
        MenuDriven_2 opt_1 = new MenuDriven_2();
        switch (option){

            case 1:
                opt_1.displaySeries();
                break;

            case 2:
                opt_1.displaySeries(6, 2);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void displaySeries(int x, int n){
        double sum = 0;
        for(int i = 1; i <= n; i+=1){
            sum = sum + (Math.pow(-1, (i-1)) * (Math.pow(x, i)/factorial(i)));
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

    public void displaySeries(){
        int a = 0, b = 1, c = 2;
        int sum = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        while(sum < 40){
            sum = a + b + c;
            System.out.print(sum + " ");
            a = b;
            b = c;
            c = sum;
        }
    }
}
