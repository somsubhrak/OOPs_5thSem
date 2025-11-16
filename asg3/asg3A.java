import java.util.*;

public class asg3A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int greatest = (a > b && a > c) ? a : 
                       (b > c) ? b : c;

        System.out.println("Greatest number: " + greatest);
        sc.close();
    }
}