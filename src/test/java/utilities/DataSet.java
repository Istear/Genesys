package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
	
	@DataProvider(name = "LoginData")
	public static Object loginDataset() {
		Object[][] validObjects = {
				{"userone@user.com","user123@123"}
				};
		return validObjects;
	}
}
