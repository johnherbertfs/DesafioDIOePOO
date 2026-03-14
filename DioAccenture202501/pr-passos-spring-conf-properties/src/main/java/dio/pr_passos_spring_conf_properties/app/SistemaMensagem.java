package dio.pr_passos_spring_conf_properties.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
	
	
	@Autowired
	private Remetente remetente;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mensagem enviada por:  " + remetente.getNome() + " | " + remetente.getEmail() + " | " + 
							remetente.getTelefones().toString() + " | " + remetente.getEndereco());
		System.out.println("Seu cadastro foi aprovado!");
		
	}
	
	

}
