import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter letters.");
        char ch=scanner.next().charAt(0);
        if (ch>='a'&&ch<='z'){
            System.out.println(ch+" is Lowercase");
        }
        else if(ch>='A'&&ch<='Z'){
            System.out.println(ch+" is a Uppercase");

        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
