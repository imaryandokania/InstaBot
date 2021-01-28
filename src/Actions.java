import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.io.*;
import java.util.*;

public class Actions {
	
	public static void Search(WebDriver chrome,String us,String pass) 
	{
		
		WebDriverWait wait = new WebDriverWait(chrome, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		WebElement username=chrome.findElement(By.xpath("//input[@name='username']"));
		username.click();
		username.sendKeys(us);
		WebElement password=chrome.findElement(By.xpath("//input[@name='password']"));
		password.click();
		password.sendKeys(pass);
		WebElement button=chrome.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div/form/div/div[3]/button/div"));
		button.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/main/div/div/div/section/div/button")));
		WebElement save=chrome.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div/section/div/button"));
		save.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div[3]/button[2]")));
		WebElement notnow=chrome.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/button[2]"));
		notnow.click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/main/section/div/div[2]/div/article[1]/div[3]/section[1]/span[1]/button")));
	    WebElement like=chrome.findElement(By.xpath("/html/body/div[1]/section/main/section/div/div[2]/div/article[1]/div[3]/section[1]/span[1]/button"));
	    like.click();
	    JavascriptExecutor jse = (JavascriptExecutor)chrome;
 	    jse.executeScript("window.scrollBy(0,450)");

		
		}
		

	}


//WebElement search=chrome.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input"));
//search.click();
//search.sendKeys("theinsane.programmer");
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[4]/div/a[1]")));
//WebElement id=chrome.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[4]/div/a[1]"));
//id.click();
//

