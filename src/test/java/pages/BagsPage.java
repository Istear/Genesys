package pages;

import org.openqa.selenium.By;

public class BagsPage extends BasePage {
	public By bagOne = By.xpath("//img[@alt='Rival Field Messenger']");
	public By addCartButton = By.xpath("//span[text()='Add to Cart']");
	public By cart = By.xpath("//header/div[2]/div[1]/a[1]");
	public String bagOneInCart = "//a[contains(text(),'Rival Field Messenger')]";
}
