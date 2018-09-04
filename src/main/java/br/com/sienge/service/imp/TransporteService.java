package br.com.sienge.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sienge.domain.entity.Transporte;
import br.com.sienge.domain.enums.Rodovia;
import br.com.sienge.service.ICustoRodoviaService;
import br.com.sienge.service.ITransporteService;

@Service
public class TransporteService implements ITransporteService {

	private static final Double LIMITE_CARGA = 5.0;
	private static final Double ACRESCIMO_CUSTO_MANUTENCAO = 0.02;

	@Autowired
	ICustoRodoviaService custoRodoviaService;

	@Override
	public Double getCusto(Transporte transporte) {
		Double custoKmRodadoNaoPavimentado = custoRodoviaService
				.calcularCustoKmRodado(Rodovia.NAO_PAVIMENTADA.getCustoKm(), transporte.getDistanciaNaoPavimentada());
		Double custoKmRodadoPavimentado = custoRodoviaService.calcularCustoKmRodado(Rodovia.PAVIMENTADA.getCustoKm(),
				transporte.getDistanciaPavimentada());
		Double resultado = custoKmRodadoNaoPavimentado + custoKmRodadoPavimentado;

		resultado = custoRodoviaService.calcularCustoVeiculo(resultado,
				transporte.getTipoVeiculo().getFatorMultiplicador());

		if (transporte.getPesoCarga() > LIMITE_CARGA) {
			Double toneladaExcedente = transporte.getPesoCarga() - LIMITE_CARGA;
			Double kmRodado = transporte.getDistanciaNaoPavimentada() + transporte.getDistanciaPavimentada();
			Double custoToneladaExcedente = custoRodoviaService.calcularCustoToneladaExcedente(toneladaExcedente,
					ACRESCIMO_CUSTO_MANUTENCAO, kmRodado);

			resultado += custoToneladaExcedente;
		}

		return resultado;
	}

}
