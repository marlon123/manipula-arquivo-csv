package br.com.tqi.test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import br.com.tqi.manipulacsv.VerificaArquivoComNio;

public class ValidaCampoIdadeArquivoTest {
	
	@Test
	public void validarCampoIdade() throws IOException {
		Assert.assertTrue(VerificaArquivoComNio.validarIdadeLimite());
	}

}
