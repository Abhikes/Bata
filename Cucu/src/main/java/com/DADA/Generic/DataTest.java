package com.DADA.Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DADA.datautility.Data_Fetching;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataTest {
	public Data_Fetching d = new Data_Fetching();
	public static WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void open_url() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(d.properties_Fetching("url"));
		
	}
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException
	{
		driver.findElement(By.id("username")).sendKeys(d.properties_Fetching("username"));
		driver.findElement(By.name("pwd")).sendKeys(d.properties_Fetching("password"),Keys.ENTER);
		
	}
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		
	}
	@AfterClass(alwaysRun = true)
	public void close()
	{
		driver.close();
	}


}
