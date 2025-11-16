package asg9;

import java.util.Scanner;

public class asg9B {
    public static void main(String[] args) {
        int a[] = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements: ");
        for(int i=0;i<10;i++)
            a[i]=sc.nextInt();
        sc.close();
        try{
            a[15]= 100;
        }catch(Exception e)
        {
            try{
                throw e;
            }catch(ArrayIndexOutOfBoundsException e2)
            {
                e2.printStackTrace();
                System.out.println(e2.getMessage());
            }
        }
    }   
}
