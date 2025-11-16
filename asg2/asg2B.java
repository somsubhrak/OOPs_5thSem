import java.util.*;
public class asg2B {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic pay: ");
        double base = sc.nextDouble();
        double agp = 0.5 * base;
        double merge = base + agp;
        double da = 0.5*merge;
        double hra = 0.15*merge;
        System.out.println("Total salary: " +(base+agp+da+hra));
        sc.close();
    }
}
