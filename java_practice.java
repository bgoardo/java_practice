import java.io.*;

public class java_practice
{
public static void main(String[] args)
{
    java_practice ob = new java_practice();
    ob.sum(21, 23);
    ob.swap(21, 23);
    ob.toBinary(9);
    ob.fact(5);
   
}
public static void sum (int a, int b)
{
    System.out.println( a+b); 
}
public static void swap(int a, int b)
{
    int c;
    c = a;
    a = b;
    b = c;
    System.out.println(a+ " "  + b);
}
public static void toBinary(int a)
{
    int[] binNum = new int[1000];
    int i = 0;
    while (a > 0 )
    {
        binNum[i] = a % 2;
        a = a / 2;
        i++;
    }
    for (int j = i -1; j >= 0; j--)
        System.out.print(binNum[j]);
}
public static void fact(int a)
{
    int b = 0;
    int c = 0;
    int prod = 1;
    int[] arr = new int[1000];
    while ( a > 0)
    {
        arr[b] = a;
        a--;
        b++;
    }
    System.out.print(" ");
    for (int j = 0; j <b; j++)
    {
        c = arr[j];
        prod = prod * c;
        
    }
    System.out.print(prod);
    

}
}

