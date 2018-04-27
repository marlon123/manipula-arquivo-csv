package br.com.tqi.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.tqi.manipulacsv.VerificaArquivo;

public class ValidaCampoNomeArqivoTest {
	
	@Test
	public void validarCampoNome() throws Exception {
		Assert.assertTrue(VerificaArquivo.validarQtdCaracteresNome());
	}

}
