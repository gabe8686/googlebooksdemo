package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)

	{
		super(driver, 20);
	}

	private final By termInput = By.xpath("//input[@ng-model='vm.search']");
	private final By bookInput = By.xpath("//input[@ng-model='vm.limitBooks']");
	private final By updateBtn=By.xpath("//button[@ng-click='vm.updateBookList()']");


	public void enterSearch(String arg1) {
		elementIsVisible(termInput);
		find(termInput).click();
		find(termInput).clear();
		find(termInput).sendKeys(arg1);
	}

	public void enterBooks(String arg1) {
		elementIsVisible(bookInput);
		find(bookInput).click();
		find(bookInput).clear();
		find(bookInput).sendKeys(arg1);
	}
	public void clickUpdate() throws InterruptedException {
		elementIsVisible(updateBtn);
		find(updateBtn).click();
		Thread.sleep(5000);
	}


	public void verifyResults(String arg1) throws InterruptedException {
		elementIsVisible(bookInput);
		List<WebElement> results = driver.findElements(By.cssSelector(".list-group-item-text ng-binding"));
		for (int i = 0; i < results.size(); i++) {
		assertTrue(results.get(i).getText().contains(arg1));
		}
	}









}
	
	
	