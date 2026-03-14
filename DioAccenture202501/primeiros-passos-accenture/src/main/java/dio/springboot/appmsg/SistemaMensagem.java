package dio.springboot.appmsg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
	
	// as anotacoes @Autowired informam que sera necessario [injentar dependencia de classe] usar a classe Remetente
	// e dentro do contexto do projeto o springboot vai localizar e carregar a classe
	
	@Autowired
	private Remetente noreply;
	@Autowired
	private Remetente techTeam;
	
	
	
	
	public void enviarConfirmacaoCadastro() {
		
		System.out.println(noreply);
		System.out.println("Seu cadastro foi aprovado");

	}
	
	
	public void enviarMensagemBoasVindas() {
		
		techTeam.setEmail("tech@dio.com.br");
		System.out.println(techTeam);
		System.out.println("Bem vindo a Tech!");
	}
	
	

}
