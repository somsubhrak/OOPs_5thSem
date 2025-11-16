import java.util.*;

public class asg5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();
        System.out.print("Enter number of lines ");
        int n = sc.nextInt();
        
        switch(ch)
        {
            case 1:
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<=i;j++)
                        System.out.print("* ");
                    System.out.println();
                }
                break;
            case 2:
                int x='A';
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<=(n-i);j++)
                        System.out.print(" ");
                    for(int j=0;j<=i;j++)
                        System.out.print((char)(x++)+ " ");
                    System.out.println();
                }
                break;
            case 3:
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=(n-i);j++)
                        System.out.print(" ");
                    for(int j=1;j<=i;j++)
                        System.out.print(j);
                    System.out.println();
                }
                break;
            default: 
                System.out.println("wrong choice");
        }
        sc.close();
    }
}