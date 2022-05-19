package SusanQuestion;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        double commission,staffPay;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the monthly sales:");
        int sales=scanner.nextInt();
        if (sales<=1000){
            commission= (double)((2.5/100)*sales);
        }
        else if (sales>1000 && sales<=4999){
             commission =(double)((5/100)*sales);

        }
        else if (sales>=5000 && sales<=9999){
             commission=(double)((7.5/100)*sales);
        }
        else if (sales>=10000 &&sales<=14999){
             commission=(double)((10/100)*sales);

        }
        else {
             commission=(double)((12.5/100)*sales);
        }
        System.out.println("Enter the amount of Advance Payment:");
        int advance= scanner.nextInt();
        System.out.println("The commission is "+commission);
        staffPay= commission-advance;
        System.out.println("The Staff Pay is:"+staffPay);
        if(staffPay<0){
            System.out.println("You cannot ask for that much advance pay !!!");
        }


    }
}
