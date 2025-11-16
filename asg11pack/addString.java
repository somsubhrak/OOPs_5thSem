package asg11pack;

public class addString implements addmul {
    String a,b,sum="";
    public addString(String a, String b){
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        sum = a+b;
    }
    public void show()
    {
        System.out. println("String Sum: "+sum);
    }
}
