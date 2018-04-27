package br.com.tqi.manipulacsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VerificaArquivoComNio {

	public static boolean validarIdadeLimite() throws IOException {
		Path caminho = Paths.get("teste.csv");
		
		boolean possuiIdadeAbaixoDe30 = Files.lines(caminho)
			.map(s -> s.replaceAll("\\D", "")) // parser (converte o que não for número em "")
			.map(i -> Integer.valueOf(i)) // conversao (converte o que sobrou em inteiro)
			.filter(i -> i < 30) // aplica a logica
			.findAny().isPresent(); // procura se encontrou alguem
		 
		System.out.println(possuiIdadeAbaixoDe30);
		
		return possuiIdadeAbaixoDe30;
		
	}
	
	public static boolean validarTituloIgualDefinido() throws IOException {
		Path caminho = Paths.get("teste.csv");
		
		boolean tituloEstaIgual = Files.lines(caminho)
			.map(s -> s.replaceAll("\\D", "")) // parser (converte o que não for número em "")
			.map(i -> Integer.valueOf(i)) // conversao (converte o que sobrou em inteiro)
			.filter(i -> i < 30) // aplica a logica
			.findAny().isPresent(); // procura se encontrou alguem
		 
		System.out.println(tituloEstaIgual);
		
		return tituloEstaIgual;
		
	}

}
