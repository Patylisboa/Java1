package br.com.dextra.treinamento.model.service.transaction;

import javax.ejb.EJB;
import javax.ejb.Stateless;
@Stateless
public class ClienteTransacaoImpl implements ClienteTransacoesLocal{
	
	@EJB
	private TestarTransacoes testarTransacoes;

	@Override
	public void testarRequired() {
		testarTransacoes.criarPostRequired("titulo required");
		testarTransacoes.criarPostRequired(null);
	}

	@Override
	public void testarRequiresNew() {
		testarTransacoes.criarPostRequiresNew("titulo requires new");
		testarTransacoes.criarPostRequiresNew(null);
		
	}

}
