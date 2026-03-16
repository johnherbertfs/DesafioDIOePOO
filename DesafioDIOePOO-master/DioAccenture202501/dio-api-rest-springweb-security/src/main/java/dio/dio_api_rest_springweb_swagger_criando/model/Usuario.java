package dio.dio_api_rest_springweb_swagger_criando.model;




public class Usuario {
	
	

	private Integer id_usuario;
	private String nome;
	private String password;
	private String login;
	
	

	public Usuario() {
		
	}
	
	
	public Usuario(String name, String password, String username) {
		super();
		this.nome = name;
		this.password = password;
		this.login = username;
	}

	
	
	
	
	public Integer getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}


	public String getName() {
		return nome;
	}


	public void setName(String name) {
		this.nome = name;
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return login;
	}

	public void setUsername(String username) {
		this.login = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "UserApp [id_usuario=" + id_usuario + ", nome=" + nome + ", password=" + password + ", login=" + login + "]";
	}
	
	

}
