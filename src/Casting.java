import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Principal:");
        double Principal=scanner.nextDouble();
        System.out.println("Enter Time:");
        double Time=scanner.nextDouble();
        System.out.println("Enter rate");
        double Rate=scanner.nextDouble();
        double SI=(Principal*Time*Rate)/100;
        int castedSI=(int) (SI);
        System.out.println("The Simple Interest is: Rs. "+castedSI);
    }
}
