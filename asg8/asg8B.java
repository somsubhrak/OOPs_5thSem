import java.util.*;
abstract class Number {
    int n;
    Number(int n)
    {
        this.n=n;
    }   
    abstract void displayNum();
}

class HexNum extends Number{
    HexNum(int n)
    {
        super(n);
    }
    void displayNum()
    {
        System.out.println("Hexadecimal: " + Integer.toHexString(n).toUpperCase());
    }
}
class OctNum extends Number{
    OctNum(int n)
    {
        super(n);
    }
    void displayNum()
    {
        System.out.println("Octal: " + Integer.toOctalString(n));
    }
}
class asg8B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        Number hex = new HexNum(num);
        Number oct = new OctNum(num);
        hex.displayNum();
        oct.displayNum();
        sc.close();
    }
}
