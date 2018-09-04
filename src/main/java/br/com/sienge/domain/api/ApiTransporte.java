<<<<<<< HEAD
package br.com.sienge.domain.api;

import org.springframework.util.StringUtils;

public class ApiTransporte {

	 private String pesoCarga;    
	 private String distanciaPavimentada;
	 private String distanciaNaoPavimentada;
	 private String tipoVeiculo;
	 
	public String getPesoCarga() {
		return StringUtils.isEmpty(pesoCarga) ? "0" : pesoCarga;
	}
	public void setPesoCarga(String pesoCarga) {
		this.pesoCarga = pesoCarga;
	}
	public String getDistanciaPavimentada() {
		return StringUtils.isEmpty(distanciaPavimentada) ? "0" : distanciaPavimentada;
	}
	public void setDistanciaPavimentada(String distanciaPavimentada) {
		this.distanciaPavimentada = distanciaPavimentada;
	}
	public String getDistanciaNaoPavimentada() {
		return StringUtils.isEmpty(distanciaNaoPavimentada) ? "0" : distanciaNaoPavimentada;
	}
	public void setDistanciaNaoPavimentada(String distanciaNaoPavimentada) {
		this.distanciaNaoPavimentada = distanciaNaoPavimentada;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
}
=======
package br.com.sienge.domain.api;

public class ApiTransporte {

	 private String pesoCarga;    
	 private String distanciaPavimentada;
	 private String distanciaNaoPavimentada;
	 private String tipoVeiculo;
	 
	public String getPesoCarga() {
		return pesoCarga;
	}
	public void setPesoCarga(String pesoCarga) {
		this.pesoCarga = pesoCarga;
	}
	public String getDistanciaPavimentada() {
		return distanciaPavimentada;
	}
	public void setDistanciaPavimentada(String distanciaPavimentada) {
		this.distanciaPavimentada = distanciaPavimentada;
	}
	public String getDistanciaNaoPavimentada() {
		return distanciaNaoPavimentada;
	}
	public void setDistanciaNaoPavimentada(String distanciaNaoPavimentada) {
		this.distanciaNaoPavimentada = distanciaNaoPavimentada;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	 
	 
	
}
>>>>>>> branch 'master' of https://gitlab.com/edu.braz/sienge.git
