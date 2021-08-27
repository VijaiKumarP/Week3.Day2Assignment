package Week2.Day2Assignments;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByName("searchVal").sendKeys("Bags");
		Thread.sleep(1000);
		driver.findElementByName("searchVal").sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//input[@id='Men']")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		System.out.println(" Total Items found : " +driver.findElement(By.xpath("//div[@class='length']")).getText());

		//Print Brand Names		
		List<WebElement> brandNameElements = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Available Brand Names :");
		Set <String> strSetBrandName=new LinkedHashSet<String>();
		boolean bBrandName;
		for (WebElement webElement : brandNameElements) {
			bBrandName=strSetBrandName.add(webElement.getText());
			if (bBrandName==true) {
				System.out.println(webElement.getText());
			}
		}

		//Print Bag Names
		System.out.println("Available Bag Name : ");
		boolean bBagName;
		List<WebElement> bagNamesElements = driver.findElements(By.xpath("//div[@class='name']"));
		Set<String> strBagName=new LinkedHashSet<String>();
		for (WebElement webElement : bagNamesElements) {
			bBagName=strBagName.add(webElement.getText());
			if (bBagName==true) {
				System.out.println(webElement.getText());
			}
		}
	}

}

