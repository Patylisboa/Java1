package com.dextrainning.filmes;

import javax.persistence.Entity;

import com.dextrainning.infra.jpa.Entidade;

@Entity
public class Categoria extends Entidade {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
