package OMSPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class OMSFindOrdersPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"topnav-menu-content\"]/ul/li[1]/a")
	WebElement manageOrdersTab;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[1]/div/h4/span[1]")
	WebElement filters;

	@FindBy(xpath = "//*[@id=\"displayNames\"]")
	WebElement orderDisplayName;

	@FindBy(xpath = "//*[@id=\"custRef\"]")
	WebElement customerReference;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[2]/div/div/div/form/div[1]/div[3]/ng-multiselect-dropdown/div/div[1]/span")
	WebElement orderType;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[2]/div/div/div/form/div[1]/div[4]/div/ng-multiselect-dropdown")
	WebElement orderStatus;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[2]/div/div/div/form/div[2]/div[1]/div/ng-multiselect-dropdown/div/div[1]/span")
	WebElement orderGroups;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[2]/div/div/div/form/div[2]/div[2]/div/ng-multiselect-dropdown/div/div[1]/span/span[1]")
	WebElement orderLabels;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[2]/div/div/div/form/div[2]/div[3]/div/ng-multiselect-dropdown/div/div[1]/span/span[1]")
	WebElement salesChannel;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[2]/div/div/div/form/div[2]/div[4]/div/ng-multiselect-dropdown/div/div[1]/span/span[1]")
	WebElement deliveryChannel;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[2]/div/div/div/form/div[3]/div[1]/input")
	WebElement dispatchDate;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[2]/div/div/div/form/div[3]/div[2]/div/input")
	WebElement deliveryDate;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[2]/div/div/div/form/div[3]/div[3]/div/ng-multiselect-dropdown/div/div[1]/span")
	WebElement orderEntityAssigneeNames;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[2]/div/div/div/form/div[3]/div[4]/div/ng-multiselect-dropdown/div/div[1]/span")
	WebElement orderPaymentStatus;

	@FindBy(xpath = "//*[@id=\"additionalInfo\"]")
	WebElement orderTag;

	@FindBy(xpath = "/html/body/app-root/div/app-pages/div/div/div[2]/app-search-order/div[1]/div[2]/div/div/div/form/div[4]/div[2]/div/ng-multiselect-dropdown/div/div[1]/span")
	WebElement orderFulfillmentCenter;

	public OMSFindOrdersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void manageOrdersTabDisplay() {
		String expectedTab = "Manage Orders";
		String actualTab = manageOrdersTab.getText();
		Assert.assertEquals(expectedTab, actualTab);
		System.out.println("User landed on Manage Orders Tab");

	}

	public void findOrdersTabDisplay() {
		String expectedPage = "https://staging.oms.bytetale.com/manage-orders/search";
		String actualPage = driver.getCurrentUrl();
		Assert.assertEquals(expectedPage, actualPage);
		System.out.println("Find Orders Page is displayed");
	}

	public void filtersDisplay() {
		filters.click();
		System.out.println("Clicked on Filters");

		Assert.assertEquals(true, orderDisplayName.isDisplayed());
		System.out.println("Order Display Field is displayed");

		Assert.assertEquals(true, customerReference.isDisplayed());
		System.out.println("Customer Reference Field is displayed");

		Assert.assertEquals(true, orderType.isDisplayed());
		System.out.println("Order Type Dropdown is displayed");

		Assert.assertEquals(true, orderStatus.isDisplayed());
		System.out.println("Order Status Dropdown is displayed");
		System.out.println(orderStatus.getText());
		System.out.println(
				"Orders are populated with Processed,Confirmed,Not confirmed,Approved in the Order Status field by default");

		Assert.assertEquals(true, orderGroups.isDisplayed());
		System.out.println("Order Groups Dropdown is displayed");

		Assert.assertEquals(true, orderLabels.isDisplayed());
		System.out.println("Order Labels Dropdown is displayed");

		Assert.assertEquals(true, salesChannel.isDisplayed());
		System.out.println("Sales Channel Dropdown is displayed");

		Assert.assertEquals(true, deliveryChannel.isDisplayed());
		System.out.println("Delivery Channel Dropdown is displayed");

		Assert.assertEquals(true, dispatchDate.isDisplayed());
		System.out.println("Dispatch Date Field is displayed");

		Assert.assertEquals(true, deliveryDate.isDisplayed());
		System.out.println("Delivery Date Field is displayed");

		Assert.assertEquals(true, orderEntityAssigneeNames.isDisplayed());
		System.out.println("Order Entity Assignee Names Dropdown is displayed");

		Assert.assertEquals(true, orderPaymentStatus.isDisplayed());
		System.out.println("Order Payment Status Dropdown is displayed");

		Assert.assertEquals(true, orderTag.isDisplayed());
		System.out.println("Order Tag Field is displayed");

		Assert.assertEquals(true, orderFulfillmentCenter.isDisplayed());
		System.out.println("Order Fulfillment Center Dropdown is displayed");

	}
}
