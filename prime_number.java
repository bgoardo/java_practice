import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        ArrayList<Integer> prime = new ArrayList<>();       
        int n =0;
        System.out.println("Input N to find the prime numbers up to it");
        n= scan.nextInt();
        for (int i = 2; i <= n; i++)
        {
            if(isPrime(i))
            {
                prime.add(i);
            }
        }
        System.out.println(prime);
         System.out.println(prime.size());

    }
    public static boolean isPrime(int num)
    {
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
