import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        Scanner suman =new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = suman.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth=suman.nextDouble();
        double area= length*breadth;
        int castedArea=(int)(area);
        System.out.println("The area of rectangle is:"+castedArea);
        
    }
}
