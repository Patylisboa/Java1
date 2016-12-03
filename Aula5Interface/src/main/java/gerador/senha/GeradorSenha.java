package gerador.senha;

import java.util.ArrayList;
import java.util.List;

public class GeradorSenha {
	
	private List<Integer> senhaPadrao;
	private List <Integer> senhaIdoso;
	
	private int contID ;
    private	int contP  ;
    
    public GeradorSenha(){
    	this.senhaIdoso = new ArrayList<>();
    	this.senhaPadrao = new ArrayList<>();
    	
    }
	
	
	
	public String gerarSenhaPadrao(){
		contP++;
		senhaPadrao.add("P"+contP);
		return "P"+contP;
	}
	
	public String gerarSenhaIdoso(){
		contID++;
		senhaIdoso.add("I"+contID);
		return "I"+contID ;
	}
	 public String proximaSenha(){
		 if (!senhaIdoso.isEmpty()){
			 return senhaIdoso.remove(0);
			 }
		return null;
		 
	 }
	 public String proximaSenhaPad(){
		 if (!senhaPadrao.isEmpty()){
			 return senhaPadrao.remove(0);
			 }
		return null;
		 
	 }	

}
