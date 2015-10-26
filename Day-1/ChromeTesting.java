import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeTesting {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?_rdr");
		WebElement emailTextBox  = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("mike@gmail.com");
		WebElement passwordTextBox  = driver.findElement(By.id("pass"));
		passwordTextBox.sendKeys("123mike32323");
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.id("u_0_v"));
		loginButton.click();
		WebElement msg = driver.findElement(By.cssSelector(".fsl.fwb.fcb"));
		//if(msg.getText().contains("your userid")){
		//if(msg.getText().equals("Please re-enter your password")){	
		if(msg.getText().startsWith("Please")){
		System.out.println("Test is Pass");
		}
		else
		{
			System.out.println("Test is Fail");
		}
		driver.close();

	}

}
