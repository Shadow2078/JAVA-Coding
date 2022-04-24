import javax.swing.*;
import java.util.Scanner;

public class InputGUI {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name,address;

        name= JOptionPane.showInputDialog("Enter your name:");
        address= JOptionPane.showInputDialog("Enter your address:");
        int roll=Integer.parseInt(JOptionPane.showInputDialog("Enter your roll no:"));

        JOptionPane.showMessageDialog(null,"The name of student is:"+name);
        JOptionPane.showMessageDialog(null,"Your address is:"+address);
        JOptionPane.showMessageDialog(null,"your roll no is"+roll);
    }
}
