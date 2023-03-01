package com.TestNg.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class GroupExecution {
@Test(groups="acti")
public void actiTIME() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
}
public void actiTIME1() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
}

@Test(groups="nokari")
public void Nokari() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/login-systems-jobs-careers-1972348");
}

@Test(groups="insta")
public void insta() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");	
}
}
