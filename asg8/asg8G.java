import java.util.*;

interface MeanInterface {
    double mean(double[] a);
}

interface DeviationInterface extends MeanInterface {
    double[] deviation(double[] a);
}

class calc implements DeviationInterface {
    @Override
    public double mean(double[] a) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum / a.length;
    }

    @Override
    public double[] deviation(double[] a) {
        double[] dev = new double[a.length];
        double m = mean(a);
        for (int i = 0; i < a.length; i++)
            dev[i] = a[i] - m;
        return dev;
    }
}

public class asg8G {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextDouble();

        calc c = new calc();
        double m = c.mean(arr);
        double[] d = c.deviation(arr);

        System.out.println("Mean: " + m);
        System.out.println("Deviations:");
        for (int i = 0; i < d.length; i++)
            System.out.println(d[i]);
        sc.close();
    }
}
