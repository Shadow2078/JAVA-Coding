package Switch_Statement;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int result;
        System.out.println("Enter num1:");
        int num1=scanner.nextInt();
        System.out.println("Enter num2");
        int num2=scanner.nextInt();
        System.out.println("Enter num3");
        int num3=scanner.nextInt();

        if(num1>num2&&num1>num3){
             result=0;
        }
        else if(num2>num1&&num2>num3){
             result=1;
        }
        else{
            result=2;
        }
        switch (result){
            case 0:
                System.out.println("Num1 is maximum.");
                break;
            case 1:
                System.out.println("Num2 is maximum");
                break;
            case 2:
                System.out.println("Num3 is maximum.");
        }


    }
}
