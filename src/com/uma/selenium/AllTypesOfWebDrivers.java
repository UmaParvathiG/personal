package com.uma.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AllTypesOfWebDrivers {
    public static void main(String[] args){

//        System.setProperty("webdriver.gecko.driver","/Users/administrator/Downloads/geckodriver");
//        WebDriver FFdriver=new FirefoxDriver();
//        FFdriver.get("http://demo.guru99.com/");
//        WebElement element=FFdriver.findElement(By.xpath("//input[@name='emailid']"));
//        element.sendKeys("abc@gmail.com");
//
//        WebElement button=FFdriver.findElement(By.xpath("//input[@name='btnLogin']"));
//        button.click();
//        FFdriver.quit();
//
//        System.setProperty("webdriver.chrome.driver","/Users/administrator/Downloads/chromedriver");
//        WebDriver chromeDriver=new ChromeDriver();
//        chromeDriver.quit();


        WebDriver safariDriver=new SafariDriver();
        safariDriver.get("http://demo.guru99.com/");
        safariDriver.quit();

    }
}