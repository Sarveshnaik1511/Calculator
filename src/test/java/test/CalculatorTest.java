package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;

import pom.CalculatorPage;

public class CalculatorTest extends BaseTest {
	@BeforeMethod
	public void openCalculator() {
		driver =Browser.launchApplication();
	}
	
	@Test
	public void entervalues() {
		calculatorPage = new CalculatorPage(driver);
		
		//multiplication
		calculatorPage.four();
		calculatorPage.two();
		calculatorPage.three();
		calculatorPage.clickOnMultiplicationSign();
		calculatorPage.five();
		calculatorPage.two();
		calculatorPage.five();
		calculatorPage.clickOnEquals();
		calculatorPage.clickOnAns();
		Assert.assertEquals( calculatorPage.getResult(),222075);
		calculatorPage.clickOnAc();
		
		//division
		calculatorPage.four();
		calculatorPage.zero();
		calculatorPage.zero();
		calculatorPage.zero();
		calculatorPage.clickOnDivisionSign();
		calculatorPage.two();
		calculatorPage.zero();
		calculatorPage.zero();
		Assert.assertEquals(calculatorPage.getResult(),20);
		calculatorPage.clickOnAc();
		
		//addition
		calculatorPage.clickOnsubtractionSign();
		calculatorPage.two();
		calculatorPage.three();
		calculatorPage.four();
		calculatorPage.two();
		calculatorPage.three();
		calculatorPage.four();
		calculatorPage.clickOnAdditionSign();
		calculatorPage.three();
		calculatorPage.four();
		calculatorPage.five();
		calculatorPage.three();
		calculatorPage.four();
		calculatorPage.five();
		Assert.assertEquals(calculatorPage.getResult(),111111);
		calculatorPage.clickOnAc();
		
		//subtraction
		calculatorPage.two();
		calculatorPage.three();
		calculatorPage.four();
		calculatorPage.eight();
		calculatorPage.two();
		calculatorPage.three();
		calculatorPage.clickOnsubtractionSign();
		calculatorPage.two();
		calculatorPage.three();
		calculatorPage.zero();
		calculatorPage.nine();
		calculatorPage.four();
		calculatorPage.eight();
		calculatorPage.two();
		calculatorPage.three();
		Assert.assertEquals(calculatorPage.getResult(),-22860000);
		calculatorPage.clickOnAc();
		
		
		
	}

}
