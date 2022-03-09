package br.com.tarcnux.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
	
	private String nome;
	/*
	 * � possivel criar uma cole��o de Mentorias e Cursos utilizando Conte�do
	 * LinkedHashSet garante a ordem de cadastro 
	 */
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	
	/**
	 * Ao se inscrever no Bootcamp j� ter� Conte�dos Inscritos	 * 
	 * @param bootcamp
	 */
	public void inscreverBootcamp(Bootcamp bootcamp) {
		
	}
	
	/**
	 * A medida que progredir, ter� conte�dos conclu�dos
	 */
	public void progredir() {
		
	}
	
	public void calcularTotalXp() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
		result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		if (conteudosConcluidos == null) {
			if (other.conteudosConcluidos != null)
				return false;
		} else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
			return false;
		if (conteudosInscritos == null) {
			if (other.conteudosInscritos != null)
				return false;
		} else if (!conteudosInscritos.equals(other.conteudosInscritos))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	

}
