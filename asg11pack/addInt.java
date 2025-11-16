package asg11pack;

public class addInt implements addmul {
    int a,b,sum=0;
    public addInt(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        sum = a+b;
    }
    public void show()
    {
        System.out. println("Integer Sum: "+sum);
    }
}
