package dio.dio_pr_passos_spring_data_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class UserApp {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Integer id;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 50, nullable = false)
	private String password;
	
	@Column(name = "user_name", length = 50, nullable = false)
	private String username;
	
	

	public UserApp() {
		
	}
	
	
	public UserApp(String name, String password, String username) {
		super();
		this.name = name;
		this.password = password;
		this.username = username;
	}

	
	
	
	public String getNome() {
		return name;
	}
	
	public void setNome(String nome) {
		this.name = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "UserApp [id=" + id + ", name=" + name + ", password=" + password + ", username=" + username + "]";
	}
	
	
	

}
