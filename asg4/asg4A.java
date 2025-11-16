import java.util.*;

public class asg4A {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();
        int res=1;
        for(int i=1;i<=n;i++)
            res*=x;
        System.out.println(res);
        sc.close();
    }
}
