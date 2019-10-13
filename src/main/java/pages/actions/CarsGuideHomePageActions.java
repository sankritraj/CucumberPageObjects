package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	
private CarsGuideHomePageLocators carsGuideHomePageLocators=null;

public CarsGuideHomePageActions()
{
this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
}

public void moveToCarsMainMenu()
{
	Actions action= new Actions(SeleniumDriver.getDriver());
	action.moveToElement(carsGuideHomePageLocators.sellMyCarLink).perform();
	
}

public void clickOnSearchCarMenu()
{
	carsGuideHomePageLocators.searchCarLink.click();
	
}

public void clickOnUserCarMenu()
{
	carsGuideHomePageLocators.usedCarSearchLink.click();
	
}
public void clickOnUserCarMenu1()
{
	carsGuideHomePageLocators.usedCarSearchLink.click();
	
}
}
