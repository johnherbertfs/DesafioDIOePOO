package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	
	
	private String nome;
	private Set<Conteudo> conteudoInscritos = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<Conteudo>();
	
	
	
	public void inscreverBootcamp() {
		
	}
	
	
	public void progredir() {
		
		
	}
	
	
	public void calcularXP() {
		
		
	}

	
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}


	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}


	public Set<Conteudo> getConteudoConcluidos() {
		return conteudoConcluidos;
	}


	public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
		this.conteudoConcluidos = conteudoConcluidos;
	}


	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluidos, conteudoInscritos, nome);
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
		return Objects.equals(conteudoConcluidos, other.conteudoConcluidos)
				&& Objects.equals(conteudoInscritos, other.conteudoInscritos) && Objects.equals(nome, other.nome);
	}
	
	

}
