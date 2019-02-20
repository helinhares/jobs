package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimuladorPageElementMap {

	@FindBy(xpath = "//input[@name='perfil'][@value='paraVoce']")
	protected WebElement paraVoce;
	
	@FindBy(xpath = "//input[@name='perfil'][@value='paraEmpresa']")
	protected WebElement paraEmpresa;

	@FindBy(xpath = "//label[@id='valorAplicar-error']")
	protected WebElement valorAplicarErro;
	
	@FindBy(xpath = "//label[@id='valorInvestir-error']")
	protected WebElement valorInvestirErro;

	@FindBy(xpath = "//label[@id='tempo-error']")
	protected WebElement tempoError;
	
	protected WebElement valorAplicar;
	
	protected WebElement valorInvestir;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	protected WebElement simular;

	@FindBy(css = ".btSelect")
	protected WebElement tipoTempo;

	@FindBy(css = ".btnRefazer")
	protected WebElement btnRefazer;

	@FindBy(xpath = "//a[@rel='A']")
	protected WebElement anos;

	@FindBy(xpath = "//a[@rel='M']")
	protected WebElement meses;
	
	@FindBy(xpath = "//th[contains(text(),'Tempo (Meses)')]")
	protected WebElement textoTempoMeses;
	
	@FindBy(xpath = "//th[contains(text(),'Valor')]")
	protected WebElement textoValor;
	
	protected WebElement tempo;
	
	
}
