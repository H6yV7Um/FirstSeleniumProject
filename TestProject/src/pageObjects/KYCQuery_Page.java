package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.CustomActions;
import Utilities.PageObjectModel;

public class KYCQuery_Page implements IPage {
	
	@FindBy(id = "loginIdInput")
	static WebElement idInput;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > form > div > div.ant-card-body > div.card-content > div > div:nth-child(5) > div > div > div > div > div > div > div.ant-select-selection-selected-value")
	static WebElement statusBox;
	
	@FindBy (css = "#app > div > div.ant-layout > div > div > div > div > div > div > div > div > div > table > thead")
	static WebElement searchPageHeader;
	
	public KYCQuery_Page() {
    	PageObjectModel.wait.until(ExpectedConditions.visibilityOf(searchPageHeader));
		PageFactory.initElements(PageObjectModel.driver, this);
    }
	

}
