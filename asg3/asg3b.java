import java.util.*;
public class asg3b {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b*b - 4*a*c;
        if(d>0)
        {
            double r1 = (-b+Math.sqrt(d))/(2*a);
            double r2 = (-b-Math.sqrt(d))/(2*a);
            System.out.format("roots are %.2f and %.2f" ,r1,r2);
        }
        else if(d==0)
        {
            double r = (-b)/(2*a);
            System.out.format("root is %.2f" , r);
        }
        else{
            double real = (-b)/(2*a);
            double im = (Math.sqrt(d))/(2*a);
            System.out.format("root is %.2f + %.2fi \n", real, im);
            System.out.format("root is %.2f - %.2fi", real, im);
        }
        sc.close();
    }
}
