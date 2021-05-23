import java.util.Scanner;
public class MagicNum {
    
    int sumOfDigits(int n){
        int sum=0;
        while (n>0){
            int d = n%10;
            sum = sum + d;
            n = n/10;
        }
        return sum;
    }
    boolean isMagic(int n){
        while(n>=10){
            n = sumOfDigits(n);
        }
        if(n==1)
           return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        MagicNum obj = new MagicNum();
        boolean res_obj = obj.isMagic(n);
        if(res_obj==true)
            System.out.println(n + " is a magic number.");
        else
            System.out.println(n + " is not a magic number.");
    sc.close();
        
        }
}
