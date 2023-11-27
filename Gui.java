import java.awt.event.*;
import javax.swing.*;
class Gui implements ActionListener{
JFrame f;
JLabel u,p,str;
JTextField ul;
JPasswordField pl;
JButton l,r;
JCheckBox c;
Gui(){
f=new JFrame();
f.setSize(300,300);
f.setVisible(true);
f.setLayout(null);
u=new JLabel("User name");
p=new JLabel("Password");
str=new JLabel("This is registration from");
ul=new JTextField(20);
pl=new JPasswordField(20);
l=new JButton("Login");
r=new JButton("Reset");
c=new JCheckBox("Showpassword");
str.setBounds(50,80,400,100);
u.setBounds(50,150,100,30);
ul.setBounds(155,150,100,30);
p.setBounds(50,190,100,30);
pl.setBounds(155,190,100,30);
c.setBounds(60,220,200,100);
l.setBounds(50,320,100,30);
r.setBounds(155,320,100,30);

f.add(u);
f.add(p);
f.add(ul);
f.add(pl);
f.add(l);
f.add(r);
f.add(c);
f.add(str);
l.addActionListener(this);
r.addActionListener(this);
c.addActionListener(this);
}
public void actionperformed(ActionEvent e)
{
if(e.getSource()==l)
{
if(ul.getText().equalsIgnoreCase("sudh")&&pl.getText().equalsIgnoreCase("svecw"))
{
JOptionPane.showMessageDialog(f,"login successfull");
}
else
JOptionPane.showMessageDialog(f,"login invalid");

}

if(e.getSource()==r)
{
ul.setText("");
pl.setText("");
}
if(e.getSource()==c){
    if(c.isSelected()){
        pl.setEchoChar((char)0);
    }
    else
    pl.setEchoChar('*');
    }
}

public static void main(String[] args){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new Gui();
}
});
}
}


