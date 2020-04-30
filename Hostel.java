package finalpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class Hostel 
{



	String Hostel_Name;
	String Locality;
	String 	Google_map_Location;
	String Phone_NO1;
	String Phone_NO2,Address,Rating,For_Colleges,Cost,Gender,Type,Sharing;
	static int no_of_rows=57;
	
	ArrayList<String> al=new ArrayList<String>();
	
	
	Hostel(String Hostel_Name,String Type,String Locality,String For_Colleges,String Address,String Rent,String Google_map_Location,String Phone_NO1,String Phone_NO2,String Gender,String Rating,String Sharing,ArrayList<String> als)
	{
	
		this.Hostel_Name=Hostel_Name;
		this.Locality=Locality;
		this.Google_map_Location=Google_map_Location;
		this.Phone_NO1=Phone_NO1;
		this.Phone_NO2=Phone_NO2;
		this.Address=Address;
		this.Gender=Gender;
		this.Rating=Rating;
		this.For_Colleges=For_Colleges;
		this.Cost=Cost;
		this.Type=Type;
		this.Sharing=Sharing;
		al=als;
	}
	
	void display()
	{
		System.out.println(
	Hostel_Name+" "+
	 Locality+" "+
	 Google_map_Location+ " "
	+ Phone_NO1+" "+
	"  "+Phone_NO2+ " "+Address+" "+Rating+" "+For_Colleges+" "+Cost+" "+Gender+" "+Type+" "+" "+Sharing);
	}
	
	void addition() throws BiffException, IOException, RowsExceededException, WriteException
	{
	
	FileInputStream fis=new FileInputStream("F:\\javaexcel.xls");
	
	Workbook wb=Workbook.getWorkbook(fis);
	
 	WritableWorkbook copy=Workbook.createWorkbook(new File("C:\\Users\\user\\Documents\\Book3.xls"),wb);
	
	WritableSheet wsheet= copy.getSheet(0);

	int j=0;
	
	System.out.println("Hi "+al);
	
	for(String a:al)
	{
		System.out.println(a);
		
		Label l1=new Label( j,no_of_rows,a);

		
		j++;
		wsheet.addCell(l1);
		
	}
	copy.write();
	copy.close();
	wb.close();
	
	no_of_rows++;
	
	FileInputStream fis1=new FileInputStream("C:\\Users\\user\\Documents\\Book3.xls");
	
	Workbook wb1=Workbook.getWorkbook(fis1);
	
WritableWorkbook copy1=Workbook.createWorkbook(new File("F:\\javaexcel.xls"),wb1);
	
	WritableSheet wsheet1= copy1.getSheet(0);
	
	copy1.write();
	copy1.close();
	wb1.close();
	
	

	
	
/*	
	Label l1=new Label(52,5,"Naa savu nen sasta");
	
	wsheet.addCell(l1);
	copy.write();
	copy.close();
	
	wb.close();
	
	*/
	
	}	
	
	
	
		
		
		
		
		
		
	
	
	
	
	
	
}
