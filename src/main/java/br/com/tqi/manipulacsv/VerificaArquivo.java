package br.com.tqi.manipulacsv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class VerificaArquivo {
	
	private VerificaArquivo() {}
	
	public static boolean validarQtdCaracteresNome() throws Exception {
		
		BufferedReader ler = new BufferedReader(new InputStreamReader(new FileInputStream("teste.csv")));
		String linha = null;
		boolean nomeValido = true;
		
		while((linha = ler.readLine()) != null) {

			String[] dadosUsuario = linha.split(",");
			
			if(dadosUsuario[0].length() < 3) {
				nomeValido = false;
				break;
			}
		}
		ler.close();
		
		return nomeValido;
	}

}
