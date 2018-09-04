package br.com.sienge.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.sienge.service.imp.CustoRodoviaService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustoRodoviaServiceTest {
	
	@Autowired
	private CustoRodoviaService service;

	@Test
	public void calcularCustoKmRodadoTest() {
		assertEquals(service.calcularCustoKmRodado(2.0, 2.0), 4.0, 0);
	}
	
	@Test
	public void calcularCustoToneladaExcedenteTest() {
		assertEquals(service.calcularCustoToneladaExcedente(1.0, 1.0, 1.0), 1.0, 0);
	}
	
	@Test
	public void calcularCustoVeiculoTest() {
		assertEquals(service.calcularCustoVeiculo(2.0, 2.0), 4.0, 0);
	}

}
