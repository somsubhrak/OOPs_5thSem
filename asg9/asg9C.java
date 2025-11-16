package asg9;

public class asg9C {
    public static void main(String[] args) {
        String s=null;
        try{
            int a = s.length();
        }catch(NullPointerException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally{
            System.out.println("finally block");
        }
    }
}
