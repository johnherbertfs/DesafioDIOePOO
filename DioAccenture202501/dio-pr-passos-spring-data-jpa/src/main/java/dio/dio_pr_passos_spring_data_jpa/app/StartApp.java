package dio.dio_pr_passos_spring_data_jpa.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.dio_pr_passos_spring_data_jpa.model.UserApp;
import dio.dio_pr_passos_spring_data_jpa.repository.UserRepository;



@Component
public class StartApp implements CommandLineRunner { // sera nosso main
	
	
	
	@Autowired
	private UserRepository repository;
	
	
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("|||||||||||||||||||||||||||||  AULA PRIMEIROS PASSOS SPRING: SPRING DATA JPA  |||||||||||||||||||||||||||||");
		
		UserApp userApp = new UserApp("Johnathan Herbert", "senha23", "nathan.herbert");
		
		// salvar usuario
		repository.save(userApp);
		
		
		// recuperar todos os usuarios salvos
		System.out.println("Mostrando todos os Users cadastrados no banco:");
		for (UserApp user_tmp : repository.findAll()) {
			System.out.println(user_tmp.toString());
		}
		
		
		
		System.out.println("Mostrando todos os Users que tem no nome 'Joao': ");
		List<UserApp> usersComJoao = repository.filtrarPorNome("Joao");
		for (UserApp user_tmp : usersComJoao) {
			System.out.println(user_tmp.toString());
		}
		

	}

	
	
}
