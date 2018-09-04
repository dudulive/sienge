package br.com.sienge.controller;

import static org.junit.Assert.assertEquals;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.sienge.domain.entity.Transporte;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class TransporteControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void transporteValidoTest() {
		JSONObject json = new JSONObject();
		try {
			json.put("pesoCarga", 8.0);
			json.put("tipoVeiculo", 1);
			json.put("distanciaPavimentada", 100.0);
			json.put("distanciaNaoPavimentada", 0.0);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headers);

			ResponseEntity<Transporte> response = restTemplate.postForEntity("/api/transporte/custo", entity,
					Transporte.class);

			assertEquals(response.getStatusCode(), HttpStatus.OK);
			assertEquals(response.getBody().getCustoTransporte(),  62.70, 0);

		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

}
