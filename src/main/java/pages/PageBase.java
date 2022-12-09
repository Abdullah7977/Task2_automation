package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	
	protected WebDriver driver;
	protected static WebDriverWait wait;
	
	public PageBase(WebDriver driver) {
		
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	public static void setText(WebElement element, String text) {
		
	wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
		
	}

	public static void click(WebElement element) {
		
		wait.until(ExpectedConditions.visibilityOf(element)).click();
			
		}
	
public static void selectFromDropDownByIndex(WebElement element,int index) {
		
	new Select(wait.until(ExpectedConditions.visibilityOf(element))).selectByIndex(index);
		
			
		}

public static List<String> getTextOfWebElemets(List<WebElement> elements) {
	
	List<String> textofelements=new ArrayList<>();
	for(WebElement element:elements) {
		
		textofelements.add(wait.until(ExpectedConditions.visibilityOf(element)).getText());
		
		}
	
	return textofelements;
}
}