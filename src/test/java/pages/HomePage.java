package pages;


import org.openqa.selenium.By;


public class HomePage extends BasePage{
    public  String homePageUrl = "https://magento.softwaretestingboard.com/";
    public By signInButton = By.linkText(" Sign In ");
    public String logoImage = "//header/div[2]/a[1]/img[1]";
    public By gearOption =  By.xpath("//span[text()='Gear']");
    public By bagOption = By.xpath("//span[text()='Bags']");
    
}
