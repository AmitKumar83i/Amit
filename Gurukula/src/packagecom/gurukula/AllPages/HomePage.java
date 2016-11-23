package packagecom.gurukula.AllPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	@FindBy(xpath="/html/body/div[3]/div[2]/p")
	private WebElement copyright;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div[2]/h1")
	private WebElement mainTitle;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	public String pageTitle()
	{
		String Title= driver.getTitle();
		return Title;
		
	}
	
	public String copyRight()
	{
		String copyRight= copyright.getText();
		return copyRight;
		
	}
	
	public String mainTitle()
	{
		String maintitle= mainTitle.getText();
		return maintitle;
		
	}
}
