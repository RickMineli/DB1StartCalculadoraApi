package br.com.db1.db1start.aula18.calculadoraapi.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.db1start.aula18.calculadoraapi.model.Calculadora;
import br.com.db1.db1start.aula18.calculadoraapi.model.Operacao;
import br.com.db1.db1start.aula18.calculadoraapi.repository.CalculadoraRepository;

@Service
public class CalculadoraService {
	@Autowired
	private CalculadoraRepository calculadoraRepository;

	public Calculadora salvarOperacao(Double numeroUm, Double numeroDois, Operacao operacao) {
		Calculadora calculadora = new Calculadora(numeroUm, numeroDois);
		calculadora.setOperacao(operacao);
		calculadora.setResultado(calculadora.executaOperacao(operacao));
		calculadora.setDataOperacao(LocalDateTime.now());
		calculadoraRepository.save(calculadora);
		return calculadora;
	}
	
	public List<Calculadora> buscarTodasCalculadoras (){
		return calculadoraRepository.findAll();
	}

}
