package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.util.List;
public abstract class BasePage<T extends WebDriver> {

	protected final int waitTimeOutSeconds;


	protected WebDriver driver;

	public BasePage(WebDriver driver, int waitTimeOutSeconds) {
		this.driver = driver;
		this.waitTimeOutSeconds = waitTimeOutSeconds;

	}

	public WebElement findElement(By by) {
		return driver.findElement(by);
	}

	public List<WebElement> findElements(By by) {
		return driver.findElements(by);
	}

	protected WebElement find(By locator) {
		return driver.findElement(locator);
	}

	protected List<WebElement> finds(By locator) {
		return driver.findElements(locator);
	}

	public boolean elementExists(By by) {
		try {
			findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void elementIsVisible(By e) {
		wait_until_true_or_timeout(ExpectedConditions.visibilityOfElementLocated(e));
	}


	/**
	 * wait until condition is true or timeout kicks in
	 */
	protected <V> V wait_until_true_or_timeout(ExpectedCondition<V> isTrue) {
		Wait<WebDriver> wait = new WebDriverWait(this.driver, waitTimeOutSeconds)
				.ignoring(StaleElementReferenceException.class);
		return wait.until(isTrue);
	}

}