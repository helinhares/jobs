package pages;

import org.openqa.selenium.support.PageFactory;

public class SimuladorPage extends SimuladorPageElementMap {

	public SimuladorPage() {
		PageFactory.initElements(utils.TestRule.getDriver(), this);
	}

	public void selecionarParaVoce() {
		paraVoce.click();
	}

	public void selecionarParaEmpresa() {
		paraEmpresa.click();
	}

	public void valorParaAplicar(String valor) {
		valorAplicar.sendKeys(valor);
	}

	public void valorParaInvestir(String valor) {
		valorInvestir.sendKeys(valor);
	}

	public void tempoAnos(String time) {
		tipoTempo.click();
		anos.click();
		tempo.sendKeys(time);
	}

	public void tempoMeses(String time) {
		tipoTempo.click();
		meses.click();
		tempo.sendKeys(time);
	}

	public void simular() {
		simular.submit();
	}

	public boolean apresentouTabela() {
		try {
			if (!textoTempoMeses.getText().isEmpty() && !textoValor.getText().isEmpty()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}
	
	public boolean apresentouMensagemCampoObrigatorio() {
		try {
			if (!valorAplicarErro.getText().isEmpty() && !valorInvestirErro.getText().isEmpty() && !tempoError.getText().isEmpty()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}
	
	public void clicarRefazer() {
		btnRefazer.click();
	}
	
	public boolean apresentouSimuladorSemValoresPreenchidos() {
		try {
			if (valorAplicar.getText().isEmpty() && valorInvestir.getText().isEmpty() && tempo.getText().isEmpty()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		
	}
	

}
