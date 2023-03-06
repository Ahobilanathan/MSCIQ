package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;

public class CreateGOC extends ProjectSpecification {
	By name = By.xpath("//input[@id='gcName']");
	By code = By.xpath("//input[@id='gcCode']");
	By selectCurrency = By.xpath("//div[@id='mui-component-select-currency']");
	By currency = By.xpath("//li[text()='ALL']");
	By selectCountry = By.xpath("//div[@id='mui-component-select-country']");
	By country = By.xpath("//li[text()='United States']");
	By saveBtn = By.xpath("//button[text()='Save']");
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	public CreateGOC enterName(String str)
	{
		clearAndType(driver.findElement(name), str);
		return this;
	}
	
	public CreateGOC enterCode(String str)
	{
		clearAndType(driver.findElement(code), str);
		return this;
	}
	public CreateGOC SelectCurrency()
	{
		click(driver.findElement(selectCurrency));
		click(driver.findElement(currency));
		return this;
	}
	
	
	public CreateGOC SelectCountry()
	{
		click(driver.findElement(selectCountry));
		click(driver.findElement(country));
		return this;
	}
	
	public CreateGOC clickSaveBtn()
	{
		click(driver.findElement(saveBtn));
		return this;
	}
	
	
	

}
