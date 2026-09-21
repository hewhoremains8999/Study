import java.io.*;
import javax.swing.*;

class app{
public static void main(String[] a){

JFrame frame=new JFrame("Helloworld");

JButton button=new JButton("Click Me");

button.setBounds(150,200,220,50);
frame.add(button);
frame.setSize(500,600);
frame.setLayout(null);
frame.setVisible(true);



}
}