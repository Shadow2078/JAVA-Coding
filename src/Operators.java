public class Operators {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=a;
        int d=55;
        int days = 366;
        String leap;
        leap = (days <= 365) ? "not leap" : "leap ";
        System.out.println(leap);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(++b);
        System.out.println(++c);
        System.out.println(b++);
        int age=19;
       String  eligibility=(age>=18)?"You are eligible to vote":"You are not elligible to vote because you're under eighteen years old";
        System.out.println(eligibility);
    }
}
