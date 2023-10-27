package br.com.oleksinski.ProjetoAutomacao.steps.google;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.security.Security;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PesquisaGoogle {
	 private static WebDriver driver;
	 private DevTools devTools;
	 
	 
@Before
public void initialize() {
	driver = new ChromeDriver();
	System.out.println(driver.getTitle()); 
    driver.get("http:localhost:3000");
}
@After
public void close() {
	driver.quit();
}

@Given("abro a pagina do google")
public void abro_a_pagina_do_google() throws InterruptedException {
	
}
@When("digito na barra de pesquisa")
public void digito_na_barra_de_pesquisa() throws InterruptedException {
    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Infoeste");
    Thread.sleep(2000);
    
}
@When("clico no botão pesquisar")
public void clico_no_botão_pesquisar() throws InterruptedException {
    driver.findElement(By.xpath("//*[@value=\"Pesquisa Google\"]")).click();
    Thread.sleep(10000);
}
@Then("deve aparecer a pesquisa feita")
public void deve_aparecer_a_pesquisa_feita() {
    Assert.assertEquals(driver.getTitle(),"Infoeste - Pesquisa Google");;
}
}


