package br.com.tqi.suitetest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.tqi.test.ValidaCampoIdadeArquivoTest;
import br.com.tqi.test.ValidaCampoNomeArqivoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ValidaCampoIdadeArquivoTest.class,
	ValidaCampoNomeArqivoTest.class
})
public class SuiteTestValidacaoCsv {

}
