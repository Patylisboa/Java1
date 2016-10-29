package com.test.pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextraing.jpa.EntityManagerUtil;
import com.dextraining.exercicio1.Pessoa;
import com.dextraining.exercicio1.PessoaService;

public class PessoaServiceTest {

	@After
	public void close() {
		EntityManagerUtil.Fechar();
	}

	@Test
	public void salvarPessoaTeste() throws ParseException {

		PessoaService pessoaService = new PessoaService();

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Patricia");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		pessoa.setDataNascimento(dateFormat.parse("16/03/1989"));
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Caroline");
		pessoa2.setDataNascimento(dateFormat.parse("16/03/1989"));
		
		pessoaService.salvar(pessoa);
		pessoaService.salvar(pessoa2);

		Assert.assertNotNull("Pessoa1 não pode ser null", pessoa.getId());
		Assert.assertNotNull("Pessoa2 não pode ser null", pessoa2.getId());
	}

	@Test
	public void buscarPorIdTeste() throws ParseException {
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");

		PessoaService pessoaService = new PessoaService();
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Patricia");
		pessoa1.setDataNascimento(dateFormat1.parse("12/06/2003"));

		pessoaService.salvar(pessoa1);
		Pessoa pessoa = pessoaService.buscarPorId(-1l);
		Pessoa pessoaEncontrada = pessoaService.buscarPorId(pessoa1.getId());
		
		Assert.assertNull(pessoa);
		Assert.assertNotNull(pessoaEncontrada);
		Assert.assertEquals(pessoa1.getNome(), pessoaEncontrada.getNome());
	}
	
	@Test
	public void buscarTodosTest(){
		PessoaService pessoaService = new PessoaService();
		Pessoa pessoa  = new Pessoa();
		pessoa.setDataNascimento(new Date());
		pessoa.setNome("Patricia");
		pessoaService.salvar(pessoa);
		
		List<Pessoa>pessoas = pessoaService.buscarTodos();
		Assert.assertEquals(1,pessoas.size());
		
	}
}


