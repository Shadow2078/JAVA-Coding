package Loop;

import java.util.Scanner;

public class WhileOddEven {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            if(i%2==0)
            {
                System.out.println("Odd numbers are "+i);
            }
            else {
                System.out.println("even numbers are "+i);
            }
            i++;
        }
    }
}

class Multipication{
    public static void main(String[] args) {
        System.out.println("Multipication Table");
        int num=3;
        int i=1;
        while(i<=10)
        {
            System.out.println(num+"*"+i+"="+num*i);
            i++;
        }

    }
}

class BabbalQuestion{
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        int sum1=0;
        while(i<=15)
        {
            if(i%3==0) {
                sum=sum+i;
            }
            if(i%2==0 && i<=10)
            {
                sum1=sum1+i;
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(sum1);

        System.out.println("Difference is "+(sum-sum1));

    }
}

class Prime{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        int i=1;
        int count=0;
        while (i<=num)
        {
            if(num%i==0)
            {
                count=count++;
            }
            i++;
        }
        if(count==2)
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
}


