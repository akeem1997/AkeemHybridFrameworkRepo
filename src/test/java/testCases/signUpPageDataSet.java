package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepo.openCartHomePage;
import objectRepo.registerAccount;
import utility.baseclass;

public class signUpPageDataSet extends baseclass {
	
	@Test(priority = 0)
	public void browserOpen() {
		openBrowser("firefox");
		
	}
	
	@Test(priority = 2)
	public void url() {
		openUrl();
	}
	@Test(priority = 3)
	public void account() {
		openCartHomePage.clickMyAccount();
	}
	
	@Test(priority = 4)
	public void register() {
		objectRepo.register.clickRegister();
	}
	
	@Test(priority = 5, dataProvider = "getCommerce")
	public void registerAccountFill(String fname, String lname, String mail, String pass, String subscribe) throws Exception{
		
		registerAccount.registerAccountFill(fname, lname, mail, pass, subscribe);
		Thread.sleep(3000);
		
		
		
	}
	
	@DataProvider
	public String [][] getCommerce() throws Exception {
		File excelfile = new File("C:\\Users\\akeem\\eclipse-workspace\\commerce\\src\\main\\java\\dataset\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fis = new FileInputStream(excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("core");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfCols = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[noOfRows][noOfCols];
		for(int i = 0; i<noOfRows; i++) {
			for(int j=0; j<noOfCols; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		workbook.close();
		fis.close();
		return data;
	}
	
	
	@Test(priority = 7)
	public void close() {
		quit();
	}

}
