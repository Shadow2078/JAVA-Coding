import javax.swing.*;

public class Marks {
    public static void main(String[] args) {
        double oop, architecture, math, database;
        oop = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of OOP:"));
        architecture = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of architecture:"));
        math = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of Math:"));
        database = Double.parseDouble(JOptionPane.showInputDialog("Enter marks of Database:"));
        int percentage = (int) ((oop + architecture + math + database) / 4);
        JOptionPane.showMessageDialog(null, "Your percentage is:" + percentage + "%");
        SumanPrint();
    }
    static void SumanPrint(){
        System.out.println("Myu name is suman");
    }
}
class Suman{
    public static void main(String[] args) {

    }
}
