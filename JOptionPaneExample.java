
//Comments are white
import javax.swing.JOptionPane;

public class JOptionPaneExample{
    public static void main(String[] args){
        String name, input;
        int number;

        name = JOptionPane.showInputDialog("Enter Your name: ");
        input = JOptionPane.showInputDialog("Enter Your age: ");
        number = Integer.parseInt(input);

        JOptionPane.showMessageDialog(null,"Name: "+name+"\nAge: "+number);
        System.exit(0);
    }
}
