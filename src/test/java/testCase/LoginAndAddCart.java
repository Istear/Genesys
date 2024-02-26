package testCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BagsPage;
import pages.CustomerLoginPage;
import pages.HomePage;
import utilities.BaseDriver;
import utilities.DataSet;


public class LoginAndAddCart extends BaseDriver {
    HomePage homePage = new HomePage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    BagsPage bagsPage = new BagsPage();
    @Test (description ="Navigate to the website", priority = 1)
    public void navigate(){
        driver.get(homePage.homePageUrl);
        WebElement logoElement = homePage.getElement(By.xpath(homePage.logoImage));
        Assert.assertTrue(logoElement.isDisplayed());
        homePage.wait(1000);
    }

    @Test (description = "Sign In", priority = 2, dataProvider = "LoginData", dataProviderClass = DataSet.class)
    public void logIn(String email, String pass){
    	driver.get(customerLoginPage.loginPageUrl);
        customerLoginPage.writeText(customerLoginPage.emailInput, email);
        customerLoginPage.writeText(customerLoginPage.passwordInput, pass);
        customerLoginPage.clickOnElement(customerLoginPage.signInButton);
        customerLoginPage.wait(2000);
    }
    
    @Test (description = "Add to cart", priority = 3)
    public void addToCart() {
    	homePage.hoverAndClick(homePage.gearOption, homePage.bagOption);
    	bagsPage.scrollToElement(bagsPage.bagOne);
    	bagsPage.clickOnElement(bagsPage.bagOne);
    	bagsPage.clickOnElement(bagsPage.addCartButton);
    	bagsPage.wait(7000);
    	bagsPage.clickOnElement(bagsPage.cart);
    	bagsPage.wait(2000);
    	WebElement bagOneInCart = bagsPage.getElement(By.xpath(bagsPage.bagOneInCart));
    	Assert.assertTrue(bagOneInCart.isDisplayed());
    	bagsPage.wait(2000);
    }

}
