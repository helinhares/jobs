package steps;

import utils.TestRule;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import pages.SimuladorPage;

public class SimuladorSteps {
	@Dado ("que abri a url do simulador")
	public void acessarSistemaSimulador() {
		TestRule.abrirUrl("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
	}
	
	@E ("selecionei para voce")
	public void selecionarParaVoce() {
		SimuladorPage simulador = new SimuladorPage();
		simulador.selecionarParaVoce();
	}
	@E ("selecionei para empresa")
	public void selecionarParaEmpresa() {
		SimuladorPage simulador = new SimuladorPage();
		simulador.selecionarParaEmpresa();
	}
	
	@E ("preenchi o valor \"(.*)\" que quero aplicar")
	public void preencherValorAplicar(String valor) {
		SimuladorPage simulador = new SimuladorPage();
		simulador.valorParaAplicar(valor);
		
	}

	@E ("preenchi o valor \"(.*)\" que quero poupar")
	public void preencherValorPoupar(String valor) {
		SimuladorPage simulador = new SimuladorPage();
		simulador.valorParaInvestir(valor);
	}

	@E ("preenchi \"(.*)\" anos que quero poupar")
	public void preencherTempoEmAnos(String time) {
		SimuladorPage simulador = new SimuladorPage();
		simulador.tempoAnos(time);
	}

	@E ("preenchi \"(.*)\" meses que quero poupar")
	public void preencherTempoEmMeses(String time) {
		SimuladorPage simulador = new SimuladorPage();
		simulador.tempoMeses(time);
	}
	
	@Entao ("clico em simular")
	public void clicarSimular() {
		SimuladorPage simulador = new SimuladorPage();
		simulador.simular();
	}
	
	@E ("devo ver a tabela com mes e valor")
	public void verificoTabelaEValor() {
		SimuladorPage simulador = new SimuladorPage();
		Assert.assertTrue("Algum item da tabela não foi encontrado", simulador.apresentouTabela());
	}
	
	@Entao ("deve apresentar a mensagem de campos obrigatorios")
	public void verificarCamposObrigatorios() {
		SimuladorPage simulador = new SimuladorPage();
		Assert.assertTrue("Algum campo obrigatório não foi preenchido", simulador.apresentouMensagemCampoObrigatorio());
	}
	
    @E ("clico em refazer simulacao")
    public void refazerSimulacao() {
    	SimuladorPage simulador = new SimuladorPage();
    	simulador.clicarRefazer();
    }
    
    @Entao ("devo ver o simulador sem dados preenchidos")
    public void verificarSimuladorSemDados() {
    	SimuladorPage simulador = new SimuladorPage();
    	Assert.assertTrue("Algum campo obrigatório não foi preenchido", simulador.apresentouSimuladorSemValoresPreenchidos());
    	
    	
    }
	
}
