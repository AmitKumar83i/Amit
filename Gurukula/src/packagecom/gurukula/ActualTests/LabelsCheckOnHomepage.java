package packagecom.gurukula.ActualTests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import packagecom.gurukula.AllPages.HomePage;

public class LabelsCheckOnHomepage extends BaseTest{
	
	private HomePage homePage;

	@Parameters("pagetilesp")
	@Test(priority=1, enabled=true)
	public void pageTileTest(String pagetilesp)
	{
		homePage = new HomePage(driver);
		Assert.assertEquals(homePage.pageTitle(), pagetilesp);
	}
	
	@Parameters("copyright")
	@Test(priority=2, enabled=true)
	public void pageCopyRightTest(String copyright)
	{
			Assert.assertEquals(homePage.copyRight(), copyright);
	}
	
	@Parameters("mainTitle")
	@Test(priority=3, enabled=true)
	public void pageMainTitleTest(String mainTitle)
	{
			Assert.assertEquals(homePage.mainTitle(), mainTitle);
	}
}
