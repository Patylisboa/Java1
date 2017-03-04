package br.com.dextra.treinamento.model.service.sessionbean;

import javax.ejb.Stateful;
import javax.interceptor.Interceptors;

import br.com.dextra.treinamento.model.service.interceptor.LogIntercepter;

@Stateful
@Interceptors(value = LogIntercepter.class)
public class TestarStatefulImp implements TestarStatefulLocal {
	
	Integer contador=0;

	@Override
	public Integer adicionar() {
		contador++;
		return contador;
	}
	
	
}
