import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter you name:");
        String name= scanner.nextLine();
        System.out.println("Enter you roll no.:");
        int roll= scanner.nextInt();
        System.out.println("Enter your field of Interest:");
        String interest;
        interest= scanner.next();

        System.out.println("Hey,my name is "+name+" and my roll number is "+roll+". My field of interest are "+interest);
    }
}
