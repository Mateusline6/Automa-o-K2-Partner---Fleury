package Element;

import org.openqa.selenium.By;

public class Elements {

	// Elementos procurando por XPath e CssSelector

	public By unidades = By.cssSelector(
			"#gatsby-focus-wrapper > div.client-doctor-headercomponentstyle__DesktopBottomHeaderStyled-owoxoj-2.FjEqa > div > div > div > div > div:nth-child(16)");
	public By acessibilidade = By.xpath(
			"//*[@id=\"gatsby-focus-wrapper\"]/div[8]/div[3]/div[3]/div[1]/div[2]/div/div[2]/label/div/div/div[1]/div/img");
	public By detalhes = By.cssSelector("#button-see-on-map-2-vila-mariana > div");
	public By textoPage = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[8]/div[2]/div/h1");
	public By checkBox = By.id("checkoox-select-facilities");
}
