package gerador.senha;

import java.util.List;

public class GeradorSenha {
	
	private List<String> senhaPadrao;
	private List <String> senhaIdoso;
	
	int contID = 0;
	int contP = 0 ;
	
	
	
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
