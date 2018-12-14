package br.com.db1.db1start.aula18.calculadoraapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Calculadora")
public class Calculadora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numeroUm", nullable=false)
	private Double numeroUm;

	@Column(name = "numeroDois", nullable=false)
	private Double numeroDois;

	@Column(name = "resultado", nullable=false)
	private Double resultado;

	@Column(name = "dataOperacao", nullable=false)
	private LocalDateTime dataOperacao;

	@Enumerated(EnumType.STRING)
	@Column(name = "operacao", nullable=false)
	private Operacao operacao;
	
	protected Calculadora() {
		
	}
	
	public Calculadora(Double numeroUm, Double numeroDois) {
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
	}

	public Double executaOperacao(Operacao operacao) {
		return operacao.executorDeOperacoes(this.numeroUm, this.numeroDois);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public LocalDateTime getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(LocalDateTime dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}
	
	
	
}
