import java.util.Scanner;

public class asg5c {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower and upper: ");
        int l = sc.nextInt();
        int h = sc.nextInt();

        for (int n = l; n <= h; n++)
        {
            int sum = 0, num = n;
            while (num > 0) 
            {
                //int last_digit = num % 10;
                int fact = 1;

                for (int i = 1; i <= (num%10); i++)
                    fact *= i;

                sum += fact;
                num /= 10;
            }

            if (sum == n)
                System.out.print(n+" ");
        }
        sc.close();
    }
}