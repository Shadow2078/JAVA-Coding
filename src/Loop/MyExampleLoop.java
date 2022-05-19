package Loop;

import java.util.Scanner;

public class MyExampleLoop {
    public static void main(String[] args) {
        for(int i=1; i<=10;i++)
        {
            System.out.println("Suman");
        }
    }
}

class EvenCount {
    public static void main(String[] args) {
        for (int i=1;i<=20;i++)
        {
            if(i%2==0){
                System.out.println(i);

            }
        }
    }
}

class OddCount{
    public static void main(String[] args) {
        for(int j=1;j<=20;j++)
        {
            if(j%2!=0){
                System.out.println(j);
            }
        }
    }
}

class ThreeMultiples{
    public static void main(String[] args) {
        int count=0;
        for(int k=1;k<=20;k++)
        {
            if( k%3==0)
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}

class SumOfTenNaturalNumber{
    public static void main(String[] args) {
        int sum=0;
        for(int l=1;l<=10;l++)
        {
            sum=sum+=l;

        }
        System.out.println(sum);
    }
}

class PrimeNumber{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();
        int count =0;
        for(int t=1; t<=num; t++)
        {
          if(num%t==0)
          {
              count+=1;
          }
        }
        if(count==2)
        {
            System.out.println(num+" is prime number");

        }
        else {
            System.out.println(num+" is not prime number");
        }

        }
}

class NestedLoop{
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            System.out.println("Outer Loop");
            for(int j=1;j<=5;j++)
            {
                System.out.println("Inner Loop");
            }
        }
    }
}

class ThirtyPrime{
    public static void main(String[] args) {
        for(int num=1;num<=30;num++)
        {
           int count=0;
           for(int j=1;j<=num;j++)
           {
               if(num%j==0){
                   count=count++;
               }

           }
            if(count==2){
                System.out.println(num);
            }

        }
    }
}

class  Infinite{
public static void main(String[]args){
    while (true)
    {
        System.out.println("Suman");
    }


        }
}

class  Infinite2{
    public static void main(String[]args){
        int i=1;
        while (true)
        {
            System.out.println("Suman");
        }


    }
}