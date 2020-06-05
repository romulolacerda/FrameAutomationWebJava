package runner;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Driver;
import page.RegisterPage;

//CLASSE RESPONSAVEL POR EXECUTAR O TESTE ATRAVES DO '@TEST'

public class ExecutaCurso {
	RegisterPage registerPage = new RegisterPage();
	
	@Before
	public void abreNavegador() {
		Driver.setDriver("http://demo.automationtesting.in/Register.html");
	}

	@Test
	public void preencheFormulario() {
		registerPage.validaTitulo("Register");
		registerPage.setFirstName("Romulo");
		registerPage.setLastName("Lacerda");
		registerPage.setEndereco("Rua Maria Alice Gomes Dias");
		registerPage.setEmail("romulolacerda9@hotmail.com");
		registerPage.setTelefone("1136865938");
		registerPage.validatelefone("1136865938");
		registerPage.clickGenero("Male");
		registerPage.clickHobbie("Movies");
		registerPage.clickHobbie("Hockey");
		String caminhoArquivo = System.getProperty("user.dir")+"\\files\\teste.jpg";
		registerPage.setFile(caminhoArquivo);
		registerPage.validaLogo("original.png");
		List<String> languages = new ArrayList<String>();
		languages.add("Portuguese");
		languages.add("English");
		registerPage.selecionaLanguages(languages);
		registerPage.selecionaSkills("Java");
		registerPage.selecionaCountry("Brazil");
		registerPage.selecionaCountryDois("Australia");
		registerPage.selecionaYear("1994");
		registerPage.selecionaMounth("August");
		registerPage.selecionaDay("23");
		registerPage.setPassword("Teste123");
		registerPage.setConfirmPassword("Teste123");
		registerPage.clickSubmit();
		Driver.aguardaTempo(5000);
		
	}

	public void clickElementText(String map, String valor) {
		List<WebElement> listWebElements = Driver.getDriver().findElements(By.xpath(map));

		for (WebElement webElement : listWebElements) {
			if (webElement.getAttribute("value").equals(valor)) {
				webElement.click();
				break;
			}
		}
	}
	
	@After
	public void fechaNavegador() {
		Driver.getDriver().quit();
	}
}
