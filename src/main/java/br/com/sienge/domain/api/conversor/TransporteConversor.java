package br.com.sienge.domain.api.conversor;

import org.springframework.stereotype.Component;

import br.com.sienge.domain.api.ApiTransporte;
import br.com.sienge.domain.entity.Transporte;
import br.com.sienge.domain.enums.TipoVeiculo;

@Component
public class TransporteConversor {

	public Transporte deApiParaEntidade(ApiTransporte api) {
		Transporte transporte = new Transporte();
		try {
			Double pesoCarga = Double.parseDouble(api.getPesoCarga());    
			double distanciaPavimentada = Double.parseDouble(api.getDistanciaPavimentada());
			double distanciaNaoPavimentada = Double.parseDouble(api.getDistanciaNaoPavimentada());
			TipoVeiculo tipoVeiculo = TipoVeiculo.values()[Integer.parseInt(api.getTipoVeiculo())];

			transporte.setPesoCarga(pesoCarga);
			transporte.setDistanciaPavimentada(distanciaPavimentada);
			transporte.setDistanciaNaoPavimentada(distanciaNaoPavimentada);
			transporte.setTipoVeiculo(tipoVeiculo);
			return transporte;
		} catch (Exception e) {
			throw new IllegalArgumentException("Parâmetros inválidos: " + e.getMessage());
		}
	}
	
}
