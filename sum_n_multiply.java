import java.util.Scanner;
class Operations{
    int sum(int a, int b){
        return a+b;
    }

    static int multiply(int a, int b){
        return a*b;
    }
}

public class sum_n_multiply{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        Operations obj = new Operations();
        System.out.println("Sum of the two numbers : ");
        int res1 = obj.sum(x, y);
        System.out.println(res1);
        System.out.println("Product of the two numbers : ");
        int res2 = Operations.multiply(x, y);
        System.out.println(res2);
        sc.close();
    }}
