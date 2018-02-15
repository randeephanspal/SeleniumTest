package com.test.utility;

import java.util.ArrayList;

import com.datadriven.test.Xls_Reader;

public class TestUtil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try{
			reader = new Xls_Reader("C:\\Users\\test\\workspace\\Selenium\\src\\com\\datadriven\\test\\EbayTestData.xlsx");
		}catch (Exception e){
			e.printStackTrace();
			}
		
		for(int rowNum=2; rowNum<=reader.getRowCount("RegistrationTestData"); rowNum++){
			String firstname = reader.getCellData("RegistrationTestData", "firstname", rowNum);			
			String lastname = reader.getCellData("RegistrationTestData", "lastname", rowNum);			
			String email = reader.getCellData("RegistrationTestData", "email", rowNum);			
			String password = reader.getCellData("RegistrationTestData", "password", rowNum);			
			
			Object ob[] = {firstname, lastname, email, password};
			myData.add(ob);	
	}
	return myData;

}
}
