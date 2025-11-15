class Sum{
    int a,b;
    Sum(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    synchronized void add(){
        int c=a;
        int d=b;
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Sum is: "+(c+d));
    }
    synchronized void increase(){
        a+=5;
        b+=5;
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Increased values are: "+a+" and "+b);
    }
}
public class asg10B {
    public static void main(String[] args) {
        Sum ob = new Sum(10, 20);
        Thread t1= new Thread(()->ob.add());
        Thread t2= new Thread(()->ob.increase());
        t1.start();
        t2.start();
    }
    
}
