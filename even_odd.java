import java.util.Scanner;

public class even_odd {
     public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Number to see if even or odd");
    int num = scan.nextInt();
    if (num%2==0)
    {
        System.out.println("Not Odd");
    }
    else{
        System.out.println("Odd");
    }
    scan.close();
     }
    
}
