import java.util.Scanner;

public class asg6A2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n and m: ");
        int n= sc.nextInt();
        int m= sc.nextInt();
        int a[][]= new int [n][m];

        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=sc.nextInt();

        int min= a[0][0], max=a[0][0];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]<min)
                    min=a[i][j];  
                if(a[i][j]>max)
                    max=a[i][j];
            }
        }
        System.out.println("minimum: " + min);
        System.out.println("maximum: " + max);
        sc.close();
    }
}