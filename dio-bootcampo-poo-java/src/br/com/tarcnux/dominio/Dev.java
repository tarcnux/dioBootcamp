package br.com.tarcnux.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	/*
	 * É possivel criar uma coleção de Mentorias e Cursos utilizando Conteúdo
	 * LinkedHashSet garante a ordem de cadastro 
	 */
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	
	/**
	 * Ao se inscrever no Bootcamp já terá Conteúdos Inscritos	 * 
	 * @param bootcamp
	 */
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		//Increvendo o Dev no bootcamp
		bootcamp.getDevsInscritos().add(this);
	}
	
	/**
	 * A medida que progredir, terá conteúdos concluídos
	 */
	public void progredir() {
		//Pega o primeiro conteúdo - independente se é curso ou mentoria
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		} else {
			//Se não tiver mais conteúdo para progredir
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
	}
	
	public Double calcularTotalXp() {		
		return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
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
