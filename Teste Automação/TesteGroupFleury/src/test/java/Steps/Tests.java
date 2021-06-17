package Steps;

import java.io.IOException;

import Element.Elements;
import Pages.Browser;
import Pages.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tests {

	Browser b = new Browser();
	Metodos m = new Metodos();
	Elements e = new Elements();

	// Abrindo o Site
	@Given("Que esteja no site {string}")
	public void que_esteja_no_site(String site) {
		b.executarNavegador(site);
	}

	// clicando em "UNIDADES"
	@Given("Clique em unidades")
	public void clique_em_unidades() throws IOException {
		m.clicar(e.unidades);
		m.screenShot("ClickUnidades");
	}

	// Selecionando pela facilidade da unidade
	@When("Selecionar unidade por facilidade")
	public void selecionar_unidade_por_facilidade() throws IOException, InterruptedException {
		m.tempo(10);
		m.scroll();
		m.clicar(e.checkBox);
		m.clicar(e.acessibilidade);
		m.screenShot("ClickAcess");
	}

	// Validando o Nome da unidade selecionada
	@Then("Valido nome da unidade")
	public void valido_nome_da_unidade() throws IOException, InterruptedException {
		m.tempo(10);
		m.scroll();
		m.clicar(e.detalhes);
		m.screenShot("ClickDetalhes");
		m.validar("Unidades Vila Mariana", e.textoPage);
		m.screenShot("ValidadoNome");
		m.fechar();
	}

}
