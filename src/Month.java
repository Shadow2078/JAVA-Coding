import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input month number");
        int number=scanner.nextInt();
        System.out.println("Enter year.");
        int year=scanner.nextInt();
        if(number==1||number==3||number==5||number==7||number==8||number==10||number==12){
            System.out.println("In this"+number+"month,there are 31 days");
        }
        else if(number==4||number==6||number==9||number==11)
        {
            System.out.println("In this"+number+"month, there are 30 days.");
        }
        else if(number==2){
            if ((year%400==0)||(year%4==0)||(year%100!=0)){
            System.out.println("29 days because its a leap year");

        }
        else{
                System.out.println("28 days and it's not leap year");
            }

    }
        else{
            System.out.println("Please enter valid number");
        }
}}
