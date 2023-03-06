package base;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
	public static RemoteWebDriver driver;

	public RemoteWebDriver startApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://qa.msciq.io/login");
		return driver;
	}
	/**
	 * This method clears the text in the textbox and enters the value given.
	 * @param e - Pass the WebElement
	 * @param str - Pass the String value
	 */
	public void clearAndType(WebElement e, String str) {
		Actions actions = new Actions(driver);
		actions.click(e)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.sendKeys(str)
		.build()
		.perform();

	}
	/**
	 * This method clears the text in the WebElement.
	 * @param e
	 */
	public void clear(WebElement e) {
		e.clear();
	}
	
	/**
	 * This method click the WebElement
	 * @param e
	 */
	public void click(WebElement e)
	{
		e.click();
	}
	public void refresh()
	{
		driver.navigate().refresh();
	}

	public void quitApp() {
		driver.quit();
	}

}
