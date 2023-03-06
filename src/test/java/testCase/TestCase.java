package testCase;

import java.awt.AWTException;

import org.testng.annotations.Test;
import pages.BusinessStructurePage;
import pages.CreateGOC;
import pages.DashBoard;
import pages.LoginPage;
import pages.UpdateGOCPage;
import projectSpecification.ProjectSpecification;

public class TestCase extends ProjectSpecification{
	String name = "Demooname12";
	String code = "Demoocode12";
	String name1 = "Demooname13";
	String code1 = "Demoocode13";
	
	@Test (priority = 1)
	public void testCreateGOC() {
		
		new LoginPage().enterEmail("admin@msciq.io").enterpassword("123456").clickLoginButton();
		new DashBoard().clickCard();
		new BusinessStructurePage().clickAddBtn().clickGOC();
		new CreateGOC().enterName(name).enterCode(code).SelectCountry().SelectCurrency().clickSaveBtn();
		new BusinessStructurePage().successMSG();
		
	}
	
	@Test (priority = 2)
	public void testPrintCreatedGOC() throws AWTException {
		new BusinessStructurePage().clickCreatedGOC(name).printCreatedGOC().clickEditbtn();
	}
	
	@Test (priority =3)
	public void testUpdateGOC() throws InterruptedException, AWTException {
		new UpdateGOCPage().enterName(name1).enterCode(code1).SelectCountry().SelectCurrency().clickUpdateBtn();
		
	}
	
	@Test (priority = 4)
	public void testPrintUpdatedGOC() {
		System.out.println("********************AFTER UPDATION********************");
		new BusinessStructurePage().clickCreatedGOC(name1).printCreatedGOC();
	}
	
	@Test (priority = 5)
	public void testDeleteGOC() throws AWTException, InterruptedException
	{
		Thread.sleep(3000);
		refresh();
		new BusinessStructurePage().clickCreatedGOC(name1).deleteGOC();
	}

}
