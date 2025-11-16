package asg11pack;

public class addDouble implements addmul {
    double a,b,sum=0.0;
    public addDouble(double a, double b){
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        sum = a+b;
    }
    public void show()
    {
        System.out. println("Double Sum: "+sum);
    }
}
