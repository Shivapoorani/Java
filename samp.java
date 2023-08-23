import java.awt.*;
import java.applet.*;
import java.lang.*;
import javax.swing.*;
class F1 extends Frame{
public void F(){
Frame F = new Frame("Bio-Data");
F.setSize(400,400);
F.setVisible(true);
Panel p = new Panel();
F.add(p);
Label a = new Label("Name");
p.add(a);
TextField a1 = new TextField(200);
p.add(a1);
Label b = new Label("Age");
p.add(b);
TextField b1 = new TextField(200);
p.add(b1);
Label c = new Label("Mail Id");
p.add(c);
TextField c1 = new TextField(200);
p.add(c1);
Label d = new Label("Qualification");
p.add(d);
TextField d1 = new TextField(200);
p.add(d1);
}
}
class samp{
public static void main(String args[]){
F1 x = new F1();
x.F();
}
}