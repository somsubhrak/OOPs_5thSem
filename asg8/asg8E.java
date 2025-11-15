abstract class Shape{
    int x,y;
    abstract void printArea();
}

class Rectangle extends Shape{
    Rectangle(int x, int y){
        this.x=x;
        this.y=y;
    }
    void printArea(){
        System.out.println("Area of Rectangle: " + (x * y));
    }
}
class Triangle extends Shape{
    Triangle(int x, int y){
        this.x=x;
        this.y=y;
    }
    void printArea()
    {
        System.out.println("Area of Triangle: " + (0.5 * x * y));
    }
}
class Circle extends Shape{
    Circle(int x){
        this.x=x;
    }
    void printArea()
    {
        System.out.println("Area of Circle: " + (Math.PI * x * x));
    }
}
public class asg8E {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 2);
        Triangle t = new Triangle(2, 3);
        Circle c = new Circle(5);

        rec.printArea();
        t.printArea();
        c.printArea();
    }
}
