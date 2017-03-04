package br.com.dextra.treinamento.model.service.sessionbean;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import br.com.dextra.treinamento.model.service.interceptor.LogIntercepter;

@Stateless
@Interceptors(value = LogIntercepter.class)
public class TestarStatelessImp implements TestarStatelessLocal{
	
	Integer contador = 8;
	
	@Override
	public Integer adicionar() {
		contador++;
		return contador;
	}

}
