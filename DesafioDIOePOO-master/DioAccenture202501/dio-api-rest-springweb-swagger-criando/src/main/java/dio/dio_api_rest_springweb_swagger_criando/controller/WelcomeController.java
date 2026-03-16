package dio.dio_api_rest_springweb_swagger_criando.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	// somente o @getmapping deixa a API sem rota/URL/URI
	// fica uma rota padrao ao acessar o servidor web localhost:8080
	// se existir um outro @getmapping tambem existira um confilto de BEANS no contexto do spring
	@GetMapping // sera o nosso padrao
	public String welcome() {
		
		return "Welcome to my Spring Boot API Rest!";
		
	}
	
	
	
	
	

}
