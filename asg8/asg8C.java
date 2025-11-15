abstract class TwoDFigure{
    double x,y;
    TwoDFigure(double x, double y){
        this.x=x;
        this.y=y;
    }
    abstract double calculateArea();
}

class RectangleFigure extends TwoDFigure{
    RectangleFigure(double x, double y){
        super(x,y);
    }
    double calculateArea(){
        return x*y;
    }
}
class TriangleFigure extends TwoDFigure{
    TriangleFigure(double x, double y){
        super(x,y);
    }
    double calculateArea(){
        return 0.5*x*y;
    }
}

public class asg8C {
    public static void main(String[] args) {
        TwoDFigure rect = new RectangleFigure(5, 3);
        TwoDFigure tri = new TriangleFigure(2, 3);
        System.out.printf("Rectangle Area: %.2f%n", rect.calculateArea());
        System.out.printf("Triangle Area: %.2f%n", tri.calculateArea());
    }
}
