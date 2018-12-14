package br.com.db1.db1start.aula18.calculadoraapi.model;

public enum Operacao {
	SOMA {
		@Override
		public Double executorDeOperacoes(Double numeroUm, Double numeroDois) {
			return numeroUm + numeroDois;
		}
	},
	SUBTRACAO {
		@Override
		public Double executorDeOperacoes(Double numeroUm, Double numeroDois) {
			return numeroUm - numeroDois;
		}
	},
	DIVISAO {
		@Override
		public Double executorDeOperacoes(Double numeroUm, Double numeroDois) {
			return numeroUm / numeroDois;
		}
	},
	MULTIPLICACAO {
		@Override
		public Double executorDeOperacoes(Double numeroUm, Double numeroDois) {
			return numeroUm * numeroDois;
		}
	};
	public abstract Double executorDeOperacoes(Double numeroUm, Double numeroDois);
}
