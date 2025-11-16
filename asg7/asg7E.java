package asg7;
class Shape1{
    void rect(int n, char ch)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++) {
                System.out.print(ch);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    void rect(int a, int b, char ch)
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++) {
                System.out.print(ch);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
public class asg7E {
    public static void main(String[] args) {
        Shape1 s = new Shape1();
        s.rect(3,4,'#');
        System.out.println();
        s.rect(4, (char)'%');
    }
}
