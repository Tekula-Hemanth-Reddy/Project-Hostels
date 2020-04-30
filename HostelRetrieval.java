package finalpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.*;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class HostelRetrieval 
{

	String locality;
	String Rating;
	static int x;
	float no;
	output ou=new output();
	
	String[][] array=new String[51][12];
	
	HostelRetrieval(String locality,String Rating)
	{
		this.locality=locality;
		
		this.Rating=Rating;
	}

	public void fun() throws BiffException, IOException 
	{
		String filepath="F:\\javaexcel.xls";
	
FileInputStream fis=new FileInputStream(filepath);
		
		Workbook wb= Workbook.getWorkbook(fis);
		
		Sheet sh=wb.getSheet(0);
		
		int totalnoofrows=sh.getRows();
	
		System.out.println(totalnoofrows);
	
		
		no=Integer.parseInt(Rating);
		
		no=no%10;
		
	

		
		Cell c1;
		Cell c2;
		Cell c3;
		
		
		
	
		
		
		
		for(int i=2;i<totalnoofrows;i++)
		{
			c1=sh.getCell(2,i);
			c3=sh.getCell(10,i);
			
			
			
			
			
			String tempstring=c3.getContents();
			
		
			float value=Float.valueOf(tempstring);
			
			
			
			if((no-1<value) &&(value <=no))
			{
			
			
				String localstring=c1.getContents();
			
				if(localstring.equalsIgnoreCase(locality))
				{
					
					int j=0;
					
					while(j<11)
					{
						c2=sh.getCell(j,i);
					//	System.out.println(c2.getContents());
						
						array[x][j]=c2.getContents();
						
						
						j++;
						
						
						
						
					}
					x++;
				}
			}
		
		
		}
		
		
		int iter=0;
	/*	
		for(String[] s:array)
		{
			for(String str:s)
			{
				System.out.print(str+" ");
			}
			System.out.println();
			iter++;
			if(iter>=x)
			{
				break;
			}
		}*/
		
		
		for(int q=0;q<x;q++)
		{
			for(int a=0;a<11;a++)
			{
				System.out.println(array[q][a]);
			}
		}
		
		ou.show(array);
		

		
		
		
		
	}
	
	
	
	
	
	
	
	
}
