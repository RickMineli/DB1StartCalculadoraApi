package br.com.db1.db1start.aula18.calculadoraapi.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.db1.db1start.aula18.calculadoraapi.model.Calculadora;
import br.com.db1.db1start.aula18.calculadoraapi.model.Operacao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadoraRepositoryTest {
	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	@After
	public void after() {
		calculadoraRepository.deleteAll();
	}

	@Test
	public void deveSalvarUmaOperacao() {
		Calculadora calculadora = new Calculadora(50d,2d);
		calculadora.setOperacao(Operacao.DIVISAO);
		calculadora.setResultado(calculadora.executaOperacao(Operacao.DIVISAO));
		calculadora.setDataOperacao(LocalDateTime.now());
		calculadoraRepository.save(calculadora);
		List<Calculadora> calculadoras = calculadoraRepository.findAll();
		Assert.assertEquals(calculadora.getResultado(), calculadoras.get(0).getResultado());
	}
	
}
