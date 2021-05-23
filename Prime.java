import java.util.Scanner;

public class Prime{

    public boolean isPrime(int n){
        int c = 0;
        for(int i = 1; i <= n; i++){
            if((n % i) == 0)
                c++;
        }
        if(c == 2)
            return true;
        else
            return false;
    }

    public int sumOfPrimedigits(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public void check(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i+=1){
            if(isPrime(array[i]))
                sum += array[i];    
        }
        if(isPrime(sum))
            System.out.println("Sum of the primes is also prime.");
        else 
            System.out.println("Sum of the primes is not prime.");    
    }

    public static void main(String[] args) {
        Prime obj = new Prime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers of your choice: ");
        int array[] = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = sc.nextInt();
        }
        obj.check(array);
        sc.close();
    }
}