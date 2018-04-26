package br.com.tqi.manipulacsv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Principal {
	
	private static final String VIRGULA = ",";

	public static void main(String[] args) throws Exception {
		
		int menorIdadeAceitavel = 45;
		
		imprimirConteudoArquivo();
		
		if(validarIdade(menorIdadeAceitavel))
			System.out.println("Idades obedecendo filtro");
		else
			System.out.println("Idades NÃO obedecendo filtro");
		
	}
	
	private static void imprimirConteudoArquivo() throws Exception {
		
		BufferedReader ler = new BufferedReader(new InputStreamReader(new FileInputStream("teste.csv")));
		String linha = null;
		
		while((linha = ler.readLine()) != null) {
			
			String[] dadosUsuario = linha.split(VIRGULA);
			
			System.out.println(Arrays.toString(dadosUsuario));
			
            System.out.println("Nome: " + dadosUsuario[0]);
            System.out.println("Idade: " + dadosUsuario[1]);
            System.out.println("Cargo: " + dadosUsuario[2]);
            System.out.println("--------------------------");
		}
		ler.close();
		
	}
	
	/*
	 * método para validar se possui algum registro com idade menor do que a idade a ser verificada
	 */
	private static boolean validarIdade(int idade) throws Exception {
		
		BufferedReader ler = new BufferedReader(new InputStreamReader(new FileInputStream("teste.csv")));
		String linha = null;
		
		while((linha = ler.readLine()) != null) {
			
			String[] dadosUsuario = linha.split(VIRGULA);
			if(Integer.parseInt(dadosUsuario[1].trim()) < idade) {
				ler.close();
				return false;
			}
			
		}
		ler.close();
		return true;
	}

}
