import java.util.Scanner;
class Person 
{
String Name, Gender,Address;
protected int Age;
public Person()
{

}
public Person (String n , String g, String addr, int a)
{
this.Name=n;
this.Gender=g;
this.Address =addr;
this.Age=a;
}
public void displayPerson()
{
System.out.println("Name:___"+Name);
System.out.println("Gender:___"+ Gender);
System.out.println("Address:___" + Address);
System.out.println("Age:____"+Age);
}
}
class Employee extends Person
{
int Empid,Salary;
String Company_name,Qualification;
public Employee()
{

}
public Employee (String n,String g , String addr, int a,int eid,String cname,String qual, int sal)
{
super(n,g,addr,a);
Empid=eid;
Company_name=cname;
Qualification=qual;
Salary=sal;
}
public void displayEmployee() 
{
super.displayPerson ();
System.out.println("Empid:___"+Empid); 
System.out.println("Company name:___" +Company_name);
System.out.println("Qualification :___"+Qualification);
System.out.println("Salary:___"+ Salary);
}
}
class Teacher1 extends Employee
{
String Subject,Department;
int Teacherid;
public Teacher1(String n, String g, String addr, int a,int eid, String cname, String qual, int sal ,String sub, String dept,int tid)
{
super(n,g,addr,a, eid, cname, qual, sal );
Subject=sub;
Department=dept;
Teacherid=tid;
}
public void displayTeacher()
 {
super.displayEmployee();
System.out.println ("Teacher_id____"+Teacherid); 
System.out.println("Subject :____"+ Subject);
System.out.println ("Department:____"+ Department);
}
}
public class InheritencePersonExample 
{
public static void main(String args[])
{
System.out.println("Enter number of teachers" );
Scanner sc = new Scanner (System.in);
int N= sc.nextInt ();
Teacher1[] teacherls = new Teacher1[N];
Scanner scs = new Scanner(System.in);
for (int i = 0; i<N;i++)
{
System.out.println("Enter_name_of_the_teacher."); 
String name=scs.next();
System.out.println("Enter_gender of the teacher."); 
String gen=scs.next(); 
System.out.println("Enter address of the teacher.");
String addr = scs.next();
System.out.println("Enter age of the teacher."); 
int ag = sc.nextInt ();
System.out.println("Enter Empid_of_the_teacher.");
int eid=sc.nextInt ();
System.out.println("Enter Company name.");
String cn=scs.next();
System.out.println("Enter qualification of the teacher.");
String quali = scs. next(); 
System.out.println("Enter_salary of the teacher.");
int sal=sc. nextInt (); 
System.out.println("Enter Teacher_id");
int tid=sc.nextInt ();
System.out.println("Enter Subject of the teacher.");
String sub=scs.next(); 
System.out.println("Enter Department of the teacher.");
String dept = scs.next(); 
Teacher1 t= new Teacher1 (name, gen, addr, ag, eid, cn, quali,sal,sub, dept, tid);
teacherls[i] = t;
}
for (Teacher1 t:teacherls)
{
t. displayTeacher();
}
}
}

