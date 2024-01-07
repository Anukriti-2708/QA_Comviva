package com.Assesment.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricbuzz 
{
	
	 public static void main(String[]args)
		{
			    System.setProperty("webdriver.gecko.driver", "C:\\Users\\anukriti.saxena\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		        WebDriverManager.firefoxdriver().setup();
		        WebDriver driver = new FirefoxDriver();
		        driver.get("https://www.espncricinfo.com/series/bangladesh-in-new-zealand-2023-24-1388181/new-zealand-vs-bangladesh-3rd-t20i-1388215/full-scorecard");
		        
		        WebElement ScoreCard = driver.findElement(By.xpath("/html/body/div[1]/section/section/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody"));
		        List <WebElement> scores = ScoreCard.findElements(By.tagName("tr"));
		        System.out.println(scores.size());
		        
		        

				for (int rows = 1; rows < scores.size(); rows++) {

					List<WebElement> columns = scores.get(rows).findElements(By.tagName("td"));

					for (int col = 0; col < columns.size(); col++) {
						System.out.print(columns.get(col).getText());
						System.out.print(" ");
					}

					System.out.print("\n");
				}
		        
		        
		}

}
