import javax.swing.*;
import java.util.Scanner;

public class GUI {
    public static void main(String[] args) {
        Scanner message =new Scanner(System.in);
        String name=JOptionPane.showInputDialog("Enter your name:");
        String address=JOptionPane.showInputDialog("Enter your address:");
        JOptionPane.showMessageDialog(null,"Your name is: "+name+"\n and your address is:"+address);
        int first, second, sum;
        first=Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
        second=Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));
        sum=first+second;
        JOptionPane.showMessageDialog(null,"Sum is:"+sum);


        System.exit(0);

    }
}
