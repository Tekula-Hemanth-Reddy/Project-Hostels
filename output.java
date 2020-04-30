package finalpackage;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class output 
{

	output()
	{
	}
	
	public void show(String[][] array)
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		String[] str= {"Hostel_Name","Type","Locality","For_Colleges","Address,Rent","Cost","Google_map_Location","Phone_NO1","Phone_NO2","Gender","Rating","Sharing"};
		JTable table=new JTable(array,str);
		JScrollPane jsp =new JScrollPane(table);
		jf.add(jsp);
	}
	
	
	
}
