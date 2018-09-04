package br.com.sienge.domain.enums;

public enum TipoVeiculo {
    CAMINHAO_BAU(1), 
    CAMINHAO_CACAMBA(1.05), 
    CARRETA(1.12);

    private final double fatorMultiplicador;

    TipoVeiculo(double fatorMultiplicador) { 
        this.fatorMultiplicador = fatorMultiplicador; 
    }

    public double getFatorMultiplicador() { return fatorMultiplicador; }
}
