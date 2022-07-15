class Publisher
{
String publisher;
Publisher (String publi)
{
this.publisher=publi;
}
}

class Book
{
String name;
Publisher publisher;
Book (){}
public Book(String name,Publisher publisher)
{
this.name = name;
this.publisher = publisher;
}
}


class Literature extends Book
{
String Littype = "Literature";
Literature (String name, Publisher publisher)
{
super (name, publisher);
}

void display ()
{
System.out.println ("\nName:" + super.name);
System.out.println("\nType: "+ this. Littype);
System.out.println("\nPublisher:" + this.publisher.publisher);
}
}


class Fiction extends Book
{
String Littype="Fiction";
Fiction (String name, Publisher publisher)
{
 super (name, publisher);
}

void display ()
{
System.out.println ("\nName:"+super.name);
System.out.println("\nType: "+ this.Littype);
System.out.println("\nPublisher:" + this.publisher.publisher);
}
}
public class InheritanceBookExample
{
public static void main(String[] args)
{
 Publisher lp= new Publisher ("S.Chand" );
Literature l = new Literature ("As you like it",lp);
l.display ();
Publisher fp = new Publisher ("Tata McGraw Hill");
Fiction f = new Fiction ("Tempest",fp);
f.display();
}
}
