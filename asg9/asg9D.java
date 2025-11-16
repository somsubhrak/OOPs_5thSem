package asg9;

import java.util.Scanner;

class MathException extends Exception {
    public MathException(String message) {
        super(message);
        System.err.println("MathException: " + message);
    }
}

class OverflowException extends MathException {
    public OverflowException(String message) {
        super(message);
        System.err.println("OverflowException: " + message);
    }
}
class UnderflowException extends MathException {
    public UnderflowException(String message) {
        super(message);
        System.err.println("UnderflowException: " + message);
    }
}
public class asg9D {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        try{
        if(num > 100)
        {
            try {
                throw new OverflowException("Number exceeds maximum limit");
            } catch (OverflowException e) {
                System.out.println("Caught an OverflowException: " + e.getMessage());
                throw e;
            }
        } 
        else
         {
            try {
                throw new UnderflowException("Number below minimum limit");
            } catch (UnderflowException e) {
                System.out.println("Caught an UnderflowException: " + e.getMessage());
                throw e;
            }
        }
    }catch(MathException e)
    {
        System.out.println("Caught a MathException: " + e.getMessage());
    }finally {
        sc.close();
    }
}
}
