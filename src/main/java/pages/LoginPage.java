package pages;

import org.openqa.selenium.By;

import projectSpecification.ProjectSpecification;

public class LoginPage extends ProjectSpecification{
	
	
	By emailID = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//button[@type='submit']");
	
	public LoginPage enterEmail(String email) {
		
		clearAndType(driver.findElement(emailID), email);
		return this;
	}
	public LoginPage enterpassword(String pwd){
		clearAndType(driver.findElement(password), pwd);
		return this;
		
	}
	
	public LoginPage clickLoginButton() {
		click(driver.findElement(loginBtn));
		return this;
		
	}
	

}
