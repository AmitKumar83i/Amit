package packagecom.gurukula.ActualTests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import packagecom.gurukula.AllPages.AuthenticationPage;
import packagecom.gurukula.AllPages.LandingPage;
import packagecom.gurukula.AllPages.MenuBar;

public class BaseTestWithLogin extends BaseTest{
	
	private LandingPage landingPage;
	private AuthenticationPage authenticationPage;
	private MenuBar menuBar;

	@Parameters({"loginid", "password"})
	@BeforeSuite
	public void setUp(String loginid, String password){
		initialize();
		login(loginid, password);
	}
	
	public void login(String loginid, String password){
		landingPage = new LandingPage(driver);
		authenticationPage = landingPage.clickLogin();
		authenticationPage.enterUsername(loginid);
		authenticationPage.enterPassword(password);
		authenticationPage.clickAuthenticate();
	}
	
	public void logout(){
		menuBar = new MenuBar(driver);
		menuBar.clickAccount();
		menuBar.clickLogout();
	}
	
	@AfterSuite
	public void tearDown(){
		logout();
		demolish();
	}
}
