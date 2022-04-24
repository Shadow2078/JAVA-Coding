import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        System.out.println("Validity of triangle");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the angle one of a trianlge:");
        int angle1=scanner.nextInt();
        System.out.println("Enter the angle two of the triangle");
        int angle2=scanner.nextInt();
        System.out.println("Enter the third angle of the triangle");
        int angle3=scanner.nextInt();
        // For the validity to be the traingle, the sum of all its angles should be 180 degree
        int sum=angle1+angle2+angle3;
        if (sum==180){
            System.out.println("Yes,It is a valid triangle.");
        }
        else {
            System.out.println("No,It is not a triangle.");
        }
    }
}
