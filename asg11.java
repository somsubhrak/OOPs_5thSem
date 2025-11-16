import asg11pack.*;
public class asg11 {
    public static void main(String[] args) {
        addInt a = new addInt(12,8);
        addDouble b = new addDouble(12.3,14.7);
        addString c = new addString("happy", "birthday");

        a.add();
        a.show();
        b.add();
        b.show();
        c.add();
        c.show();
     }
}
