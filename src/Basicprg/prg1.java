package Basicprg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\chrome\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
		System.out.println("browser  is open");
		  driver.get("https://facebook.com");
		  System.out.println(" facebook login page is opend");

		  

	}

}
