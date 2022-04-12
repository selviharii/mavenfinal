package com.Maven_final;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
public static WebDriver driver;
	
	public static WebDriver browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void url(String url) {
		driver.get(url);
	}
    public static void sendkeys(WebElement element,String send) {
		element.sendKeys(send);
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void navigate(String navigate) {
		driver.navigate().to(navigate);
	}
	public static void navigate_Forward() {
		driver.navigate().forward();
	}
	public static void navigate_Backward() {
		driver.navigate().back();
	}
	public static void navigate_Refresh() {
		driver.navigate().refresh();
	}
	public static void get_Title() {
		String title=driver.getTitle();
	}
	public static void get_Currenturl() {
		String Currenturl=driver.getCurrentUrl();
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void get_Text(WebElement element) {
		String text=element.getText();
	}
	public static void is_Selected(WebElement element) {
	boolean selected = element.isSelected();
	}
	public static void is_Displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
	}
	public static void is_Enabled(WebElement element) {
		boolean enabled = element.isEnabled();
	}
	public static void frame(String frame) {
		driver.switchTo().frame(frame);
	}
	public static void accept_alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public static void dismiss_alert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public static void sendkeys_alert(String input) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
	}
	public static void gettext_alert() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
	}
	public static void takeshot(String picurl) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File(picurl);
		FileUtils.copyFile(src, des);
	}
	public static void robot() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void dropdown(WebElement element,String value,String select) {
		Select s=new Select(element);
		if (value.equals("value")) {
			s.selectByValue(select);
		}else if (value.equalsIgnoreCase("text")) {
			s.selectByVisibleText(select);
		}else if (value.equalsIgnoreCase("index")) {
			int num = Integer.parseInt(select);
			s.selectByIndex(num);
		}
	}
	
	public static void deselectbyind(WebElement element,int ind) {
		Select s=new Select(element);
		s.deselectByIndex(ind);
	}
	public static void deselectbyvalue(WebElement element,String data) {
		Select s=new Select(element);
		s.deselectByValue(data);
	}
	public static void deselectbytext(WebElement element,String data) {
		Select s=new Select(element);
		s.deselectByVisibleText(data);
	}
	public static void deselectall(WebElement element) {
		Select s=new Select(element);
		s.deselectAll();
	}
	public static void multiple(WebElement element) {
		Select s=new Select(element);
		boolean multiple = s.isMultiple();
	}
	public static void getoption(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement all : options) {
			String text = all.getText();
	} 
	}
	public static void allgetoption(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		for (WebElement all : options) {
			String text = all.getText();
	}
	}
	public static void firstoption(WebElement element) {
		Select s=new Select(element);
		  WebElement option = s.getFirstSelectedOption();
			String text = option.getText();
	}
	public static void implicitwait() {
	//	driver.manage().timeouts().implicitlyWait(time, unit)
	}
	
	
	

}
