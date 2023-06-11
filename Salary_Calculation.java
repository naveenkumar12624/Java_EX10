class Member {
    String name,address;
    int age,phno,salary;
    public void print_Salary()
    {
        System.out.println("Salary:"+salary+"\n");
    }
}
class Manager extends Member{
    String special="Manager",dept="Management";
}
class Employee extends Member {
    String special="Software Engineer",dept="Information technology";
}
public class Salary_Calculation
{
    public static void main(String[] args) {
        Employee e=new Employee();
        Manager m=new Manager();
        e.name="Arun";
        e.address="64C- WallsStreat";
        e.age=25;
        e.phno=1234567890;
        e.salary=35000;

        m.name="Ajay";
        m.address="68D- WallsStreat";
        m.age=30;
        m.phno= 1786594320;
        m.salary=50000;
        System.out.println("Employee Details:");
        System.out.println("Name:"+e.name+"\nAddress:"+e.address+"\nAge:"+e.age+"\nPhone number:"+e.phno);
        e.print_Salary();

        System.out.println("Manager Details:");
        System.out.println("Name:"+m.name+"\nAddress:"+m.address+"\nAge:"+m.age+"\nPhone number:"+m.phno);
        m.print_Salary();

    }
}
