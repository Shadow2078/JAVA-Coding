import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any alphabets");
        char ch=scanner.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println(ch+" is an alphabet.");}
        else{
            System.out.println(ch+" is not an alphabet.");
        }
    }
}
