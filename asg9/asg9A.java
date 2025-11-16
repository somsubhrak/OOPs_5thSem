package asg9;
import java.util.Scanner;
public class asg9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator and denominator: ");
        int n = sc.nextInt();
        int d = sc.nextInt();
        try{
            int res = n/d;
            System.out.println(res);
        }catch(ArithmeticException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        sc.close();
    }
}
