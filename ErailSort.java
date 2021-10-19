package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.id("txtStationTo")).sendKeys("BCT");
		Thread.sleep(2000);
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		List<String> train=new ArrayList<String>();
		for(int i=0;i<trainNames.size();i++)
		{
			WebElement webElement = trainNames.get(i);
			train.add(webElement.getText());
			
		}
		System.out.println("Train Names are:"+ train);
		Collections.sort(train);
		System.out.println("Sorted Train Names are:"+train);
		
	}

}
