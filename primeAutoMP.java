import java.util.Scanner;
public class primeAutoMP {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Print the sum of all Prime Numbers from 1-100.");
        System.out.println("2. Check if a number is an Automorphic Number.");
        System.out.print("Enter your numerical choice: ");
        int choice = in.nextInt();
        


        switch (choice){
            case 1:
                int i , num, count, sum=0;
                for (num=1; num <=100; num++){
                    count=0;
                    for (i=2; i<= (num/2); i++){
                        if(num%i == 0){
                            count++;
                            break;
                        }
                    }
                    if (count ==0 && num!=1)
                        sum += num;
                }
                System.out.println("The sum of all Prime Numbers from 1 to 100 is = " + sum);
                break;      //changed
            case 2:
            System.out.print("Enter a number: ");
            int n = in.nextInt(); 
            int count1=0, sqr = n*n;
            int temp =n; 
          
            while(temp>0){
            count1++;
            temp=temp/10;
            break;
        }
 
        int lastDigits = (int) (sqr%(Math.pow(10,count1)));
 
        if(n == lastDigits)
            System.out.println("Automorphic number");
        else
            System.out.println("Not an Automorphic number");
        break;
            


            }   
                
        }

    }



