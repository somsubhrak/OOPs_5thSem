class Thread1 extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
            System.err.println("Thread 1 "+i);
    }
}
class Thread2 extends Thread{
    public void run()
    {
        for(int i=10;i>=1;i--)
        {
            System.out.println("Thread 2 "+i);
            try{
                if(i==6)
                {
                    System.out.println("Thread 2 sleeping");
                    Thread.sleep(1000);
                    System.out.println("Thread 2 awake");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class asg10A {
    public static void main(String[] args) {
       Thread1 t1 = new Thread1();
       Thread2 t2 = new Thread2();
       t1.start();
       t2.start();
    }
}
