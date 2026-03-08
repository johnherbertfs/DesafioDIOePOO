package principal;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		// criando cursos
		Curso curso1 = new Curso("Curso Java", "Descricao do Curso Java", 8);
		Curso curso2 = new Curso("Curso Javascript", "Descricao do Curso Javascript", 4);
		
		// criando mentorias
		Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Essa e Descricao da Mentoria de Java", LocalDate.now());
		
		// testando os objetos
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		
		
		// criando bootcamp
		Bootcamp bc = new Bootcamp("Bootcamp Java Developer", "Bootcamp otimo para carreiras backend e fullstack");
		bc.getConteudos().add(curso1);
		bc.getConteudos().add(curso2);
		bc.getConteudos().add(mentoria1);
		
		
		// criando os Devs e incricao
		Dev dev1 = new Dev("John H");
		dev1.inscreverBootcamp(bc);
		dev1.progredir();
		dev1.progredir();
		Dev dev2 = new Dev("Adelson L");
		dev2.inscreverBootcamp(bc);
		dev2.progredir();
		
		
		
		System.out.println("John bootcamp conteudos inscritos: " + dev1.getConteudoInscritos());
		System.out.println("John bootcamp conteudos concluidos: " + dev1.getConteudoConcluidos());
		System.out.println("John XP: " + dev1.calcularXP());
		
		System.out.println("Adelson bootcamp conteudos inscritos: " + dev2.getConteudoInscritos());
		System.out.println("Adelson bootcamp conteudos concluidos: " + dev2.getConteudoConcluidos());
		System.out.println("Adelson XP: " + dev2.calcularXP());

	}

}
