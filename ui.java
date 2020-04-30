package finalpackage;



import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import javax.tools.DocumentationTool.Location;

import jxl.read.biff.BiffException;
import jxl.read.biff.File;
import jxl.write.WriteException;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;



public class ui implements ActionListener
{

	JFrame frame=new JFrame();
	
	//creating two JPannels
	
	JPanel p1,p2;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l9,l8,gender,type,ls,lout,lr;
	JTextField t1,t2,t3,t9,t4,t5,t6,t7,t8;
	JCheckBox cpg,ch,cr,c2s,c3s,c4s;
	JButton submit1,submit2;
	JRadioButton rm,rf,jcb1,jcb2,jcb3,jcb4;
	JMenu m;
	JMenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
	JRadioButton LbNagar,Kompally,Miyapur,LangerHouz,Jntu,Vanasthalipuram,Kukatpally,Dilshuknagar,Hastinapuram;
	
	ButtonGroup location,rating_group;
	
	HostelRetrieval search;
	
	static String loc;
	
	Hostel object; 
	
	public ui()throws IOException
	{
		
	
	
		
		//seting the bounds for the frame
	//	Image img=ImageIO.read(());
			//seting the bounds for the frame
			

		
		frame.setBounds(100,100,752,730);
	//	frame.setIconImage(img);
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //inorder to have X mark
		
		frame.getContentPane().setLayout(null);
		
		
		//The first pannel UI allows user to give input of the details of the Hostel they want to add to our program
		
		p1=new JPanel();
		p1.setBounds(12, 24, 322, 627);
		frame.getContentPane().add(p1);
		p1.setLayout(null);
		
		
		 l=new JLabel("INPUT");
		l.setBounds(57,13,56,16);
		p1.add(l);
		
		 l1=new JLabel("Hostel Name");
		l1.setBounds(12, 49, 90, 16);
		p1.add(l1);
		
		
		 t1=new JTextField(); //hostel Name
		t1.setBounds(22,75,116,22);
		p1.add(t1);
		t1.setColumns(30); //the length of theinput string
		
		 l2=new JLabel("Locality");
		l2.setBounds(12, 110, 90, 16);
		p1.add(l2);
		
		 t2=new JTextField(); 
		t2.setBounds(22,139,116,22);
		p1.add(t2);
		t2.setColumns(30); 
		
		 l3=new JLabel("Google Map Location");
		l3.setBounds(12, 184, 150, 16);
		p1.add(l3);
		
		 t3=new JTextField(); 
		t3.setBounds(22,221,116,22);
		p1.add(t3);
		t3.setColumns(100); 
		
		 l9=new JLabel("Address");
		l9.setBounds(12, 266, 90, 16);
		p1.add(l9);
		
		 t9=new JTextField(); 
		t9.setBounds(22,295,116,22);
		p1.add(t9);
		t9.setColumns(100); 
		
		
		
		
		
		 l4=new JLabel("Rating");
		l4.setBounds(12, 341, 90, 16);
		p1.add(l4);
		
		 t4=new JTextField(); 
		t4.setBounds(22,370,116,22);
		p1.add(t4);
		t4.setColumns(30); 
		
		 l5=new JLabel("For Colleges");
		l5.setBounds(12, 415, 90, 16);
		p1.add(l5);
		
		 t5=new JTextField(); 
		t5.setBounds(22,441,116,22);
		p1.add(t5);
		t5.setColumns(30); 
		
		
		
		//for gender selection
		
		 gender=new JLabel("For");
		gender.setBounds(170, 49, 90, 16);
		p1.add(gender);
		
		 rm=new JRadioButton("Male");
		rm.setBounds(170,74,127,25);
		p1.add(rm);
		
		 rf=new JRadioButton("Female");
		rf.setBounds(170,106,127,25);
		p1.add(rf);
		
		 l6=new JLabel("Hostel PhoneNo 1");
		l6.setBounds(174, 184,113, 16);
		p1.add(l6);
		
		 t6=new JTextField(); 
		t6.setBounds(170,221,116,22);
		p1.add(t6);
		t6.setColumns(30); 

		 l7=new JLabel("Hostel PhoneNo 2");
		l7.setBounds(174, 266,113, 16);
		p1.add(l7);
		
		 t7=new JTextField(); 
		t7.setBounds(170,295,116,22);
		p1.add(t7);
		t7.setColumns(30); 

		 type=new JLabel("TYPE");
		type.setBounds(174, 341,113, 16);
		p1.add(type);
		
		 cpg=new JCheckBox("Paying Guest");
		cpg.setBounds(170,369,113,25);
		p1.add(cpg);
		
		 ch=new JCheckBox("Hostel");
		ch.setBounds(170,406,113,25);
		p1.add(ch);
		
		 cr=new JCheckBox("Rented");
		cr.setBounds(170,436,113,25);
		p1.add(cr);
		
		 l8=new JLabel("Cost");
		l8.setBounds(12, 476,90, 16);
		p1.add(l8);
		
		 t8=new JTextField(); 
		t8.setBounds(22,505,116,22);
		p1.add(t8);
		t8.setColumns(30); 
		
		 ls=new JLabel("Sharing");
		ls.setBounds(170,476,56, 16);
		p1.add(ls);
		
		 c2s=new JCheckBox("2-Sharing");
		c2s.setBounds(170,504,113,25);
		p1.add(c2s);
		
		 c3s=new JCheckBox("3-Sharing");
		c3s.setBounds(170,540,113,25);
		p1.add(c3s);
		
		
		 c4s=new JCheckBox(">3 Sharing");
		c4s.setBounds(170,581,113,25);
		p1.add(c4s);
		
		 submit1=new JButton("SUBMIT1");
		submit1.setBounds(41,566,97,25);
		p1.add(submit1);
		submit1.addActionListener(this);
		
		
		p2=new JPanel();
		p2.setBounds(360,24,361,627);
		frame.getContentPane().add(p2);
		p2.setLayout(null);

		
		
		 lout = new JLabel("OUTPUT");
		lout.setBounds(141, 29, 56, 16);
		p2.add(lout);
		
		JLabel l2l = new JLabel("Locations");
		l2l.setBounds(51,52,56,16);
		p2.add(l2l);
		
		 location = new ButtonGroup();
		
		
		 LbNagar = new JRadioButton("LB Nagar");
		LbNagar.setBounds(45, 77, 123, 24);
		location.add(LbNagar);
		LbNagar.addActionListener(this);
		p2.add(LbNagar);
		
		 Kompally = new JRadioButton("Kompally");
		Kompally.setBounds(45, 101, 123, 24);
		location.add(Kompally);
		Kompally.addActionListener(this);
		p2.add(Kompally);
		
		 Miyapur = new JRadioButton("Miyapur");
		Miyapur.setBounds(45, 125, 123, 24);
		location.add(Miyapur);
		Miyapur.addActionListener(this);
		p2.add(Miyapur);
		
		 LangerHouz = new JRadioButton("Langer Houz");
		LangerHouz.setBounds(45, 149, 123, 24);
		location.add(LangerHouz);
		LangerHouz.addActionListener(this);
		p2.add(LangerHouz);
		
		
		
		 Jntu = new JRadioButton("JNTU");
		Jntu.setBounds(45, 197, 123, 24);
		location.add(Jntu);
		Jntu.addActionListener(this);
		p2.add(Jntu);
		
		 Vanasthalipuram = new JRadioButton("Vanasthalipuram");
		Vanasthalipuram.setBounds(45, 221, 123, 24);
		location.add(Vanasthalipuram);
		Vanasthalipuram.addActionListener(this);
		p2.add(Vanasthalipuram);
		
		 Kukatpally = new JRadioButton("Kukatpally");
		Kukatpally.setBounds(45, 173, 123, 24);
		location.add(Kukatpally);
		Kukatpally.addActionListener(this);
		p2.add(Kukatpally);
		
		 Dilshuknagar = new JRadioButton("DilshukNagar");
		Dilshuknagar.setBounds(45, 260, 123, 24);
		location.add(Dilshuknagar);
		Dilshuknagar.addActionListener(this);
		p2.add(Dilshuknagar);
		
		 Hastinapuram = new JRadioButton("Hastinapuram");
		Hastinapuram.setBounds(45, 284, 123, 24);
		location.add(Hastinapuram);
		Hastinapuram.addActionListener(this);
		p2.add(Hastinapuram);
		
		
		 lr = new JLabel("RATING");
		lr.setBounds(51, 360, 56, 16);
		p2.add(lr);
		
		rating_group=new ButtonGroup();
		
		 jcb1 = new JRadioButton("4 TO 5");
		jcb1.setBounds(41, 395, 113, 25);
		rating_group.add(jcb1);
		p2.add(jcb1);
		
		
		
		 jcb2 = new JRadioButton("3 TO 4");
		jcb2.setBounds(41, 418, 113, 25);
		rating_group.add(jcb2);
		p2.add(jcb2);
		
		 jcb3 = new JRadioButton("2 TO 3");
		jcb3.setBounds(41, 448, 113, 25);
		rating_group.add(jcb3);
		p2.add(jcb3);
		
		 jcb4 = new JRadioButton("BELOW 2");
		jcb4.setBounds(41, 473, 113, 25);
		rating_group.add(jcb4);
		p2.add(jcb4);
		
		submit2 = new JButton("SUBMIT2");
		submit2.setBounds(207, 508, 97, 25);
		submit2.addActionListener(this);
		p2.add(submit2);
		 JTabbedPane tp=new JTabbedPane();  
		    tp.setBounds(50,50,500,2000);  
		    tp.add("main",p1);  
		    tp.add("visit",p2);  
		    //tp.add("help",p3);    
		    frame.add(tp);  
		    frame.setVisible(true);
		
		
		
		
	//_NO2,String Address,String Rating,String For_Colleges,String Cost,String Gender,String Type,String Sharing)	
		
		
}

	
	public void actionPerformed(ActionEvent e) 
	{
		ArrayList<String> str=new ArrayList<String>();
		
		String temp=e.getActionCommand();
		
		
		if(temp.equalsIgnoreCase("SUBMIT1"))
		{
			str.add(t1.getText()); //refers to hostel name
			t1.setText("");
			
			
		
			
			String temp2="";
			if(cpg.isSelected())
			{
				temp2=temp2+" PayingGuests";
				cpg.setSelected(false);
			}
			if(ch.isSelected())
			{
				temp2=temp2+" Hostels";
				ch.setSelected(false);
			}
			if(cr.isSelected())
			{
				temp2=temp2+" Rented";
				cr.setSelected(false);
			}
			
			str.add(temp2);
			
						
			
			str.add(t2.getText());//refers to Locality
			t2.setText("");
			
			str.add(t5.getText()); //colleges
			t5.setText("");
			
			str.add(t9.getText());//address
			t9.setText("");
			
			str.add(t8.getText());//cost
			t8.setText("");
			
			str.add(t3.getText());//gmp
			t3.setText("");
			
			str.add(t6.getText());//phoneno1
			t6.setText("");
			
			str.add(t7.getText());//phoneno2
			t7.setText("");
			
			
			
//for gender Radio Button
			
			if(rm.isSelected() && rf.isSelected())
			{
				str.add("Male&Female");
				rm.setSelected(false);
				rf.setSelected(false);
			}
			else if(rm.isSelected())
			{
				str.add("Male");
				rm.setSelected(false);
			}
			else
			{
				str.add("Female");
				rf.setSelected(false);
			}
			
				
			str.add(t4.getText());//rating
			t4.setText("");
		
//sharing
			
			temp2="";
			
			if(c2s.isSelected())
			{
				temp2=temp2+" 2 ";
				c2s.setSelected(false);
			}
			if(c3s.isSelected())
			{
				temp2=temp2+" 3 ";
				c3s.setSelected(false);
			}
			if(c4s.isSelected())
			{
				temp2=temp2+" >3 ";
				c4s.setSelected(false);
			}
			temp2=temp2+"--Sharing";
			str.add(temp2);

			

			
			
			
			object=new Hostel(str.get(0),str.get(1),str.get(2),str.get(3),str.get(4),str.get(5),str.get(6),str.get(7),str.get(8),str.get(9),str.get(10),str.get(11),str);
			
			object.display();
			
			try {
				object.addition();
			} catch (BiffException | WriteException | IOException e1) {
				
				e1.printStackTrace();
			}
			
		}
		
		
		if(!temp.equalsIgnoreCase("SUBMIT1") && !temp.equalsIgnoreCase("SUBMIT2"))
		{
			loc=temp;
		}
		
		if(temp.equalsIgnoreCase("SUBMIT2"))
		{
			String checkboxvalues="";
			
			if(jcb1.isSelected())
			{
				checkboxvalues=checkboxvalues+"45";
				jcb1.setSelected(false);
			}
			
			if(jcb2.isSelected())
			{
				checkboxvalues=checkboxvalues+"34";
				jcb2.setSelected(false);
			}
			
			if(jcb3.isSelected())
			{
				checkboxvalues=checkboxvalues+"23";
				jcb3.setSelected(false);
			}
			if(jcb4.isSelected())
			{
				checkboxvalues=checkboxvalues+"02";
				jcb4.setSelected(false);
			}
			
			System.out.println(checkboxvalues+"    "+loc);
			
			search=new HostelRetrieval(loc,checkboxvalues);
			
			try {
				search.fun();
			} catch (BiffException | IOException e1) {
				
				e1.printStackTrace();
			}
			
			
		}
		
		
		
		
		
	}
		
		
	
}
