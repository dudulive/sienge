package br.com.sienge.domain.enums;

public enum Rodovia {

	PAVIMENTADA(0.54),
    NAO_PAVIMENTADA(0.62);

    private final double custoKm;

    Rodovia(double custoKm) { 
        this.custoKm = custoKm; 
    }

    public double getCustoKm() { return custoKm; }
	
}
