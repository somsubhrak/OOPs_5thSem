public class asg1C
{
    public static void main(String args[])
    {
        int count = args.length;
        System.out.println("Number of arguments: "+count);
        int i=0;
        while(i<count)
        {
            System.out.print(args[i]+ " ");
            i++;
        }
    }
}
