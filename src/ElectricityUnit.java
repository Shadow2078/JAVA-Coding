import java.util.Scanner;

public class ElectricityUnit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double amount,rem;
        System.out.println("Enter the unit consumed:");
        int unit=scanner.nextInt();
        if (unit<=50){
            amount= (unit*0.5);
        }
        else if (unit<=150){
            amount =(25 +(unit-50) * 0.75);

        }
        else if(unit<=250){
            amount=(100+(unit-150)*1.20);
        }
        else{
            amount=(220+(unit-250)*1.5);
        }

        System.out.println(amount+0.2*amount);

    }
}
