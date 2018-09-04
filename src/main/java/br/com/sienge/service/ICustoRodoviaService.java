package br.com.sienge.service;

public interface ICustoRodoviaService {
	
	Double calcularCustoKmRodado(Double custoKm, Double distanciaPercorrida);
	
	Double calcularCustoVeiculo(Double custoKmRodado, Double multiplicadorVeiculo);
	
	Double calcularCustoToneladaExcedente(Double toneladaExcedente, Double acrescimoKmRodado ,Double kmRodado);

}
