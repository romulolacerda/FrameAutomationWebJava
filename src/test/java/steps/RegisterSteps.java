package steps;

import java.util.List;
import java.util.Map;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import page.RegisterPage;

public class RegisterSteps {
	
	@Before
	public void abreNavegador() {
		Driver.setDriver("http://demo.automationtesting.in/Register.html");
	}

	RegisterPage registerPage = new RegisterPage();

	@Dado("que estou na pagina register {string}")
	public void queEstouNaPaginaRegister(String titulo) {
		registerPage.validaTitulo("Register");
	}

	@Quando("preencho o campo firstname com {string}")
	public void preenchoOCampoFirstnameCom(String firstname) {
		registerPage.setFirstName("Romulo");
	}

	@Quando("preencho o campo lastname com {string}")
	public void preenchoOCampoLastnameCom(String lastname) {
		registerPage.setLastName("Lacerda");
	}

	@Quando("preencho o campo adress com {string}")
	public void preenchoOCampoAdressCom(String adress) {
		registerPage.setEndereco("Rua Maria Alice Gomes Dias");
	}

	@Quando("preencho o campo email com {string}")
	public void preenchoOCampoEmailCom(String email) {
		registerPage.setEmail("romulolacerda9@hotmail.com");
	}

	@Quando("preencho o campo phone com {string}")
	public void preenchoOCampoPhoneCom(String phone) {
		registerPage.setTelefone("1136865938");
	}

	@Quando("clico em {string} do campo gender")
	public void clicoEmDoCampoGender(String gender) {
		registerPage.clickGenero("Male");
	}

	@Quando("seleciono os hobbies")
	public void selecionoOsHobbies(io.cucumber.datatable.DataTable hobbies) {
	    List<Map<String, String>> mapHobbies = hobbies.asMaps(String.class, String.class);
	    for (Map<String, String> map : mapHobbies) {
	    	registerPage.clickHobbie(map.get("hobbie"));
	    }
	}

	@Quando("seleciono as linguagens")
	public void selecionoAsLinguagens(io.cucumber.datatable.DataTable idiomas) {
		List<String> languages = idiomas.asList();
		registerPage.selecionaLanguages(languages);
	
	}

	@Quando("envio o arquivo {string}")
	public void envioOArquivo(String arquivo) {
		String caminhoArquivo = System.getProperty("user.dir")+"\\files\\" + arquivo;
		registerPage.setFile(caminhoArquivo);
	}

	@Quando("seleciono a skill {string}")
	public void selecionoASkill(String skill) {
		registerPage.selecionaSkills(skill);
	}

	@Quando("seleciono o primeiro country com {string} e o segundo country com {string}")
	public void selecionoOPrimeiroCountryComEOSegundoCountryCom(String country, String countryDois) {
	    registerPage.selecionaCountry(country);
	    registerPage.selecionaCountryDois(countryDois);
	}

	@Quando("seleciono o ano {string} e o mes {string} e o dia {string}")
	public void selecionoOAnoEOMesEODia(String year, String month, String day) {
	    registerPage.selecionaYear(year);
	    registerPage.selecionaMounth(month);
	    registerPage.selecionaDay(day);
	}

	@Quando("preencho o campo password com {string} e o confirma password com {string}")
	public void preenchoOCampoPasswordComEOConfirmaPasswordCom(String password, String confirmaPassword) {
	    registerPage.setPassword(password);
	    registerPage.setConfirmPassword(confirmaPassword);
	}

	@Quando("clico em cadastrar")
	public void clicoEmCadastrar() {
	    registerPage.clickSubmit();
	    Driver.aguardaTempo(5000);
	}
	
	@After
	public void fechaNavegador() {
		Driver.getDriver().quit();
	}
}
