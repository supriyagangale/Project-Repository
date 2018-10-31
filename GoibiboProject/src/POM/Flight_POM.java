package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import WebElements.Flight_WebElements;
public class Flight_POM {

	private static WebElement element = null;

	public static WebElement Flight_menu(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class=\"icon-flights db blue ico24 lh1-2 padT5 padB5\"]"));
		return element;

	}

	public static WebElement Oneway_radiobtn(WebDriver driver) {
		element = driver.findElement(By.id(Flight_WebElements.OnewayBtn));
		return element;

	}

	public static WebElement Depart_text(WebDriver driver) {

		element = driver.findElement(By.id(Flight_WebElements.departelement));
		return element;

	}

	public static WebElement Dest_text(WebDriver driver) {
		element = driver.findElement(By.id(Flight_WebElements.destelement));
		return element;
	}

	public static WebElement Depart_sugtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Flight_WebElements.departsugnele));
		return element;
	}

	public static WebElement Dest_sugtn(WebDriver driver) {
		element = driver.findElement(By.xpath(Flight_WebElements.destsugnele));
		return element;
	}

	public static WebElement Depart_date(WebDriver driver) {
		element = driver.findElement(By.xpath(Flight_WebElements.departdateele));
		return element;
	}

	public static WebElement ActualDepart_date(WebDriver driver) {
		element = driver.findElement(By.xpath(Flight_WebElements.departactualdateele));
		return element;
	}

	public static WebElement Dest_dateSelect(WebDriver driver) {
		element = driver.findElement(By.xpath(Flight_WebElements.destdateele));
		return element;
	}

	public static WebElement Dest_date(WebDriver driver) {
		element = driver.findElement(By.xpath(Flight_WebElements.destactualdate));
		return element;
	}

	public static WebElement Travlr_icon(WebDriver driver) {
		element = driver.findElement(By.xpath(Flight_WebElements.Traveliconele));
		return element;
	}

	public static WebElement Travlr_child(WebDriver driver) {
		element = driver.findElement(By.id(Flight_WebElements.childiconele));
		return element;
	}

	public static WebElement Travlr_infant(WebDriver driver) {
		element = driver.findElement(By.id(Flight_WebElements.infanticonele));
		return element;
	}

	public static WebElement Class_dropdwn(WebDriver driver) {
		element = driver.findElement(By.id(Flight_WebElements.dropdownele));
		return element;
	}

	public static WebElement Search_btn(WebDriver driver) {
		element = driver.findElement(By.id(Flight_WebElements.searchbtnele));
		return element;
	}

	public static WebElement SelectFilter(WebDriver driver) {
		element = driver.findElement(By.xpath(Flight_WebElements.searfilterele));
		return element;
	}

	public static WebElement Before11AM(WebDriver driver) {
		element = driver.findElement(By.xpath(Flight_WebElements.before11ele));
		return element;
	}

	
	public static WebElement Book_btn(WebDriver driver) {
		element = driver.findElement(By.xpath(Flight_WebElements.bookflightele));
		return element;

	}
	
	
	// *************************** SELECT FLIGHT ***************************************//
	

	public static WebElement Bagfare_rule(WebDriver driver) {
		element = driver.findElement(By.xpath(Flight_WebElements.bagfareele));
		return element;

	}
	
	public static WebElement fare_rule(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.fareruleele));
		return element;

	}
	
	public static WebElement Close_rule(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.closeruleele));
		return element;

	}
	
	public static WebElement Adult_title(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.adulttitleele));
		return element;

	}
	
	public static WebElement Adult_Firstname(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.adultfirstnameele));
		return element;

	}
	
	public static WebElement Adult_Middlename(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.adultmiddlenameele));
		return element;

	}
	
	
	public static WebElement Adult_Lastname(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.adultlastnameele));
		return element;

	}
	
	public static WebElement date_Day(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.dayele));
		return element;

	}
	
	public static WebElement date_Month(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.monthele));
		return element;

	}
	
	public static WebElement date_Year(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.yearele));
		return element;

	}
	
	public static WebElement Email(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.emailele));
		return element;

	}
	
	public static WebElement Mobile(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.mobileele));
		return element;

	}
	
	public static WebElement Payment_btn(WebDriver driver) {
		element =driver.findElement(By.xpath(Flight_WebElements.paybtnele));
		return element;

	}

}
