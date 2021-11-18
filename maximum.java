import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="maximum.java" width=300 height=400>
</applet>
*/


public class maximum extends Applet implements ActionListener
{
Label l;
Label l1;
Label l2;


TextField t1;
TextField t2;
TextField t3;
TextField t4;

Button b1;

public void init()
{
l=new Label(" first num");
t1=new TextField();
l1=new Label(" sec num");
t2=new TextField();
l2=new Label("Third num");
t3=new TextField();
t4=new TextField();
b1=new Button("max");

add(l);
add(l1);
add(t1);
add(l2);
add(t2);
add(t3);
add(t4);
add(b1);
setLayout(null);

l.setBounds(20,50,80,20);
l1.setBounds(20,100,80,20);
t1.setBounds(200,50,50,20);
l2.setBounds(20,150,80,20);
t2.setBounds(200,100,50,20);
t3.setBounds(200,150,50,20);
t4.setBounds(200,200,50,20);              
b1.setBounds(20,200,50,20);
b1.addActionListener(this);
}


public void actionPerformed(ActionEvent e)
{
int i,j,k;
i=Integer.parseInt(t1.getText());
j=Integer.parseInt(t2.getText());
k=Integer.parseInt(t3.getText());
if(i<j)
{
if(j<k)
t4.setText(""+k);
else
t4.setText(""+j);
}
else
t4.setText(""+i);
}
}

