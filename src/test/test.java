package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;  
public class test {  
 public static void main(String args[]){  
  WebDriver driver=new ChromeDriver();  
  System.out.println("Hello Google...");  
  driver.get("http://google.com");    
 }  
}
