package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends BasePage{
		@FindBy (xpath = "//span[@class='scinm']")private List<WebElement> numbers;
		@FindBy (xpath ="//span[text()='+']")private WebElement plus;
		@FindBy (xpath ="//span[text()='–']")private WebElement minus;
		@FindBy (xpath ="//span[text()='×']")private WebElement multiply;
		@FindBy (xpath ="//span[text()='/']")private WebElement divide;
		@FindBy (xpath ="//span[text()='=']")private WebElement equals;
		@FindBy (xpath ="//div[@id='sciOutPut']")private WebElement result;
		@FindBy (xpath ="//span[text()='Ans']")private WebElement answer;
		@FindBy (xpath ="//span[text()='AC']") private WebElement ac;
		
		public CalculatorPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void clickOnAdditionSign() {
			plus.click();
		}
		public void clickOnsubtractionSign() {
			minus.click();
		}
		public void clickOnMultiplicationSign() {
			multiply.click();
		}
		public void clickOnDivisionSign() {
			divide.click();
		}
		public void clickOnEquals() {
			equals.click();
		}
		public void clickOnAns() {
			answer.click();
		}
		public int getResult() {
			return Integer.parseInt(removeWhiteSpace(result.getText()));
		}
		public void clickOnAc() {
			ac.click();
		}
		
		//numbers
		
		public void seven() {
			numbers.get(0).click();
		}
		public void eight() {
			numbers.get(1).click();
		}
		public void nine() {
			numbers.get(2).click();
		}
		public void four() {
			numbers.get(3).click();
		}
		public void five() {
			numbers.get(4).click();
		}
		public void six() {
			numbers.get(5).click();
		}
		public void one() {
			numbers.get(6).click();
		}
		public void two() {
			numbers.get(7).click();
		}
		public void three() {
			numbers.get(8).click();
		}
		public void zero() {
			numbers.get(9).click();
		}
		public void dot() {
			numbers.get(10).click();
		}
		

}
