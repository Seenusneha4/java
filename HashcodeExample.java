class Employee
{
private int regno;
private String name;
public Employee(int regno,String name)
{
this.name=name;
this.regno=regno;
}
public int getRegno()
{
return regno;
}
public void setRegno(int Regno)
{
this.regno=regno;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
}
public class HashcodeExample
{
public static void main(String[] args)
{
Employee emp1=new Employee(918,"Maria");
Employee emp2=new Employee(918,"Maria");
int a=emp1.hashCode();
int b=emp2.hashCode();
System.out.println("hashcode of emp1="+a);
System.out.println("hashcode of emp2="+b);
System.out.println("Comparing objects emp1 and emp2="+emp1.equals(emp2));
}
}


