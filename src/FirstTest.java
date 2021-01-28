import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class FirstTest {
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Username:");
	String us=sc.next();
	System.out.println("");
	System.out.println("Enter your password");
	String pass=sc.next();
	 Selenium.Setup(us,pass);

}
		
	

}
