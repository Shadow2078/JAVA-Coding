import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the values for a:");
        int a= scanner.nextInt();
        System.out.println("Enter the values for b:");
        int b= scanner.nextInt();
        Boolean result= (Boolean) (a<50&& a<b);
        System.out.println("Is a<50 and a<b");
        System.out.println(result);
    }
}
