import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the obtained marks of Mathematics:");
        int math=scanner.nextInt();
        System.out.println("Enter the obtained marks of Software Development:");
        int software=scanner.nextInt();
        System.out.println("Enter the obtained marks of Programming:");
        int programming=scanner.nextInt();
        System.out.println("Enter the obtained marks of Architecture:");
        int architecture=scanner.nextInt();

        float total=(math+software+programming+architecture);
        System.out.println("Your total marks is: "+total);
        float percentage=(total)/4;
        System.out.println("Your obtained percentage is: "+percentage+"%");

        System.out.println("Your grade is shown below");
        String grade;

        grade=(percentage>=70)?"First Class":
                ((percentage<70 && percentage>=59)?"Upper Second Class":
                        ((percentage<59 && percentage>=49)?"Second Class":
                                ((percentage<49 && percentage>=39)?"Third Class":
                                        "Failed")));
        System.out.println("Your grade is: "+grade);



    }
}
