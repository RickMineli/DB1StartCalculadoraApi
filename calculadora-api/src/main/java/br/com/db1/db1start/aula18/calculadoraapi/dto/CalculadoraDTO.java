package br.com.db1.db1start.aula18.calculadoraapi.dto;

import br.com.db1.db1start.aula18.calculadoraapi.model.Operacao;

public class CalculadoraDTO {

	private Operacao operacao;
	
	private Double numeroUm;
	
	private Double numeroDois;

	
	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

	public Double getNumeroUm() {
		return numeroUm;
	}

	public void setNumeroUm(Double numeroUm) {
		this.numeroUm = numeroUm;
	}

	public Double getNumeroDois() {
		return numeroDois;
	}

	public void setNumeroDois(Double numeroDois) {
		this.numeroDois = numeroDois;
	}
	
}
