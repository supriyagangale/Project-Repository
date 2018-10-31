package Goibibo_Menu;

import java.io.BufferedWriter;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import POM.Flight_POM;
import Functions.Flight_ExcelFunction;
import Functions.Screenshot_Function;
import Functions.TextFile;
import Functions.FileDirectory;



public class Flight {

	 WebDriver driver = new ChromeDriver();
	JavascriptExecutor jse;


	@Test
	
	public void FlightDetails() throws Exception {
		
	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://www.goibibo.com/");

			System.out.println("******************Url Opened Successfully!**************");

		
		
		Flight_ExcelFunction GE = new Flight_ExcelFunction(
				"E:\\SELENIUM_JAVA\\GoibiboProject\\Excel_Files\\GoExcel.xlsx", "Sheet1");
		
		
		
		// CREATE DIRECTORY TO SAVE OUTPUT
		
		FileDirectory.Directory();
		
		
		// *********************** EXCEL DATA AND WRITE DATA IN FILE********************************************//
		
	
		String filepath="E:\\SELENIUM_JAVA\\GoibiboProject\\TextFiles\\GoTextFile.txt";
		BufferedWriter bufferwrt = TextFile.CreateFile(filepath);

		System.out.println("************************EXCEL SHEET DATA******************************");
		
		
		String Depart = GE.getCellData(3, 0);
		System.out.println("Depart:" + Depart);
		bufferwrt.write(Depart);
		bufferwrt.newLine();

		
		String Dest = GE.getCellData(3, 1);
		System.out.println("Dest:" + Dest);
		bufferwrt.write(Dest);
		bufferwrt.newLine();

		String Firstname = GE.getCellData(3, 2);
		System.out.println("First name: " + Firstname);
		bufferwrt.write(Firstname);
		bufferwrt.newLine();
		
		String Middlename = GE.getCellData(3, 3);
		System.out.println("Middle name: " + Middlename);
		bufferwrt.write(Middlename);
		bufferwrt.newLine();
		
		String Lastname = GE.getCellData(3, 4);
		System.out.println("Last name: " + Lastname);
		bufferwrt.write(Lastname);
		bufferwrt.newLine();

		String email = GE.getCellData(3, 5);
		System.out.println("EmailId: " + email);
		bufferwrt.write(email);
		bufferwrt.newLine();

		String mobile = GE.getCellData(3, 6);
		System.out.println("Mobile: " + mobile);
		bufferwrt.write(mobile);
		bufferwrt.newLine();
		
		bufferwrt.close();
		
		
		// **************************************** SEARCH FLIGHT ********************************************//
		
		
		try {
			// One Way
			Flight_POM.Oneway_radiobtn(driver).click();

			// depart
			Flight_POM.Depart_text(driver).sendKeys(Depart);
			Flight_POM.Depart_sugtn(driver).click();

			// Destination
			Flight_POM.Dest_text(driver).sendKeys(Dest);
			Flight_POM.Dest_sugtn(driver).click();

			// Dates
			Flight_POM.Depart_date(driver).click();
			Flight_POM.ActualDepart_date(driver).click();

			// GoibiboFlightObject.Dest_dateSelect(driver).isSelected();
			Flight_POM.Dest_dateSelect(driver).click();
			Flight_POM.Dest_date(driver).click();

			// Travellers

			Flight_POM.Travlr_icon(driver).click();
			// Flight_POM.Travlr_child(driver).click();
			// Flight_POM.Travlr_infant(driver).click();
			driver.findElement(By.id("pax_close")).click();

			// Class
			Select dropdown = new Select(Flight_POM.Class_dropdwn(driver));
			dropdown.selectByVisibleText("Economy");

			// Search
			Flight_POM.Search_btn(driver).click();
			
			System.out.println("Flight Searched Succesfully!");
			
			
			// **************************** SELECT FLIGHT PAGE **************************************//

			Screenshot_Function.TakeSnapshot(driver, "E:\\SELENIUM_JAVA\\GoibiboProject\\Screenshots\\snap01.jpg");

			// Select filter
			Actions action = new Actions(driver);

			WebElement element = Flight_POM.SelectFilter(driver);

			action.moveToElement(element).moveToElement(Flight_POM.Before11AM(driver)).click().build().perform();

			// BOOK
			Flight_POM.Book_btn(driver).click();

			System.out.println("Flight picked successfully please Enter your details");

			
			
			
			// ****************************** Ticket Detail page #3 ***************************************//

			// baggage and fare rules
			Flight_POM.Bagfare_rule(driver).click();
			Thread.sleep(9000);

			// fare rules
			Flight_POM.fare_rule(driver).click();
			Thread.sleep(8000);

			// scroll
			jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0, 800)");

			// fare rule close
			Flight_POM.Close_rule(driver).click();

			// Traveller details
			Select title = new Select(Flight_POM.Adult_title(driver));
			title.selectByVisibleText("Mr");

			// AdultNames
			Flight_POM.Adult_Firstname(driver).sendKeys(Firstname);
			Flight_POM.Adult_Middlename(driver).sendKeys(Middlename);
			Flight_POM.Adult_Lastname(driver).sendKeys(Lastname);

			// Date
			/*Select day = new Select(Flight_POM.date_Day(driver));
			day.selectByVisibleText("15");

			Select month = new Select(Flight_POM.date_Month(driver));
			month.selectByVisibleText("Sep");

			Select year = new Select(Flight_POM.date_Year(driver));
			year.selectByVisibleText("1997");*/

			// Email
			Flight_POM.Email(driver).sendKeys(email);

			// mobile
			Flight_POM.Mobile(driver).sendKeys(mobile);

			// payment button
			Flight_POM.Payment_btn(driver).click();

			
		} catch (Exception e) {

			throw (e);

		}
	}

}