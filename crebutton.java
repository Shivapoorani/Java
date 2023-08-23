import java.awt.*;
import java.applet.*;
import java.lang.*;
import javax.swing.*;
class F1 extends Frame{
public void F(){
Frame F = new Frame("Tomorrow is a Holidayyyy!!!!!");
F.setSize(600,800);
F.setVisible(true);j
Panel p = new Panel();
F.add (p);
Button b1 =  new Button("YES");
p.add(b1);
Button b2 = new Button("NO");
p.add(b2);
}
}
class crebutton{
public static void main(String args[]){
F1 x = new F1(); 
x.F();
}
}