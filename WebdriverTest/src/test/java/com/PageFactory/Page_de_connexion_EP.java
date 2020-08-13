package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_de_connexion_EP {
	WebDriver driver;
	
	@FindBy(xpath="//button[starts-with(@class,'Tab__StyledTab')][1]")
	public WebElement ongletInscription;
	
	@FindBy(xpath="//button[starts-with(@class,'Tab__StyledTab')][2]")
	public WebElement ongletConnexion;
	
	@FindBy(xpath="//div[@class='SocialConnectstyled__BlocButtons-sc-15g4356-0 bIoQhy']//button[1]")
	public WebElement boutonFacebook;
	
	@FindBy(xpath="//div[@class='SocialConnectstyled__BlocButtons-sc-15g4356-0 bIoQhy']//button[2]")
	public WebElement boutonGoogle;
	
	@FindBy(xpath="//div[@class='SocialConnectstyled__Split-sc-15g4356-1 isTPeO']")
	public WebElement ligneSeparation;
	
	@FindBy(xpath="//input[@id='input_9']")
	public WebElement champMail;
	
	@FindBy(xpath="//input[@id='input_10']")
	public WebElement champMdp;
	
	@FindBy(xpath="//span[contains(text(),'Montrer')]")
	public WebElement lienMontrer;
	
	@FindBy(xpath="//button[@class='Button__StyledButton-fl6j-2 duIBCg']")
	public WebElement boutonConnecter;
	
	@FindBy(xpath="//button[@class='Connectstyled__Link-sc-1yfxz52-1 lfybvE']")
	public WebElement lienMdpOublie;
	
	@FindBy(xpath="//div[contains(text(),'Vos informations sont traitées par Digital Classif')]")
	public WebElement mentionLegal;
	
	@FindBy(xpath="//div[@class='Modalstyled__StyledClose-sc-1f0tts4-3 bsLNLG Icon__IconElement-sc-1xnn3zd-0 gBypsC']")
	public WebElement croixFermeture;
	
	public Page_de_connexion_EP(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
