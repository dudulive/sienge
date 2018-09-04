package br.com.sienge.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.sienge.domain.entity.Transporte;
import br.com.sienge.domain.enums.TipoVeiculo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransporteServiceTest {

	@Autowired
	private ITransporteService service;

	@Test
	public void getCustoDistanciaPavimantadaComCaminhaoCacambaComCargaExcedenteTest() {
		Transporte transporte = new Transporte();
		transporte.setDistanciaNaoPavimentada(0.0);
		transporte.setDistanciaPavimentada(100.0);
		transporte.setPesoCarga(8.0);
		transporte.setTipoVeiculo(TipoVeiculo.CAMINHAO_CACAMBA);
		assertEquals(service.getCusto(transporte), 62.70, 0);
	}

	public void getCustoDistanciaNaoPavimantadaComCaminhaoBauComCargaNaoExcedenteTest() {
		Transporte transporte = new Transporte();
		transporte.setDistanciaNaoPavimentada(60.0);
		transporte.setDistanciaPavimentada(0.0);
		transporte.setPesoCarga(4.0);
		transporte.setTipoVeiculo(TipoVeiculo.CAMINHAO_BAU);
		assertEquals(service.getCusto(transporte), 37.20, 0);
	}

	public void getCustoDistanciaNaoPavimantadaComCarretaComCargaExcedenteTest() {
		Transporte transporte = new Transporte();
		transporte.setDistanciaNaoPavimentada(0.0);
		transporte.setDistanciaPavimentada(180.0);
		transporte.setPesoCarga(12.0);
		transporte.setTipoVeiculo(TipoVeiculo.CARRETA);
		assertEquals(service.getCusto(transporte), 150.19, 0);
	}

	public void getCustoDistanciaComCaminhaoBauComCargaExcedenteTest() {
		Transporte transporte = new Transporte();
		transporte.setDistanciaNaoPavimentada(20.0);
		transporte.setDistanciaPavimentada(80.0);
		transporte.setPesoCarga(6.0);
		transporte.setTipoVeiculo(TipoVeiculo.CAMINHAO_BAU);
		assertEquals(service.getCusto(transporte), 57.60, 0);
	}

	public void getCustoDistanciaComCaminhaoCacambaComCargaTest() {
		Transporte transporte = new Transporte();
		transporte.setDistanciaNaoPavimentada(30.0);
		transporte.setDistanciaPavimentada(50.0);
		transporte.setPesoCarga(5.0);
		transporte.setTipoVeiculo(TipoVeiculo.CAMINHAO_CACAMBA);
		assertEquals(service.getCusto(transporte), 47.88, 0);
	}

}
