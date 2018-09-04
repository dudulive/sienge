<<<<<<< HEAD
package br.com.sienge.domain.entity;

import br.com.sienge.domain.enums.TipoVeiculo;

public class Transporte {

	private Double pesoCarga;
	private Double distanciaPavimentada;
	private Double distanciaNaoPavimentada;
	private TipoVeiculo tipoVeiculo;
	private Double custoTransporte;
	
	public Double getPesoCarga() {
		return pesoCarga != null ? pesoCarga : 0D;
	}
	public void setPesoCarga(Double pesoCarga) {
		this.pesoCarga = pesoCarga;
	}
	public Double getDistanciaPavimentada() {
		return distanciaPavimentada != null ? distanciaPavimentada : 0D;
	}
	public void setDistanciaPavimentada(Double distanciaPavimentada) {
		this.distanciaPavimentada = distanciaPavimentada;
	}
	public Double getDistanciaNaoPavimentada() {
		return distanciaNaoPavimentada != null ? distanciaNaoPavimentada : 0D;
	}
	public void setDistanciaNaoPavimentada(Double distanciaNaoPavimentada) {
		this.distanciaNaoPavimentada = distanciaNaoPavimentada;
	}
	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public Double getCustoTransporte() {
		return custoTransporte;
	}
	public void setCustoTransporte(Double custoTransporte) {
		this.custoTransporte = custoTransporte;
	}

}
=======
package br.com.sienge.domain.entity;

import br.com.sienge.domain.enums.TipoVeiculo;

public class Transporte {

	private Double pesoCarga;
	private Double distanciaPavimentada;
	private Double distanciaNaoPavimentada;
	private TipoVeiculo tipoVeiculo;
	
	public Double getPesoCarga() {
		return pesoCarga != null ? pesoCarga : 0D;
	}
	public void setPesoCarga(Double pesoCarga) {
		this.pesoCarga = pesoCarga;
	}
	public Double getDistanciaPavimentada() {
		return distanciaPavimentada != null ? distanciaPavimentada : 0D;
	}
	public void setDistanciaPavimentada(Double distanciaPavimentada) {
		this.distanciaPavimentada = distanciaPavimentada;
	}
	public Double getDistanciaNaoPavimentada() {
		return distanciaNaoPavimentada != null ? distanciaNaoPavimentada : 0D;
	}
	public void setDistanciaNaoPavimentada(Double distanciaNaoPavimentada) {
		this.distanciaNaoPavimentada = distanciaNaoPavimentada;
	}
	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

}
>>>>>>> branch 'master' of https://gitlab.com/edu.braz/sienge.git
