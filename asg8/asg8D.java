import java.util.*;
abstract class GeometricObject{
    String color;
    double weight;
    GeometricObject(){
        this("White", 1.0);
    }
    GeometricObject(String color, double weight){
        this.color=color;
        this.weight=weight;
    }
    String getColor(){
        return color;
    }
    double getWeight(){
        return weight;
    }
    abstract double findArea();
    abstract double findCircumference();
}

class TriangleObject extends GeometricObject{
    double a,b,c;
    TriangleObject(double a, double b, double c, String color, double weight){
        super(color, weight);
        this.a=a;
        this.b=b;
        this.c=c;

    }
    double findCircumference(){
        return a+b+c;
    }
    double findArea(){
        double s = findCircumference()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
public class asg8D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color, weight and sides of triangle: ");
        String color = sc.next();
        double weight = sc.nextDouble();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        GeometricObject triangle = new TriangleObject(a, b, c, color, weight);

        System.out.println("Color: " + triangle.getColor());
        System.out.println("Weight: " + triangle.getWeight());
        System.out.printf("Area: %.2f%n", triangle.findArea());
        System.out.printf("Circumference: %.2f%n", triangle.findCircumference());
        sc.close();
    }
}
