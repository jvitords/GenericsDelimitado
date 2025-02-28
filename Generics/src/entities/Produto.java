package entities;

import java.util.List;

public class Produto implements Comparable<Produto>{ 
	// implementando a interface p/ fazer um contrato e ser obrigatório usar o "CompareTo" da class  "Comparable", que será do tipo "Produto", como especificado.

	private String nome;
	private Double valor;
	
	public Produto(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return nome + ", R$" + valor;
	}
	
	@Override
	public int compareTo(Produto itemASerComparado) { // a subclass "ServicoMaximo" está puxando esse método. E esse método é uma sobrescrita do "Comparable"
		return valor.compareTo(itemASerComparado.getValor());
	}
}
