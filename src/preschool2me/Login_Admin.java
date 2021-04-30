package preschool2me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login_Admin {
	

	

	public static void main(String[] args) {
		
		String baseUrl="https://staging.daycare2me.com/index.html";
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		login(driver);
		
		
		
		// TODO Auto-generated method stub

	}
	
	public static void login(WebDriver driver)
	{
		WebElement usrname=driver.findElement(By.id("user_name"));
		WebElement pwd=driver.findElement(By.id("user_password"));
		WebElement login=driver.findElement(By.id("login_form_btn"));
		usrname.sendKeys("arunrajan@qburst.com");
		pwd.sendKeys("123456");
		login.click();
		 if(driver.findElement(By.xpath("//*[@id=\"wrap-nav\"]/ul[1]/li[1]/a/button")).isDisplayed())
		 
		 {
			 System.out.println("Login verified sucessfully");
		 }
		 
		 else
		 {
			 System.out.println("Login case failed");
		 }
	driver.close();
}
}
