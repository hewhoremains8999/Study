import java.io.*;
import javax.swing.*;
import java.awt.*;
class Studentinfo{
	Studentinfo()
	{
		Frame f=new Frame("Studentinfo");
		Label y1=new Label("Student name:");
		y1.setBounds(10,50,200,50);
		f.add(y1);

		Label y2=new Label("Gender:");
		y2.setBounds(10,80,50,50);
		f.add(y2);

Checkbox c2 = new Checkbox("Male");
c2.setBounds(70,80,50,50);
f.add(c2);

Checkbox c3 = new Checkbox("Female");
c3.setBounds(150,80,80,50);
f.add(c3);
JButton button=new JButton("Ok");

button.setBounds(50,150,50,20);
f.add(button);


		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);

		
	}	
	
public static void main(String ar[])
{
new Studentinfo();
} 
}

