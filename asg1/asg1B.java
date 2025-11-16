import java.util.*;
public class asg1B
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = sc.nextDouble();
        double area = 3.14*r*r;
        double p = 3.14*2*r;
        System.out.println("Area: " +area);
        System.out.println("perimeter: " +p);
        sc.close();
    }
} 