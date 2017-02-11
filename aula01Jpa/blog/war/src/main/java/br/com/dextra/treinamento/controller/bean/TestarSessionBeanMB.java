package br.com.dextra.treinamento.controller.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.dextra.treinamento.model.service.sessionbean.TestarStatefulLocal;
import br.com.dextra.treinamento.model.service.sessionbean.TestarStatelessLocal;

@ManagedBean(name = "testarSessionBeanMB")
@RequestScoped
public class TestarSessionBeanMB {
	
//Testando stateless locaal
	
	public void testarStateless(){
		try {
			
			List<Integer> lista = new ArrayList<Integer>();
			InitialContext ctx = new InitialContext();
			TestarStatelessLocal local = (TestarStatelessLocal) ctx.lookup("blog/TestarStatelessImp/local");
			lista.add(local.adicionar());
			local = (TestarStatelessLocal) ctx.lookup("blog/TestarStatelessImp/local");
			lista.add(local.adicionar());
			System.out.println("Resultado Stateless: " + lista.toString());
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

//Testando o stateful local	
	
	public void testarStateful(){

		try {
			
			List<Integer> lista = new ArrayList<Integer>();
			InitialContext ctx = new InitialContext();
			TestarStatefulLocal local = (TestarStatefulLocal) ctx.lookup("blog/TestarStatefulImp/local");
			lista.add(local.adicionar());
			local = (TestarStatefulLocal) ctx.lookup("blog/TestarStatefulImp/local");
			lista.add(local.adicionar());
			System.out.println("Resultado Stateful: " + lista.toString());
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	
	}
}
