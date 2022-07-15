import java.util.Scanner;
class EmployeeT
{
int empid;
String name;
float salary;
String address;
EmployeeT()
{
}
EmployeeT(int empid,String name,float salary,String address)
{
this.empid=empid;
this.name=name;
this.salary=salary;
this.address=address;
}
}
class Teacher extends EmployeeT
{
String dept,sub;
Teacher(int empid,String name,float salary,String address,String dept,String sub)
{
super(empid,name,salary,address);
this.dept=dept;
this.sub=sub;
}
public void display()
{
System.out.println("\nTeacher id\n" +empid);
System.out.println("\nTeacher name\n" +name);
System.out.println("\nTeacher salary\n"+salary);
System.out.println("\nTeacher address\n" +address);
System.out.println("\nTeacher department\n" +dept);
System.out.println("\nTeacher subject\n"+sub);
}
}
public class Techarrays
{
public static void main(String args[])
{
System.out.println("Enter number of teachers");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Enter teacher details one by one");
Teacher teacher[]=new Teacher[n];
Scanner sc1=new Scanner(System.in);
int tid;
String name;
float salary;
String add;
String dept,sub;
for(int i=0;i<n;i++)
{
System.out.println("Enter teacher id");
tid=sc1.nextInt();
System.out.println("Enter teacher name");
name=sc1.next();
System.out.println("Enter teacher salary");
salary=sc1.nextFloat();
System.out.println("Enter teacher address");
add=sc1.next();
System.out.println("Enter teacher department");
dept=sc1.next();
System.out.println("Enter teacher subject");
sub=sc1.next();
Teacher t=new Teacher(tid,name,salary,add,dept,sub);
teacher[i]=t;
}
for(Teacher x:teacher)
{
x.display();
System.out.println("\n");
}
}
}
