package InsipiredTesting.insipiredTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	//setup the chromedriver using WebDriverManager
      WebDriverManager.chromedriver().setup();

      //Create driver object for Chrome
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //Navigate to a URL
      driver.get("https://www.geewiz.co.za/");
      driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")).sendKeys("solar");
      driver.findElement(By.xpath("(//i[@class='material-icons search'])[2]")).click();
      driver.findElement(By.xpath("(//button[@class='btn-unstyle select-title'])")).click();
      Thread.sleep(6);
      driver.findElement(By.xpath("//a[contains(text(),'Price, low to high')]")).click();
      Thread.sleep(6);
      driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div/div/div/div[1]/article/div/div[2]/h3/a")).click();
      Thread.sleep(6);
      driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).clear();
      driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).sendKeys("5");
      Thread.sleep(6);
      driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div[1]/div[2]/button[1]")).click();
      Thread.sleep(6);
      driver.findElement(By.xpath("//button[contains(text(),'Continue shopping')]")).click();
      
      
      
  }
}
