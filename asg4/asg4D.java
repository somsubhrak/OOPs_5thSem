import java.util.*;

public class asg4D {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp=n,sum=0;

        while(temp>0)
        {
            sum = sum*10+temp%10;
            temp/=10;
        }
        System.out.println(sum);
        if(sum==n)
            System.out.print("Palindrome");
        else
            System.out.print("Not Palindrome");
        sc.close();
    }
}
