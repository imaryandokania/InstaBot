import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {
	public static void Setup(String us,String pass)
	{
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","/Users/aryandokania/Downloads/webdrive/chromedriver");
		 options.setBinary(new File("/Applications/Google Chrome 2.app/Contents/MacOS/Google Chrome"));
		 
		WebDriver chrome=new ChromeDriver(options);
		chrome.get("https://www.instagram.com");
		 Actions.Search(chrome,us,pass);
	}

}
