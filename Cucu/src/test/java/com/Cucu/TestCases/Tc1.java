package com.Cucu.TestCases;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DADA.Generic.DataTest;
@Listeners(screenshot.Listner.class)
public class Tc1 extends DataTest {
	@Test
	public void tc1()
	{
		Reporter.log("Test Runing");
	}
	

}
