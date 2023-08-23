import java.awt.*;
import javax.swing.*;
class GL extends Frame{
public void GL(){
Frame F = new Frame("Grid Layout");
F.setSize(800,800);
F.setVisible(true);
Panel p = new Panel();
F.add(p);
Button b1 =  new Button("1");
p.add(b1);
Button b2 = new Button("2");
p.add(b2);
Button b3 =  new Button("3");
p.add(b3);
Button b4 =  new Button("4");
p.add(b4);
Button b5 =  new Button("5");
p.add(b5);
Button b6 =  new Button("6");
p.add(b6);
Button b7 =  new Button("7");
p.add(b7);
Button b8 =  new Button("8");
p.add(b8);
Button b9 =  new Button("9");
p.add(b9);
p.setLayout(new GridLayout(3, 3, 20, 20));
}
}
class gridlay{
public static void main(String args[]){
GL x = new GL();
x.GL();
}
}