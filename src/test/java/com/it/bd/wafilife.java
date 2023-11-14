package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class wafilife extends BaseDriver{
	
	@Test
	public void firstTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.wafilife.com/");
		Thread.sleep(1000);
        
		
        WebElement loginRegister = driver.findElement(By.xpath("//a[@title='আমার অ্যাকাউন্ট']")); 
		loginRegister.click();
	    Thread.sleep(1000);
	    
	    WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
	    email.sendKeys("farhad.h.junnun@gmail.com");
	    Thread.sleep(1000);
  
	    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	    password.sendKeys("12346789");
	    Thread.sleep(1000);
    
        WebElement login= driver.findElement(By.xpath("//input[@name='login']"));
        login.click();
        Thread.sleep(3000);
      
        WebElement lekhok= driver.findElement(By.xpath("//span[contains(text(),'লেখক')]"));
        lekhok.click();
        Thread.sleep(3000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement page2= driver.findElement(By.xpath("//a[@class='page-numbers'][normalize-space()='2']"));
        js.executeScript("arguments[0].scrollIntoView(true);",page2);
        page2.click();
        Thread.sleep(3000);
      
        
        WebElement lekhokClick= driver.findElement(By.xpath("//a[@href='/cat/books/author/']"));
        lekhokClick.click();
        Thread.sleep(3000);
        
        WebElement selectLekhok= driver.findElement(By.xpath("//h3[normalize-space()='M. Hassanullah']"));
        selectLekhok.click();		
        Thread.sleep(3000);
        
      
        WebElement viewBookDetails= driver.findElement(By.xpath("//body/div[@class='body-wrapper']/div[@class='wd-content']/div[@id='template-wrapper']/div[@id='main-module-container']/div[@id='container']/div[@id='content']/div[@id='main']/div[@id='container-main']/div[@class='main-content']/article[@id='post-23109']/div[@class='entry-content-post']/div[@class='cls_results']/div[@class='wdm_resultContainer']/div[@class='wdm_results woocommerce']/div[@class='results-by-facets']/ul[@class='products']/li[1]/div[1]/div[1]/a[1]"));
        viewBookDetails.click();		
        Thread.sleep(3000); 
        
        WebElement order= driver.findElement(By.xpath("//div[@class='body-wrapper']//button[2]"));
        order.click();
        Thread.sleep(3000);
        
        WebElement ordercomplete= driver.findElement(By.xpath("//a[@title='checkout']"));
        ordercomplete.click();
        Thread.sleep(3000);
        
        WebElement billingPhone= driver.findElement(By.xpath("//input[@id='billing_phone']"));
        billingPhone.clear();
        billingPhone.sendKeys("01712345678");
        
        WebElement DistrictOptions= driver.findElement(By.xpath("//select[@id='billing_state']"));
        Select select =new Select(DistrictOptions);
        select.selectByIndex(5);
        Thread.sleep(3000);
      
        WebElement AreaOptions= driver.findElement(By.xpath("//select[@id='billing_area']"));
        Select select1 =new Select(AreaOptions);
        select1.selectByIndex(4);
        Thread.sleep(3000);
        
        
        WebElement address = driver.findElement(By.xpath("//textarea[@id='billing_address_1']"));
        address.clear();
        address.sendKeys("0 No. ward Pouroshova, Borhanuddin");
	    Thread.sleep(3000);
	   
	   
        
	    WebElement checkbox = driver.findElement(By.xpath("//input[@id='ship-to-different-address-checkbox']"));
	    checkbox.click();
	    Thread.sleep(5000);
	    
//	      WebElement page3= driver.findElement(By.xpath("//button[@id='place_order']"));
//        js.executeScript("arguments[0].scrollIntoView(true);",page3);
//        Thread.sleep(3000);
	    
	   
	    
	    WebElement shippingName= driver.findElement(By.xpath("//input[@id='shipping_first_name']"));
	    if (shippingName.isDisplayed()) 
	      { 
	    	shippingName.clear();
	    	shippingName.sendKeys("JUNNUN");
	    	Thread.sleep(5000);
	      } 
	    else 
	       {
	    	System.out.println("name field is not visible");
	       }
	      
	    WebElement shippingPhone= driver.findElement(By.xpath("//input[@id='shipping_phone']"));
	    shippingPhone.clear();
	    shippingPhone.sendKeys("01611111124");
	    Thread.sleep(3000);
	    
	    WebElement shippingDistrict= driver.findElement(By.xpath("//select[@id='shipping_state']"));
	    Select select2 =new Select(shippingDistrict);
        select2.selectByIndex(13);
	    Thread.sleep(5000);
	    
	    WebElement shippingArea= driver.findElement(By.xpath("//select[@id='shipping_area']"));
	    Select select3 =new Select(shippingArea);
        select3.selectByIndex(19);
	    Thread.sleep(3000);
	  
	    
	    WebElement address1 = driver.findElement(By.xpath("//textarea[@id='shipping_address_1']"));
        address1.clear();
        address1.sendKeys("Mirpur13");
	    Thread.sleep(3000);
	    
	    js.executeScript("window.scrollTo(0,0)");
	    Thread.sleep(3000);
	    
	    WebElement account = driver.findElement(By.xpath("//div[@class='login-links']//a[@title='আমার অ্যাকাউন্ট'][contains(text(),'আমার অ্যাকাউন্ট')]"));
	    account.click();
	    Thread.sleep(3000);
	    
	    WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'লগআউট')]"));
	    logout.click();
	    Thread.sleep(3000);
	    
	    
	}
	
}