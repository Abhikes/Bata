package com.Cucu.TestCases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DADA.Generic.DataTest;
@Listeners(screenshot.Listner.class)

public class Tc2 extends DataTest {
	@Test
	public void tc2()
	{
		Reporter.log("Test Runing");
		driver.findElement(By.xpath("dsdas")).click();
	}
	

}
