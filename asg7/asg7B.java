import java.util.*;

class TOH{
    void toh(int n, char S, char D, char A)
    {
        if(n==1)
        {
            System.out.println("Move disk 1 from " + S + " to " + D);
            return;
        }
        toh(n-1, S, A, D);
        System.out.println("Move disk " + n + " from " + S + " to " + D);
        toh(n-1, A, D, S);
    }
}

public class asg7B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disks:");
        int n = sc.nextInt();
        TOH tower = new TOH();
        tower.toh(n, 'A', 'C', 'B');
        sc.close();
    }
}
