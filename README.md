# Ex-10 Create a class named 'Member'.
## AIM:
To create a class named 'Member' It also has a method named 'printSalary' which prints the salary of the members. Two classes 'Employee' and 'Manager' inherits the 'Member' class.
## PROCEDURE:
### STEP 1:
Create a class Member which has basic details which common to Manager and Employee.
### STEP 2:
Create a class Employee and Manager it has specialization and department.
### STEP 3:
Provide the details to the class member through objects od Manager and Employee.
### STEP 4:
Display the values in the class through the object.
### STEP 5:
End the program.
## PROGRAM:
```java
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
```
## OUTPUT:
![image](https://github.com/Karthikeyan21001828/Java_EX10/assets/93427303/7880697c-f4ac-43e7-846b-33dfa102c182)
## RESULT:
create a class named 'Member' It also has a method named 'printSalary' which prints the salary of the members. Two classes 'Employee' and 'Manager' inherits the 'Member' class has been executed sucessfully.
