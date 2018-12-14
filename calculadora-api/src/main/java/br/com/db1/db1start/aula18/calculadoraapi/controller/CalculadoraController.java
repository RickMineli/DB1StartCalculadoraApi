package br.com.db1.db1start.aula18.calculadoraapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.db1start.aula18.calculadoraapi.dto.CalculadoraDTO;
import br.com.db1.db1start.aula18.calculadoraapi.model.Calculadora;
import br.com.db1.db1start.aula18.calculadoraapi.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@Autowired
	private CalculadoraService calculadoraService;

	@PostMapping
	public Calculadora salvaOperacao(@RequestBody CalculadoraDTO calculadora) {
		return calculadoraService.salvarOperacao(calculadora.getNumeroUm(), calculadora.getNumeroDois(),
				calculadora.getOperacao());
	}
	
	@GetMapping
	public List<Calculadora> todasCalculadoras(){
		return calculadoraService.buscarTodasCalculadoras();
	}
}
