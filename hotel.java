import java.awt.*;
import java.applet.*;
import java.lang.*;
import javax.swing.*;
class F1 extends Frame{
public void F(){
Frame F = new Frame("Swetha Restaurent");
F.setSize(600,800);
F.setVisible(true);
Panel p = new Panel();
F.add (p);
MenuBar mb = new MenuBar();
F.setMenuBar(mb);
Menu m = new Menu("VEG");
mb.add(m);
Menu m1 = new Menu("Idly");
m.add(m1);
MenuItem i1 = new MenuItem("Rs.25");
m1.add(i1);
Menu m2 = new Menu("Dosa");
m.add(m2);
MenuItem i2 = new MenuItem("Rs.35");
m2.add(i2);
Menu m3 = new Menu("Veg Briyani");
m.add(m3);
MenuItem i3 = new MenuItem("Rs.60");
m3.add(i3);
Menu m4 = new Menu("Panner Fried Rice");
m.add(m4);
MenuItem i4 = new MenuItem("Rs.85");
m4.add(i4);
Menu n= new Menu("NON-VEG");
mb.add(n);
Menu m5 = new Menu("Egg Omlet");
n.add(m5);
MenuItem i5 = new MenuItem("Rs.30");
m5.add(i5);
Menu m6 = new Menu("Mutton Dosa");
n.add(m6);
MenuItem i6 = new MenuItem("Rs.115");
m6.add(i6);
Menu m7 = new Menu("Chicken Briyani");
n.add(m7);
MenuItem i7 = new MenuItem("Rs.150");
m7.add(i7);
Menu m8 = new Menu("Chicken Fried Rice");
n.add(m8);
MenuItem i8 = new MenuItem("Rs.100");
m8.add(i8);
}
}
class hotel{
public static void main(String args[]){
F1 x = new F1(); 
x.F();
}
}

