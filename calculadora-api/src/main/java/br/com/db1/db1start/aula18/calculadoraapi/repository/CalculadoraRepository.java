package br.com.db1.db1start.aula18.calculadoraapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1.db1start.aula18.calculadoraapi.model.Calculadora;

public interface CalculadoraRepository extends JpaRepository<Calculadora, Long> {

}
