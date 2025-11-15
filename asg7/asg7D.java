import java.util.*;
class Name{
    String first,middle, last;
    Name(String first, String middle, String last)
    {
        this.first=first;
        this.middle=middle;
        this.last=last;
    }
}
class DOB{
    int day, month, year;
    DOB(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
}
class Student{
    int id;
    Name name;
    DOB dob;
    int marks[]= new int[3];
    Scanner sc = new Scanner(System.in);
    Student(int id, String first, String middle, String last, int day, int month, int year)
    {
        this.id=id;
        this.name=new Name(first, middle, last);
        this.dob=new DOB(day, month, year);
        System.out.print("Enter marks for English, Science and Maths: ");
        for(int i=0;i<3;i++)
            marks[i]=sc.nextInt();  
    }

    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name.first + " " + name.middle + " " + name.last);
        System.out.println("DOB: " + dob.day + "/" + dob.month + "/" + dob.year);
        System.out.print("Marks: ");
        for(int i=0;i<3;i++)
            System.out.print(marks[i] + " ");
        System.out.println();
    }
}
public class asg7D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student s[]= new Student[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter ID of student " + i + ": ");
            int id = sc.nextInt();
            System.out.print("Enter first, middle and last name of student " + i + ": ");
            String first = sc.next();
            String middle = sc.next();
            String last = sc.next();
            System.out.print("Enter date of birth (dd mm yyyy) of student " + i + ": ");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            s[i] = new Student(id, first, middle, last, day, month, year);
        }

        System.out.println("Student Details:");
        for(int i=0;i<n;i++)
            s[i].display();

        System.out.print("\nChoice:\n1)By student ID\n2)By name\nEnter choice: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("Enter student ID to search: ");
                int searchId = sc.nextInt();
                for(int i=0;i<n;i++)
                    if(s[i].id == searchId)
                    {
                        s[i].display();
                        break;
                    }
                break;
            case 2:
                System.out.print("Enter first, middle and last name to search: ");
                String first = sc.next();
                String middle = sc.next();
                String last = sc.next();
                for(int i=0;i<n;i++)
                {
                    if(s[i].name.first.equals(first) && s[i].name.middle.equals(middle) && s[i].name.last.equals(last))
                    {
                        s[i].display();
                        break;
                    }
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
