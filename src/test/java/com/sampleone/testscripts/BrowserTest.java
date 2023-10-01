package com.sampleone.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserTest {

	@Test
	public void browserTest1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8080/login");
		driver.findElement(By.id("j_username")).sendKeys("admin");
		System.out.println(" From browser test1");
		System.out.println(" hihsabcidsbc");
	}
}
