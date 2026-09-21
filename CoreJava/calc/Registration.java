import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
	private Container c;
	private JLabel name;
	private JLabel title;
	private JTextField tname;
	private JLabel mno;
	private JTextField tmno;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel dob;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel add;
	private JTextArea tadd;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;

private String dates[]={
	"1","2","3","4","5","6","7","8",
	"9","10","11","12","13","14","15","16",
	"17","18","19","20","21","22","23","24",
	"25","26","27","28","29","30","31"};
private String months[]={
	"Jan","feb","Mar","Apr",
	"May","Jun","July","Aug",
	"Sup","Oct","Nov","Dec"};
private String years[]={
	"1995","1996","1997","1998","1999","2000","2001","2002",
	"2003","2004","2005","2006","2007","2008","2009","2010",
	"2011","2012","2013","2014","2015","2016","2017","2018",
	"2019"};


public MyFrame(){
	setTitle("Registration Form");
	setBounds(300,90,900,600);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);

	c=getContentPane();
	c.setLayout(null);

	title=new JLabel("Registration Form");
	title.setFont(new Font("Arial",Font.PLAIN,30));
	title.setLocation(300,30);
	title.setSize(300,30);
	c.add(title);

	name=new JLabel("Name");
	name.setFont(new Font("Arial",Font.PLAIN,20));
	name.setLocation(100,100);
	name.setSize(100,20);
	c.add(name);

	tname=new JTextField();
	tname.setFont(new Font("Arial",Font.PLAIN,15));
	tname.setLocation(200,100);
	tname.setSize(190,20);
	c.add(tname);

	mno=new JLabel("Mobile");
	mno.setFont(new Font("Arial",Font.PLAIN,20));
	mno.setLocation(100,150);
	mno.setSize(100,20);
	c.add(mno);

	tmno=new JTextField();
	tmno.setFont(new Font("Arial",Font.PLAIN,20));
	tmno.setLocation(200,150);
	tmno.setSize(150,20);
	c.add(tmno);

	gender=new JLabel("Gender");
	gender.setFont(new Font("Arial",Font.PLAIN,20));
	gender.setLocation(100,200);
	gender.setSize(100,20);
	c.add(gender);

	male=new JRadioButton("Male");
	male.setFont(new Font("Arial",Font.PLAIN,20));
	male.setLocation(200,200);
	male.setSize(75,20);
	c.add(male);

	female=new JRadioButton("female");
	female.setFont(new Font("Arial",Font.PLAIN,20));
	female.setLocation(275,200);
	female.setSize(80,20);
	c.add(female);

	gengp= new ButtonGroup();
	gengp.add(male);
	gengp.add(female);	

	dob=new JLabel("DOB");
	dob.setFont(new Font("Arial",Font.PLAIN,20));
	dob.setLocation(100,250);
	dob.setSize(100,20);
	c.add(dob);

	date=new JComboBox(dates);
	date.setFont(new Font("Arial",Font.PLAIN,15));
	date.setLocation(200,250);
	date.setSize(50,20);
	c.add(date);

	month=new JComboBox(months);
	month.setFont(new Font("Arial",Font.PLAIN,15));
	month.setLocation(250,250);
	month.setSize(60,20);
	c.add(month);

	year=new JComboBox(years);
	year.setFont(new Font("Arial",Font.PLAIN,15));
	year.setLocation(320,250);
	year.setSize(60,20);
	c.add(month);

	add=new JLabel("Address");
	add.setFont(new Font("Arial",Font.PLAIN,20));
	add.setLocation(100,300);
	add.setSize(100,20);
	c.add(add);
	
	tadd = new JTextArea();
	tadd.setFont(new Font("Arial",Font.PLAIN,15));
	tadd.setLocation(200,300);
	tadd.setSize(200,75);
	tadd.setLineWrap(true);
	c.add(tadd);
	
	term=new JCheckBox("Accept Terms And Condtions.");
	term.setFont(new Font("Arial", Font.PLAIN ,15));
	term.setLocation(150,400);
	term.setSize(250,20);
	c.add(term);
	
	sub=new JButton("Submit");
	sub.setFont(new Font("Arial", Font.PLAIN ,15));
	sub.setLocation(150,450);
	sub.setSize(100,20);
	sub.addActionListener(this);
	c.add(sub);
		
	reset=new JButton("Reset");
	reset.setFont(new Font("Arial", Font.PLAIN ,15));
	reset.setLocation(270,450);
	reset.setSize(100,20);
	reset.addActionListener(this);
	c.add(reset);
	
	tout = new JTextArea();
	tout.setFont(new Font("Arial",Font.PLAIN,15));
	tout.setLocation(500,100);
	tout.setSize(300,400);
	tout.setLineWrap(true);
	tout.setEditable(false);
	c.add(tout);
		
	res=new JLabel("");
	res.setFont(new Font("Arial",Font.PLAIN,20));
	res.setLocation(100,500);
	res.setSize(500,25);
	c.add(res);

	resadd = new JTextArea();
	resadd.setFont(new Font("Arial",Font.PLAIN,20));
	resadd.setLocation(580,175);
	resadd.setSize(200,75);
	resadd.setLineWrap(true);
	c.add(resadd);

	setVisible(true);
	
}

public void actionPerformed(ActionEvent e)
{
	if (e.getSource()== sub){
		if (term.isSelected()){
			String data1;
			String data="Name :" + tname.getText()+"\n"+"Mobile: "+tmno.getText()+"\n";
			if(male.isSelected())
				data1="Gender : Male"+"\n";
			else 
				data1="Gender : Female"+"\n";
			
			String data2="DOB: "+ (String)date.getSelectedItem() +"/"+(String)month.getSelectedItem()+"/"+(String)year.getSelectedItem()+"\n";
			String data3="Address: "+tadd.getText();
			tout.setText(data +data1+data2+data3);	
			tout.setEditable(false);
			res.setText("Registration Successfully..");		
}
		else{
			tout.setText("");
			resadd.setText("");
			res.setText("Please accept the" + " terms & condition.. ");
}		
}
	else if (e.getSource()==reset){
		String def = "";
		tname.setText(def);
		tadd.setText(def);
		tmno.setText(def);
		res.setText(def);
		tout.setText(def);
		term.setSelected(false);
		date.setSelectedIndex(0);
		month.setSelectedIndex(0);
		year.setSelectedIndex(0);
		resadd.setText(def);
	} 
}
}

class Registration{
		public static void main(String[] args) throws Exception
	{
		MyFrame f = new MyFrame();
	}
}

