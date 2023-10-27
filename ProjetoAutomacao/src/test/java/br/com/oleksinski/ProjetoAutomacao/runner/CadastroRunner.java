package br.com.oleksinski.ProjetoAutomacao.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features/cadastro"}, glue = {"br.com.oleksinski.ProjetoAutomacao.steps.cadastro"})
public class CadastroRunner {

}
