import java.util.Scanner;

public class asg6B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int p[]= new int [6];
        int q[]= new int [4];
        int r[]= new int [10];
        System.out.print("Enter 6 elements: ");
        for(int i=0;i<6;i++)
            p[i]=sc.nextInt();
        System.out.print("Enter 4 elements: ");    
        for(int i=0;i<4;i++)
            q[i]=sc.nextInt();

        
        int i=0,j=0,k=0;
        while(j<4 && i<6)
        {
            if(p[i]<q[j])
                r[k++]=p[i++];
            else
                r[k++]=q[j++];
        }
        while(i<6)
            r[k++]=p[i++];
        while(j<4)
            r[k++]=q[j++];
        
        for(i =0;i<10;i++)
        System.out.print(r[i]+" ");
        
        sc.close();
    }
}