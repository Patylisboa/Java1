package br.com.dextra.treinamento.model.service.interceptor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogIntercepter {
	
	@PostConstruct
	public void contruct(InvocationContext ctx){
	System.out.println("EJB FOI CRIADO " + ctx.getTarget().getClass().getSimpleName());	
	}
	
	@PreDestroy
	public void destroy(InvocationContext ctx){
		System.out.println("EJB FOI DESTRUIDO " + ctx.getTarget().getClass().getSimpleName());
	}
	
	@PrePassivate 
	public void passivate(InvocationContext ctx){
		System.out.println("EJB FOI PASSIVADO " + ctx.getTarget().getClass().getSimpleName());
	}
	
	@PostActivate
	public void activate(InvocationContext ctx){
		System.out.println("EJB FOI ATIVADO " + ctx.getTarget().getClass().getSimpleName());
	}
	
	@AroundInvoke
	public  Object logar(InvocationContext ctx) throws Exception{
		String classe = ctx.getTarget().getClass().getSimpleName();
		String metodo = ctx.getMethod().getName();
		System.out.println("NOME_DA_CLASSE:" + classe);
		System.out.println("NOME_DO_METODO:" + metodo);
		return ctx.proceed();
	}

}
