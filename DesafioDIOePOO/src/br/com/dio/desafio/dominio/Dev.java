package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<Conteudo>();
	
	
	
	public void inscreverBootcamp(Bootcamp c) {
		
		this.conteudosInscritos.addAll(c.getConteudos());
		c.getDevInscritos().add(this);
		
	}
	
	
	public void progredir() {
		
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		
		if ( conteudo.isPresent() ) { 
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}
		else {
			System.err.println("Voce ainda nao esta matriculado/inscrito em conteudo algum!");
		}
		
	}
	
	
	public double calcularXP() {
		
		return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
		
		
	}

	
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Set<Conteudo> getConteudoInscritos() {
		return conteudosInscritos;
	}


	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudosInscritos = conteudoInscritos;
	}


	public Set<Conteudo> getConteudoConcluidos() {
		return conteudosConcluidos;
	}


	public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
		this.conteudosConcluidos = conteudoConcluidos;
	}


	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
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
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	

}
