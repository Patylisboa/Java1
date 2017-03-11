package br.com.dextra.treinamento.model.service.transaction;

import javax.ejb.Local;

@Local
public interface TestarTransacoes {
	
	void criarPostRequired(String titulo);
	
	void criarPostRequiresNew(String titulo); 

}
