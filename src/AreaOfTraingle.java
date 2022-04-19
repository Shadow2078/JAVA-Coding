import java.util.Scanner;

public class AreaOfTraingle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter length of a triangle:");
        double length= scanner.nextDouble();
        System.out.println("Enter breadth of a triangle:");
        double breadth= scanner.nextDouble();
        int area= (int) (length*breadth)/2;
        System.out.println("The area of a traingle is "+area);


    }
}
