import org.shape.*;
import java.util .*;
class TestPackage
{
public static void main(String[ ] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of the Square : ");
int s=sc.nextInt();
Square sq=new Square(s);
System.out.println("Area of  Square is "+ sq . area( ));
System.out.println( " Enter the radius of the Circle : " );
int r=sc.nextInt();
Circle ci=new Circle(s);
System.out.println( "Area of Circle is "+ ci . area());
System.out.println( "Enter the Side1 of the Triangle :");
int s1=sc.nextInt();
System.out.println( "Enter the Side2 of the Triangle: ");
int s2=sc.nextInt();
System.out.println("Enter the Side3 of the Triangle : ");
int s3=sc.nextInt();
Triangle t=new Triangle(s1,s2,s3);
System.out.println("Area of T riangle is "+ t .area( ));
}
}
