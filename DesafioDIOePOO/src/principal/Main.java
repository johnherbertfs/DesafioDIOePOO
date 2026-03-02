package principal;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Curso Java", "Descricao do Curso Java", 8);
		Curso curso2 = new Curso("Curso Javascript", "Descricao do Curso Javascript", 4);
		
		Mentoria mentoria = new Mentoria("Mentoria de Java", "Essa e Descricao da Mentoria de Java", LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		

	}

}
