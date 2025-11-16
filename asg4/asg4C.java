import java.util.*;

public class asg4C {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lower and upper limit");
        int a = sc.nextInt();
        int n= sc.nextInt();

        for(int i=a;i<=n; i++)
        {
            int flag=1;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {   flag=0;
                    break;
                }
            }
            if(flag==1)
                System.out.print(i+ " ");
        }     
        sc.close();
    }
}
