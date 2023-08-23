import java.awt.*;
import java.applet.*;
import java.lang.*;
import javax.swing.*;
class F1 extends Frame{
public void F(){
Frame F = new Frame("BIO-DATA");
F.setSize(400,400);
F.setVisible(true);
Panel p = new Panel();
F.add (p);
Label l1 = new Label("Name: ");
p.add(l1);
TextField tf  = new TextField(50);
p.add(tf);
Label l2 = new Label("Father Name: ");
p.add(l2);
TextField tf1  = new TextField(50);
p.add(tf1);
Label l3 = new Label("Date Of Birth: ");
p.add(l3);
TextField tf2  = new TextField(50);
p.add(tf2);
Label l4 = new Label("Qualification: ");
p.add(l4);
TextField tf3  = new TextField(50);
p.add(tf3);
Label l5 = new Label("Address: ");
p.add(l5);
TextField tf4  = new TextField(50);
p.add(tf4);
Label l6 = new Label("Hobbies: ");
p.add(l6);
TextField tf5  = new TextField(50);
p.add(tf5);
Button b = new Button("Submit");
p.add(b);
}
}
class biodata{
public static void main(String args[]){
F1 x = new F1(); 
x.F();
}
}