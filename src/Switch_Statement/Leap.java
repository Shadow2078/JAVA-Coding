package Switch_Statement;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year= scanner.nextInt();
        int result;
        if(year%400==0&&year%4==0){
            result=0;
        }
        else{
            result=1;
        }
        switch (result){
            case 0:
                System.out.println("It is leap year.");
                break;
            case 1:
                System.out.println("It is not leap year.");
                break;
        }
    }
}
