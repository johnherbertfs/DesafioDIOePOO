package dio.dio_pr_passos_spring_data_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dio.dio_pr_passos_spring_data_jpa.model.UserApp;



public interface UserRepository extends JpaRepository<UserApp, Integer> {
	
	
	@Query("SELECT u FROM UserApp u WHERE u.name LIKE %:name%")
	List<UserApp> filtrarPorNome(@Param("name") String name);
	

	

}
