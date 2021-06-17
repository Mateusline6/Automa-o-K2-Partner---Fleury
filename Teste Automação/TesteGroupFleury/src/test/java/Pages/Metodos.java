package Pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browser {
/**
 * @author Mateus
 * @param elemento
 * Metodo de clicar em um elemento
 */
	public void clicar(By elemento) {
		try {
			Driver().findElement(elemento).click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("---ERRO--- " + e.getMessage());
		}
	}
/**
 * @author Mateus
 * @param nomeSrc
 * @throws IOException
 * Metodo de Tirar screenShots da Tela
 */
	public void screenShot(String nomeSrc) throws IOException {

		try {

			TakesScreenshot srcShot = ((TakesScreenshot) Driver());
			File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nomeSrc + ".png");
			FileUtils.copyFile(srcFile, destFile);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao tirar print " + e.getMessage());

		}

	}
/**
 * @author Mateus
 * @param texto
 * @param elemento
 * @throws IOException
 * Metodo de validar um elemento
 */
	public void validar(String texto, By elemento) throws IOException {
		try {
			String txt = Driver().findElement(By.className("typographycomponentstyle__H1-sc-1oox73n-1 lomAMa")).getText();
			assertEquals(txt, texto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro no sleep " + e.getMessage());

		}
	}

	
	
	/**
	 * @author Mateus
	 * @throws IOException
	 * Metodo pra utilizar o scroll da pagina, pois o mesmo não estava localizando o elemento 
	 */
	public void scroll() throws IOException {
		try {

			JavascriptExecutor jse = (JavascriptExecutor) Driver();
			jse.executeScript("window.scrollBy(0,240)", "");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro no scroll " + e.getMessage());

		}

	}
	
	
/**
 * @author Mateus
 * @param tempo
 * @throws InterruptedException
 * @throws IOException
 * Metodo de Sleep para parar a pagina e poder achar o elemento
 */
	public void tempo(int tempo) throws InterruptedException, IOException {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro no sleep " + e.getMessage());

		}
	}
/**
 * @author Mateus
 * Metodo de fechar o navegador
 */
	public void fechar() {

		Driver().quit();

	}
}
