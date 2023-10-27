package br.com.oleksinski.ProjetoAutomacao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.oleksinski.ProjetoAutomacao.dsl.Dsl;

public class CadastroPage {

	private WebDriver driver;
	private Dsl dsl;

	public CadastroPage(WebDriver driver) {
		this.driver = driver;
		dsl = new Dsl(driver);
	}
	
	public void clicarBotaoProf () {
		dsl.clickBotao("/html/body/div[2]/div[3]/div[2]/button[1]");
	}
	public void aguardarCarregarPag() {
		dsl.aguardarElementoPag("/html/body/div[2]/div[3]");
	}
	public void preencherNome() {
		dsl.enviarCaracteres("//*[@id=\"ipt-nome\"]", "Gustavo");
	}
	public void preencherCpf() {
		dsl.enviarCaracteres("//*[@id=\"ipt-cpf\"]", "487.906.710-58");
	}
	public void preencherEmail() {
		dsl.enviarCaracteres("//*[@id=\"ipt-email\"]", "gustavoleksinski@gmail.com");
	}
	public void aguardarCarregarPagCadastro() {
		dsl.esperarCarregarPagina("Professor");
	}
	public void clicarBotaoProx() {
		dsl.clickBotao("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div/button");
	}
}
