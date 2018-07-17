import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class {
@Test
public void newtest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\a.d.lakshminarayana\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("uniqueuser123");
	driver.findElement(By.id("password")).sendKeys("Shivaji123$");
	driver.findElement(By.name("commit")).click();
	String title=driver.getTitle();
	System.out.println(title);
	//Assert.assertEquals(title,"Sign in to GitHub · GitHub");
	Assert.assertEquals(title, "GitHub");
	System.out.println("validated");
	System.out.println("validated");
}
}
