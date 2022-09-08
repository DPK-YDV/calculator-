import java.awt.*;
import java.awt.event.*;

class calc implements ActionListener
{
Frame f;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bm,bs,bd,be,bc;
TextField t1;
int a,b,c;
String opt;
calc()
{
f=new Frame("Calculator");
t1=new TextField();
b0=new Button("0");
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
bp=new Button("+");
bm=new Button("*");
bs=new Button("-");
bd=new Button("/");
be=new Button("=");
bc=new Button("Clear");
f.setLayout(null);
t1.setBounds(20,40,180,20);
b1.setBounds(30,70,30,30);
b2.setBounds(70,70,30,30);
b3.setBounds(110,70,30,30);
b4.setBounds(150,70,30,30);
b5.setBounds(30,110,30,30);
b6.setBounds(70,110,30,30);
b7.setBounds(110,110,30,30);
b8.setBounds(150,110,30,30);
b9.setBounds(30,150,30,30);
b0.setBounds(70,150,30,30);
be.setBounds(110,150,70,30);

bp.setBounds(30,190,30,30);
bm.setBounds(70,190,30,30);
bs.setBounds(110,190,30,30);
bd.setBounds(150,190,30,30);
bc.setBounds(70,230,70,30);
f.add(t1);
f.add(b0);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(bp);
f.add(bm);
f.add(bs);
f.add(bd);
f.add(be);
f.add(bc);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
bp.addActionListener(this);
bm.addActionListener(this);
bs.addActionListener(this);
bd.addActionListener(this);
be.addActionListener(this);
bc.addActionListener(this);
f.setSize(220,270);
f.setVisible(true);

}

public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();
if(s.equals("Clear"))
{
t1.setText("");
}
else if(s.equals("+"))
{
a=Integer.parseInt(t1.getText());
t1.setText("");
opt="+";
}
else if(s.equals("-"))
{
a=Integer.parseInt(t1.getText());
t1.setText("");
opt="-";
}
else if(s.equals("*"))
{
a=Integer.parseInt(t1.getText());
t1.setText("");
opt="*";
}
else if(s.equals("/"))
{
a=Integer.parseInt(t1.getText());
t1.setText("");
opt="/";
}
else if(s.equals("="))
{
b=Integer.parseInt(t1.getText());
if(opt.equals("+"))
c=a+b;
else if(opt.equals("-"))
c=a-b;
else if(opt.equals("*"))
c=a*b;
else if(opt.equals("/"))
c=a/b;

t1.setText(Integer.toString(c));
}

else
{
t1.setText(t1.getText()+s);
}
}

public static void main(String ar[])
{
new calc();
}
}
