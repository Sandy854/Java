package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory.Page_de_connexion_EP;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Connexion_EP_steps {

	String driverPath = "D:\\Utilitaire Selenium avec Java\\geckodriver.exe";
	String geckoKey = "webdriver.gecko.driver";
	WebDriver driver;
	Page_de_connexion_EP PageConnexion;

	@Given("^Ouvre la Home Page de SeLoger$")
	public void ouvrir_la_home_page_sl() throws Throwable {
		System.setProperty(geckoKey, driverPath);
		  this.driver=new FirefoxDriver();
		  this.driver.manage().window().maximize();
		  this.driver.get("https://seloger.com");
		  this.PageConnexion=new Page_de_connexion_EP(driver);
		System.out.println("Ouverture de la HP");
	}

	@When("^Clique sur le bouton d'accès à l'EP$")
	public void ouvrir_l_EP() throws Throwable {
		(driver.findElement(By.xpath("//button[contains(text(),'Créer un compte')]"))).click();
		System.out.println("Ouverture du popin EP");
	}
	
	@And("^Choisir l'onglet 'Se connecter'$")
	public void choisir_onglet_se_connecter() {
		PageConnexion.ongletConnexion.click();
		System.out.println("Onglet 'Se connecter' choisi");
	}
	
	@And("^Saisir les bons Login$")
	public void saisir_login() {
		PageConnexion.champMail.sendKeys("deez.alicia@gmail.com");
		PageConnexion.champMdp.sendKeys("Alicia007");
		System.out.println("Saisi login");
	}
	
	@And("^Clique sur le bouton 'Se connecter'$")
	public void valider_login() {
		PageConnexion.boutonConnecter.click();
		System.out.println("Validation du Login");
	}

	@Then("^L'utilisateur est connecté$")
	public void verifier_si_l_utilisateur_est_connecte() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver,20);	
		WebElement titre=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Mon Compte')]")));
		Assert.assertEquals(titre.getText(), "Mon Compte");
		System.out.println("Utilisateur connecté");
	}

}