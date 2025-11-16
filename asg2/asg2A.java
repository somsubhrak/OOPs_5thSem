import java.util.*;
public class asg2A {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b=temp;
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("First number: " +a + "\nSecond number: " +b);
        sc.close();
    }
}
