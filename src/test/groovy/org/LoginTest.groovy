package org

import geb.Browser
import geb.spock.GebSpec
import org.openqa.selenium.chrome.ChromeDriver

class LoginTest extends GebSpec {
	
	
	def "Successful login"(){
		given:"the user is on loghin page"
		def browser=new Browser()
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Selenium Software\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe")
		browser.driver = new ChromeDriver()
		browser.go("http://www.newtours.demoaut.com/")
		
		when:"users enters correct credentials"
		LoginPageObject.name0
		LoginPageObject.name.value("username1")
	   LoginPageObject.password.value("password1")
	   LoginPageObject.loginbutton.click()
	   
	   
	   then:"user can do successfull login"
	   assert title =="Find a flight"
		
	}
	

}
