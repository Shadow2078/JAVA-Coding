package Switch_Statement;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=scanner.nextInt();
        int result;
        if((num%5==0)&&(num%11==0)){
            result=0;
        }
        else {
            result=1;
        }
        switch (result){
            case 0:
                System.out.println("It is divisible");
                break;
            case 1:
                System.out.println("It is not divisible");
                break;
        }
    }
}
