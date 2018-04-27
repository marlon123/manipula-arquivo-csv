package br.com.tqi.manipulacsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VerificaArquivoComNio {

	public static void main(String[] args) throws IOException {
		Path caminho = Paths.get("teste.csv");
		
		boolean possuiIdadeAbaixoDe30 = Files.lines(caminho)
			.map(s -> s.replaceAll("\\D", "")) // parser
			.map(i -> Integer.valueOf(i)) // conversao
			.filter(i -> i < 14) // aplica a logica
			.findAny().isPresent(); // procura se encontrou alguem
		 
		
		System.out.println(possuiIdadeAbaixoDe30);
		
	}

}
