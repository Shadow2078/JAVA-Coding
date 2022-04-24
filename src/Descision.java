import java.util.Scanner;

public class Descision {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the week number:");
        int day= scanner.nextInt();
        if (day==1){
            System.out.println("It is Sunday");
        }
        else if (day==2){
            System.out.println("It is Monday");
        }
        else if (day==3){
            System.out.println("It is Tuesday");
        }
        else if (day==4){
            System.out.println("It is Wednesday");
        }
        else if (day==5){
            System.out.println("It is Thursday");
        }
        else if (day==6){
            System.out.println("It is friday");
        }
        else if (day==7){
            System.out.println("It is Saturday");
        }
        else{
            System.out.println("You've entered wrong number of day.");
        }

        // Switch Case Statement
        switch (day){
            case 1:
                System.out.println("It is Sunday");
                break;
            case 2:
                System.out.println("It is Monday");
                break;
            case 3:
                System.out.println("It is Tuesday");
                break;
            case 4:
                System.out.println("It is Wednesday");
                break;
            case 5:
                System.out.println("It is Thurday");
                break;
            case 6:
                System.out.println("It is Friday");
                break;
            case 7:
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}
