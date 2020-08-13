package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageFactory.Page_de_connexion_EP;

public class Verification_Page_de_connexion_EP {
	String driverPath="D:\\Utilitaire Selenium avec Java\\geckodriver.exe";
	String geckoKey="webdriver.gecko.driver";
	WebDriver driver;
	Page_de_connexion_EP PageConnexion;
 
	@BeforeTest
  public void beforeTest() {
	  System.setProperty(geckoKey, driverPath);
	  this.driver=new FirefoxDriver();
	  this.driver.manage().window().maximize();
	  this.driver.get("https://seloger.com");
	  this.PageConnexion=new Page_de_connexion_EP(driver);
  }
	
 @Test(priority=1)	
  public void cliquer_sur_le_bouton_se_connecter_du_header() {
	  (driver.findElement(By.xpath("//button[contains(text(),'Créer un compte')]"))).click();
  }
 /* 
  @Test
  public void verifier_presence_croix_de_fermeture() {
	  
  }*/
  
 @Test(priority=2)	
 public void cliquer_sur_onglet_se_connecter() {
	  //(driver.findElement(By.xpath("//button[@class='Tab__StyledTab-d6mpy1-0 kDUAiX']"))).click();
	  PageConnexion.ongletConnexion.click();
 }
 
  @Test(priority=3)	
  public void verifier_presence_onglet_creer_un_compte() {
	  Assert.assertEquals(PageConnexion.ongletInscription.getText(),"Créer un compte","Element non conforme");
  }
  
  @Test(priority=4)
  public void verifier_presence_onglet_se_connecter() {
	  Assert.assertEquals(PageConnexion.ongletConnexion.getText(),"Se connecter","Element non conforme"); 
  }
  
  @Test(priority=5)
  public void verifier_presence_bouton_facebook() {
	  Assert.assertEquals(PageConnexion.boutonFacebook.getText(), "Facebook","Element non conforme");
  }
  
  @Test(priority=6)
  public void verifier_presence_bouton_google() {
	  Assert.assertEquals(PageConnexion.boutonGoogle.getText(), "Google","Element non conforme");
  }
  
  @Test(priority=7)
  public void verifier_presence_champ_email() {
	  
  }
  /*
  @Test(priority=8)
  public void verifier_presence_champ_mot_de_passe() {
	 
  }
  
  @Test(priority=9)
  public void verifier_presence_lien_montrer() {
	 
  }
  
  @Test(priority=10)
  public void verifier_presence_bouton_se_connecter() {
	  
  }
  
  @Test(priority=11)
  public void verifier_presence_lien_mot_de_passe_oublie() {
	  
  }
  
  @Test(priority=12)
  public void verifier_presence_mention_legal() {
	
  }
   @AfterTest(priority=13)
  public void afterTest() {
	  driver.close();
  }*/
  

 

}
