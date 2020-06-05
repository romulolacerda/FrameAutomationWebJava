package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	//CLASSE RESPONSAVEM POR ABRIR O NAVEGADOR
	
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(String url) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void aguardaTempo(long tempo) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
