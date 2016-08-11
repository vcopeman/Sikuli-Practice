package com.tests.TestSikuli;

import java.io.File;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.desktop.DesktopMouse;
import org.sikuli.api.visual.DesktopCanvas;

public class TestSikuli 
    
	{

	@SuppressWarnings("deprecation")
	@Test 
	public void testsikuli()
		{
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.uk/maps");
			driver.findElement(By.id("searchboxinput")).sendKeys("London");
			driver.findElement(By.id("searchboxinput")).sendKeys(Keys.ENTER);
			ScreenRegion s = new DesktopScreenRegion();
			Target target = new ImageTarget(new File("C:\\Automation0705\\earth.png"));
			ScreenRegion r = s.wait(target,8000);
			r=s.find(target);

	//  Construct a Canvas object of the type Desktop canvas 
	DesktopCanvas canvas = new DesktopCanvas();
	
	// Add a box around a screen region 'r'
	canvas.addBox(r);
	
	// Add a label on the screen region r
	canvas.addLabel(r, "WE FOUND IT!!");
	
	// Display the canvas f
	canvas.display(3);

org.sikuli.api.robot.Mouse mouse =  new DesktopMouse();
mouse.click(r.getCenter());

System.out.println("Job completed");
System.out.println("Random Job completed");

		}
}
   



