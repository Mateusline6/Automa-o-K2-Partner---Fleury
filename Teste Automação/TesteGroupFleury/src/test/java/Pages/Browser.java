package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
/**
 * Chamando a classe WebDriver do Selenium
 */
	private static WebDriver driver;

	public static WebDriver Driver() {

		return driver;
	}

	/**
	 * @author Mateus
	 * @param appUrl
	 * Metodo de executar o navegador
	 */
	public void executarNavegador(String appUrl) {

		try {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(appUrl);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Executando navegador");
		} catch (Exception e) {
			System.out.println("---ERRO--- " + e.getMessage());
		}

	}

}
