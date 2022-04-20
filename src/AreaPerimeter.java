import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a side of square:");
        int side= scanner.nextInt();
        int area=side*side;
        int perimeter=side*4;
        System.out.println("The area of a square is:"+area+"cm2");
        System.out.println("The Perimeter of a square is:"+perimeter+"cm");
        System.out.println("Now Enter Principal:");
        int principal=scanner.nextInt();
        System.out.println("Enter the Rate :");
        int rate=scanner.nextInt();
        System.out.println("Enter the time : ");
        int time=scanner.nextInt();
        double SI=(principal*rate*time)/100;
        System.out.println("The Simple Interest is "+SI);

        System.out.println("Enter the base of triangle:");
        int base= scanner.nextInt();
        System.out.println("Enter the height of traingle:");
        int height=scanner.nextInt();
         float area1=(base*height)/2;
        System.out.println("The height of a triangle is "+area1);

        System.out.println("Enter the length of Cube:");
        int length1=scanner.nextInt();
        float vol=length1*length1*length1;
        System.out.println("The volume of a cube is "+vol);

        System.out.println("Enter the length of a cuboid:");
        int length2= scanner.nextInt();
        System.out.println("Enter a breadth of a cuboid:");
        int breadth=scanner.nextInt();
        System.out.println("Enter a height of a cuboid:");
        int height1=scanner.nextInt();
        float vol1=(length2*breadth*height1);
        System.out.println("The volume of a cuboid is "+vol1);







    }
}
