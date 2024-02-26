package pages;

import org.openqa.selenium.By;

public class CustomerLoginPage extends BasePage{
	public String loginPageUrl = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/"; 
    public By emailInput = By.xpath("//input[@id='email']");
    public By passwordInput = By.xpath("//input[@name='login[password]']");
    public By signInButton = By.xpath("//button[@type='submit' and @class='action login primary']");
}
