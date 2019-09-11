package JenkinsProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public void popup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cvheg\\eclipse-workspace\\ProjectMaven\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();

		// popup handling
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept(); // clicking on ok button
		System.out.println(al.getText());

		// clicking on cancel button
		// al.dismiss();
	}

}
