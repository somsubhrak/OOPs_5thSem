import java.util.*;

public class asg5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower and upper: ");
        int l = sc.nextInt();
        int h = sc.nextInt();
        for(int n=l;n<=h;n++)
        {
            if((n*n)%100 == n)
                System.out.print(n + " ");
        }
        sc.close();
    }
}