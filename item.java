import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class item extends Applet implements ItemListener{
String msg;
Checkbox W98, WNT,S,IBM;
public void init(){
Checkbox W98 = new Checkbox();
add(W98); 
Checkbox WNT = new Checkbox();
add(WNT);
Checkbox S = new Checkbox();
add(S);
Checkbox IBM = new Checkbox();
add(IBM);
W98.addItemListener(this);
WNT.addItemListener(this);
S.addItemListener(this);
IBM.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie){
repaint();
}
public void paint(Graphics g){
String msg = "Current State";
g.drawString(msg, 6, 80);
msg = "Win 98" + W98.getState();
g.drawString(msg, 7,80);
msg = "Win NT" + WNT.getState();
g.drawString(msg, 8,80);
msg = "Win S" + S.getState();
g.drawString(msg, 9,80);
msg = "Win IBM " + IBM.getState();
}
}
