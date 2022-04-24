import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number.");
        int a=scanner.nextInt();
        if ( (double) a/5==0&&a/11==0){
            System.out.println("The number is divisible with 5 and 11");

        }
        else {
            System.out.println("The number is not divisible with 5 and 11");
        }
    }
}
