package dio.springboot.appmsg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


// uma convencao para nao colocar um anotacao @Bean em varios lugares quando for necessario usar uma classe
// pode ser convencionar criar uma classe chamada Beans e colocar os 'news' de cada classe do projeto
// a anotacao @Configuration foi necessaria pois sem ela o springboot nao inicializa

@Configuration
public class Beans {
	
	@Bean
	@Scope("prototype") 
	// sem o scope prototype apenas um objeto "Remetente sera criado e compartilhado
	// com scope prototype cada vez que for necessario um Remetente um novo objeto Remetente sera criado
	public Remetente remetente() {
		System.out.println("||| [[[ criando um novo objeto Remetente ]]] |||");
		Remetente remetente = new Remetente("Digital Innovation One", "noreply@dio.com.br");
		return remetente;
	}
	

}
