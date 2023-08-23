import java.awt.*;
import java.applet.*;
import java.lang.*;
import javax.swing.*;
class F1 extends JFrame{
public void F(){
JFrame F = new JFrame("Notepad");
F.setSize(600,800);
F.setVisible(true);
Panel p = new Panel();
F.add (p);
JMenuBar mb = new MenuBar();
F.setMenuBar(mb);
Menu m = new Menu("File");
mb.add(m);
MenuItem m1 = new MenuItem("New");
m.add(m1);
MenuItem m2 = new MenuItem("Open");
m.add(m2);
MenuItem m3 = new MenuItem("Save");
m.add(m3);
MenuItem m4 = new MenuItem("Exit");
m.add(m4);
Menu n = new Menu("Edit");
mb.add(n);
MenuItem m5 = new MenuItem("Undo");
n.add(m5);
MenuItem m6 = new MenuItem("Paste");
n.add(m6);
MenuItem m7 = new MenuItem("Find");
n.add(m7);
MenuItem m8 = new MenuItem("Replace");
n.add(m8);
Menu k = new Menu("Format");
mb.add(k);
MenuItem k9 = new MenuItem("Word Wrap");
k.add(k9);
MenuItem m10 = new MenuItem("Font");
k.add(m10);
Menu l= new Menu("View");
mb.add(l);
MenuItem m11 = new MenuItem("Zoom");
l.add(m11);
MenuItem m12 = new MenuItem("Status Bar");
l.add(m12);
Menu o= new Menu("Help");
mb.add(o);
MenuItem o13 = new MenuItem("Send Feedback");
o.add(o13);
MenuItem o14 = new MenuItem("About Notepad");
o.add(o14);
JRadioButton = new JRadioButton();
}
}
class radiobutton{
public static void main(String args[]){
F1 x = new F1(); 
x.F();
}
}