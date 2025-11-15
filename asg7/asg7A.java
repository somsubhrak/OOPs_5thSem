import java.util.*;

class Room
{
    double width, height, length;
    Room(double w, double h, double l)
    {
        width = w;
        height = h;
        length = l;
    }

    double volume()
    {
        return width * height * length;
    }
}
public class asg7A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width, height and length of the room:");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double l = sc.nextDouble();
        Room room = new Room(w, h, l);
        System.out.println("Volume of the room is: " + room.volume());
        sc.close();
    }
}
