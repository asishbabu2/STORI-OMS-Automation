package OMSTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import OMSPages.OMSFindOrdersPage;
import OMSPages.OMSLoginPage;
import TestScenario.OMSTestBase;

public class OMSTest extends OMSTestBase {

	OMSLoginPage loginPage;
	OMSFindOrdersPage findOrdersPage;

	private static final Logger log = LogManager.getLogger(OMSTest.class);

	@Test(priority = 0)
	public void OMSLoginTest() {

		log.info("Verifying successful login.");

		loginPage = new OMSLoginPage(driver);

		OMSFindOrdersPage findOrdersPage = loginPage.login("vt@testvox.com", "vt@testvox.com");

	}

	@Test(priority = 1)
	public void OMSFindOrdersTest() {
		findOrdersPage = new OMSFindOrdersPage(driver);
		findOrdersPage.manageOrdersTabDisplay();
		findOrdersPage.findOrdersTabDisplay();
		findOrdersPage.filtersDisplay();
	}
}
