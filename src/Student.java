import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student's name :");
        String name= scanner.nextLine();
        System.out.println("Enter Student's Address: ");
        String address= scanner.nextLine();
        System.out.println("Enter Student's age:");
        int age= scanner.nextInt();
        System.out.println("The Students details are provided below:");
        System.out.println("His name is "+name+",address is "+address+" and his age is "+age);

    }
}
