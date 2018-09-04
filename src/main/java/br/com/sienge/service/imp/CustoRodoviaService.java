package br.com.sienge.service.imp;

import org.springframework.stereotype.Service;

import br.com.sienge.service.ICustoRodoviaService;

@Service
public class CustoRodoviaService implements ICustoRodoviaService {

	@Override
	public Double calcularCustoKmRodado(Double custoKm, Double distanciaPercorrida) {
		return custoKm * distanciaPercorrida;
	}

	@Override
	public Double calcularCustoVeiculo(Double custoKmRodado, Double multiplicadorVeiculo) {
		return custoKmRodado * multiplicadorVeiculo;
	}

	@Override
	public Double calcularCustoToneladaExcedente(Double toneladaExcedente, Double acrescimoKmRodado, Double kmRodado) {
		return toneladaExcedente * acrescimoKmRodado * kmRodado;
	}

}
