import java.util.*;
class NonFibo{
  boolean Fibo(int n, int a, int b)
    {
    if(n==a || n==b)
        return true;
    if(b>n)
        return false;
    return Fibo(n, b, a+b);
    }
    void printNonFibo(int n)
    {
        int count = 0, i = 0;
        while(count<n)
        {
            if(!Fibo(i,0,1)){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
    }

}
public class asg7C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        NonFibo nf = new NonFibo();
        System.out.println("Non-Fibonacci numbers up to " + n + " are:");
        nf.printNonFibo(n);
        sc.close();
    }
}
