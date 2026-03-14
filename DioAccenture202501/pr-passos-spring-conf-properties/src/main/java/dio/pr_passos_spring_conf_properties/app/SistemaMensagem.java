package dio.pr_passos_spring_conf_properties.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class SistemaMensagem {
	
	
	@Value("${nome}")
	private String nome;
	
	@Value("${email}")
	private String email;
	
	@Value("${telefones}")
	private List<String> telefones;

	

	
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mensagem enviada por:  " + nome + " | " + email + " | "+ telefones.toString());
		System.out.println("Seu cadastro foi aprovado!");
		
	}
	
	

}
