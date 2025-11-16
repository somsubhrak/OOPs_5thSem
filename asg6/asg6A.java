import java.util.Scanner;

public class asg6A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n= sc.nextInt();
        int a[]= new int [n];

        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int min= a[0], max=a[0];

        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
                min=a[i];  
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("minimum: "+min+"maximum: " + max);
        sc.close();
    }
}