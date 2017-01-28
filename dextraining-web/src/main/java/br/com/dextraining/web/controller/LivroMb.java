package br.com.dextraining.web.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.dextraining.domain.Livro;
import br.com.dextraining.domain.LivroService;
import br.com.dextraining.domain.Usuario;
import br.com.dextraining.domain.UsuarioService;

@ManagedBean(name = "livroMB")
@SessionScoped
public class LivroMb implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Livro> livros;

	private Livro livro;

	

	public String salvar() {
		LivroService.salvar(livro);
		FacesUtils.createSuccessMessage("Usuario cadastrado com Sucesso!");
		return "listagem?faces-redirect=true";
	}

	public String irParaNovoLivro() {
		this.livro = new Livro();
		return "cadastroAutor?faces-redirect=true";
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}

	
	
