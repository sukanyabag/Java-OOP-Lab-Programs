import java.util.Scanner;
public class CompareDtypes {

    public void compare(int x, int y){
        
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        }
        else {
            System.out.println(y + " is greater than " + x);
        }
        
    }
    
    public void compare(char x, char y) {
        int xi = (int)x;
        int yi = (int)y;
        
        if (xi > yi) {
            System.out.println(x + " is greater than " + y);
        }
        else {
            System.out.println(y + " is greater than " + x);
        }
        
    }
    
    public void compare(String x, String y) {
        
        int lenx = x.length();
        int leny = y.length();
        
        if (lenx > leny) {
            System.out.println(x + " is greater than " + y);
        }
        else {
            System.out.println(y + " is greater than " + x);
        }

    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CompareDtypes obj = new CompareDtypes();
        
        System.out.print("Enter 1st int value: ");
        int num_1 = sc.nextInt();
        System.out.print("Enter 2nd int value: ");
        int num_2 = sc.nextInt();
        obj.compare(num_1, num_2);
        
        System.out.print("Enter 1st char value: ");
        char char_1 = sc.next().charAt(0);
        System.out.print("Enter 2nd char value: ");
        char char_2 = sc.next().charAt(0);
        sc.nextLine();
        obj.compare(char_1, char_2);
        
        System.out.print("Enter 1st str value: ");
        String str_1 = sc.nextLine();
        System.out.print("Enter 2nd str value: ");
        String str_2 = sc.nextLine();
        obj.compare(str_1, str_2);

        sc.close();
    }
}

