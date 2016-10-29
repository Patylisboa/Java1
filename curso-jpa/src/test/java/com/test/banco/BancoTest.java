package com.test.banco;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextraing.jpa.EntityManagerUtil;
import com.dextraining.banco.Banco;
import com.dextraining.banco.BancoService;

public class BancoTest {
	@After
	public void close() {
		EntityManagerUtil.Fechar();
	}

	@Test
	public void salvarBancoTeste() {

		BancoService bancoService = new BancoService();

		Banco bancoBradesco = new Banco();
		bancoBradesco.setNome("Bradesco");

		Banco bancoBrasil = new Banco();
		bancoBrasil.setNome("Brasil");

		bancoService.salvar(bancoBradesco);
		bancoService.salvar(bancoBrasil);

		Assert.assertNotNull("Id banco do bradesco nao pode ser null", bancoBradesco.getId());
		Assert.assertNotNull("Id banco do Brasil nao pode ser null", bancoBrasil.getId());

	}

	@Test
	public void buscarPorIdTeste() {

		BancoService bancoService = new BancoService();
		Banco bancoBrasil = new Banco();
		bancoBrasil.setNome("Brasil");

		bancoService.salvar(bancoBrasil);
		Banco banco = bancoService.buscarPorId(-1l);
		Banco bancoEncontrado = bancoService.buscarPorId(bancoBrasil.getId());
		
		Assert.assertNull(banco);
		Assert.assertNotNull(bancoEncontrado);
		Assert.assertEquals(bancoBrasil.getNome(), bancoEncontrado.getNome());
	}
}
