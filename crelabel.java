import java.awt.*;
import java.applet.*;
import java.lang.*;
import javax.swing.*;
class F1 extends Frame{
public void F(){
Frame F = new Frame("Tomorrow is a Holidayyyy!!!!!");
F.setSize(600,800);
F.setVisible(true);
Panel p = new Panel();
F.add (p);
Label l1 = new Label("Enter Your Name: ");
p.add(l1);
TextField tf  = new TextField(100);
p.add(tf);
Button b1 =  new Button("YES");
p.add(b1);
Button b2 = new Button("NO");
p.add(b2);
Checkbox cb = new Checkbox();
p.add(cb);
}
}
class crelabel{
public static void main(String args[]){
F1 x = new F1(); 
x.F();
}
}