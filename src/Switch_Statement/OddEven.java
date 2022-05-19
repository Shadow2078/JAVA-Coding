package Switch_Statement;

public class OddEven {
    public static void main(String[] args) {
        int num = 4;
        switch (num % 2) {
            case 0:
                System.out.println(" It is Even");
                break;
            default:
                System.out.println("It is Odd");
                break;

        }
    }
}
