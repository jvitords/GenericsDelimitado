package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import serivces.ServicoMaximo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	
		try (BufferedReader leitor = new BufferedReader(new FileReader("C:\\Users\\JoãoVitorDuarteSanto\\Documents\\Estudos\\Generics\\Generics\\ProdutosRegistrados.txt"))){
			
			List<Produto> listaDeProdutos = new ArrayList<Produto>();
					
			String lerLinhas = leitor.readLine();
			
			while (lerLinhas != null) {
				
				String [] separador = lerLinhas.split(",");
				listaDeProdutos.add(new Produto(separador[0], Double.parseDouble(separador[1])));
				lerLinhas = leitor.readLine();
			}
			
			Produto maximoProduto = ServicoMaximo.calclularMaxima(listaDeProdutos); // como o método "calcularMaxima" é static, não preciso inicializar a class
			System.out.println(maximoProduto);
		} 
		catch (Exception e) {
			System.out.println("Falha ao ler arquivo!");
		}
	}

}
