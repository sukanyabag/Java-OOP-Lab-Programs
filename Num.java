import java.util.Scanner;

interface Number1{
    int findSqr(int n);
}

class Square implements Number1{
    int n, sq;
    public int findSqr(int n){
        sq = n*n;
        return sq;
    }
}

public class Num{
    public static void main(String args[]){
        Square s = new Square();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Square of the number entered is: ");

        System.out.print(s.findSqr(n));
        sc.close();
    }
}
