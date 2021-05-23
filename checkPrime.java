import java.util.Scanner;
public class checkPrime {

    static int num, i, prime=1;
    //default constructor
    checkPrime(){
        num = 0;
    }
    // parameterized constructor
    checkPrime(int x){
        num = x;
    }
    
    void isPrime(){
        for(i=2; i<num; i++) {
            if (num % i == 0){
                prime = 0;
                break;
            }   
        }   
            
        if (prime == 1) {
            System.out.println(num + " is prime.");
        } 
        else {
            System.out.println(num + " is not prime.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        checkPrime dc = new checkPrime();
        dc.isPrime();
        checkPrime pc = new checkPrime(input);
        pc.isPrime();
        sc.close();
    }
}
