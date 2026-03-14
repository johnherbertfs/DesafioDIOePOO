package DIO.dio_pr_passos_app_proper_value.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {

	
	/*
	private String nome = "Joao de Barro";
	private String email = "barro.joao@teste.com";
	private List<String> telefones = new ArrayList<>(Arrays.asList("84988343232", "84988297129"));
	//private List<Integer> telefones2 = new ArrayList<>(Arrays.asList(new Integer[]{84988343232}));
	///
	 */
	
	
	@Value("${nome}")
	private String nome;
	
	@Value("${email}")
	private String email;
	
	@Value("${telefones}")
	private List<String> telefones;

	

	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mensagem enviada por:  " + nome + " | " + email + " | "+ telefones.toString());
		System.out.println("Seu cadastro foi aprovado!");
		
	}
	
	
	
	
	

}
