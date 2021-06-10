import java.util.Scanner;

class Test{
int a, b;
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Test obj = new Test();
        System.out.print("Enter integer a: ");
        obj.a = sc.nextInt();
        System.out.print("Enter integer b: ");
        obj.b = sc.nextInt();
        Swapper s = new Swapper();
        
        s.swap(obj);
        System.out.println("Now a is " + obj.a + " and b is " + obj.b);
        sc.close(); 
     }
 }

public class Swapper{
public void swap(Test obj){
    int dummy = obj.a;
    obj.a = obj.b;
    obj.b = dummy;
 }
}

