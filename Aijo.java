package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aijo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		int count = 0;
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"))
				.click();
		driver.findElement(By.xpath("(//li[@class='rilrtl-list-item'])[7]")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='brand']"));
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='name']"));
		System.out.println("Brands are:");
		for (WebElement e : items) {

			System.out.print(e.getText());

		}
		System.err.println("Names of the products are:");

		for (WebElement n : name) {

			System.out.println(n.getText());

		}

	}

}
