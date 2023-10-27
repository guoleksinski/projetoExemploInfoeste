package br.com.oleksinski.ProjetoAutomacao.pages;

import org.openqa.selenium.WebDriver;

import br.com.oleksinski.ProjetoAutomacao.dsl.Dsl;

public class HomePage {
	
private WebDriver driver;
private Dsl dsl;

public HomePage(WebDriver driver) {
	this.driver = driver;
	dsl = new Dsl(driver);
}

public void clicarBotaoCadastrar() {
	dsl.clickBotao("//*[@id=\"root\"]/div[2]/div/div[2]/button");
}
public void aguardarHomePageCarregar() {
	dsl.esperarCarregarPagina("localhost");
}
}
