import java.util.*;
public class basic_calc {
    public static void main(String[] args)
    {
        int op = 0;
        Scanner scan = new Scanner(System.in);
        int firstNum = 0;
        System.out.println("First Num");
        firstNum = scan.nextInt();
        int secondNum = 0;
        System.out.println("Second Num");
        secondNum = scan.nextInt();
        System.out.println("What would you like to do with the two numbers?");
        System.out.println("Addition, or press 1. Subtraction, or press 2. Division, or press 3");
        op = scan.nextInt();
        switch (op) {
            case 1:
                System.out.println(firstNum+secondNum);
                break;
            case 2:
                System.out.println(firstNum-secondNum);

                break;
            case 3:
                System.out.println(firstNum/secondNum);

                break;
            default:
                break;
        }




    }
}
