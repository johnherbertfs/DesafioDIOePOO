package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.springboot.appmsg.SistemaMensagem;

@SpringBootApplication
public class PrimeirosPassosAccentureApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosAccentureApplication.class, args);
		
		/*Calculadora c = new Calculadora();
		System.out.println(c.somar(1, 0));
		*/
		
		
	}
	
	
	// o metodo run do tipo da interface CommandLineRunner seria nosso 'main' em caso de execucao normal do java
	@Bean
	public CommandLineRunner run(SistemaMensagem mensagem) throws Exception {
		
		return args -> {
			mensagem.enviarConfirmacaoCadastro();
			mensagem.enviarMensagemBoasVindas();
			mensagem.enviarConfirmacaoCadastro();
		};
		
	}
	

}
