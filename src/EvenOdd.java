import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scanner.nextInt();
        if(a%2==0){
            System.out.println("It is even number.");
        }
        else{
            System.out.println("It is odd number");
        }
    }
}
