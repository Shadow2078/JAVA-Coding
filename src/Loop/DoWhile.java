package Loop;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int i=6;
        do {
            System.out.println(i);
            i++;
        }
        while (i<=5);
    }
}

class SumNatural{
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        do {
            sum=sum+i;
            i++;
        }
        while (i<=10);
        System.out.println(sum);
    }
}



//This kind of question is possible only in Do-while.

class InputLoopSum{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        int i=1;
        do {
            System.out.println("Enter a number");
             num=scanner.nextInt();
            i++;
        }
        while (num>0);
    }
}

class OddThreeMultiple{
    public static void main(String[] args) {
        int i=0;
        int count=0;
        int count1=0;
        do {
            if(i%2!=0)
            {
              count=count+i;
            }
            else {
                count1=count1+i;
            }
            i++;

        }
        while (i<10);
        System.out.println("There are"+count+"Odd Numbers");
        System.out.println("There are"+count1+"Even Numbers");
    }
}

class Break{
    public static void main(String[] args) {
        for( int i=1;i<=10;i++)
        {
            if(i%5==0)
            {
                break;
            }
            System.out.println(i);
        }
    }
}

class OddEvenSwitch{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        int a;
        if (num%2==0){
            a=0;
        }
        else{
             a=1;
        }
        switch (a){
            case 0:
                System.out.println("Number is Even");
                break;
            case 1:
                System.out.println("Number is Odd");
                break;

        }
    }
}

class Even_number{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}

class OddNumberContinue{
    public static void main(String[] args) {
        int i=1;
        while (i<=10)
        {
            if(i%2==0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            }
        }
    }

    class Except_Prime{
        public static void main(String[] args) {
            for(int i=1;i<=30;i++){
                for(int j=i-1;j>1;j--){
                    if(i%j==0){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }


