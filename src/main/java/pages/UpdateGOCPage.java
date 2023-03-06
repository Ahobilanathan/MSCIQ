package pages;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;


public class UpdateGOCPage extends ProjectSpecification{
	By name = By.xpath("//input[@id='gcName']");
	By code = By.xpath("//input[@id='gcCode']");
	By selectCurrency = By.xpath("//div[@id='mui-component-select-currency']");
	By currency = By.xpath("//li[text()='INR']");
	By selectCountry = By.xpath("//div[@id='mui-component-select-country']");
	By country = By.xpath("//li[text()='India']");
	By updateBtn = By.xpath("//button[text()='Update']");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
//---Have to rework! cant't able to clear the existing text.
	public UpdateGOCPage enterName(String str) throws InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.elementToBeClickable(name));
		clearAndType(driver.findElement(name), str);
		return this;
	}
	
	public UpdateGOCPage enterCode(String str) throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(code));
		clearAndType(driver.findElement(code), str);
		return this;
	}
	public UpdateGOCPage SelectCurrency()
	{
		wait.until(ExpectedConditions.elementToBeClickable(selectCurrency));
		click(driver.findElement(selectCurrency));
		wait.until(ExpectedConditions.elementToBeClickable(currency));
		click(driver.findElement(currency));
		return this;
	}
	
	
	public UpdateGOCPage SelectCountry()
	{
		click(driver.findElement(selectCountry));
		click(driver.findElement(country));
		return this;
	}
	
	public UpdateGOCPage clickUpdateBtn()
	{
		click(driver.findElement(updateBtn));
		return this;
	}
	

}
	
