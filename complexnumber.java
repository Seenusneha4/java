public class complexnumber
{
double real,img;
complexnumber(double r,double i)
{
this.real=r;
this.img=i;
}
public static complexnumber
sum(complexnumber c1, complexnumber c2)
{
complexnumber temp=new complexnumber(0,0);
temp.real=c1.real+c2.real;
temp.img=c1.img+c2.img;
return temp;
}
public static void main(String args[])
{
complexnumber c1=new complexnumber(7.5,6);
complexnumber c2=new complexnumber(1.2,4.5);
complexnumber temp=sum(c1,c2);
System.out.println("   SUM IS "+ temp.real+"+"+temp.img+"i");
}
}
