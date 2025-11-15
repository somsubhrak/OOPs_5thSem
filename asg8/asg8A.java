class Employee{
    int id;
    String name,city;
    double basic;
    Employee(int id, String name, String city, double basic)
    {
        this.id=id;
        this.city=city;
        this.basic=basic;
    }
    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Salary: " + salary());
    }
    double salary()
    {
        return basic;
    }
}
class Company1 extends Employee{
    Company1(int id, String name, String city, double basic)
    {
        super(id, name, city, basic);
    }
    double salary()
    {
        double agp = basic*0.4;
        double merged = basic + agp;
        double da = merged*0.25;
        double hra = merged*0.1;
        return merged + da + hra;
    }
}

class Company2 extends Employee{
    Company2(int id, String name, String city, double basic)
    {
        super(id, name, city, basic);
    }
    double salary()
    {
        double agp = basic*0.5;
        double merged = basic + agp;
        double da = merged*0.5;
        double hra = merged*0.15;
        return merged + da + hra;
    }
}

public class asg8A {
    public static void main(String[] args)
    {
        Employee e = new Employee(100, "John", "Chicago", 45000);
        Employee e1 = new Company1(101, "Alice", "New York", 52000);
        Employee e2 = new Company2(102, "Bob", "Los Angeles", 60000);  
        System.out.println("Employee 1 details:");
        e.display();
        System.out.println("\nEmployee 2 details:");
        e1.display();
        System.out.println("\nEmployee 3 details:");
        e2.display();   
    }
}
