package dio.dio_api_rest_springweb_swagger_criando.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.dio_api_rest_springweb_swagger_criando.handler.BusinessException;
import dio.dio_api_rest_springweb_swagger_criando.model.Usuario;



@Repository
public class UsuarioRepository {
	
	
	
	
	public void save(Usuario usuario) {
		
		if (usuario.getUsername() == null) {
			throw new BusinessException("Campo login ou username e necessario!!!!!!!!!!!!");
		}
		
		if( usuario.getId_usuario() == null ) {
			System.out.println("SAVE - Recebendo usuario no repositorio de dados!");
		}
		else {
			System.out.println("UPDATE - Recebendo usuario no repositorio de dados!");
		}
		
		System.out.println(usuario.toString());
		
	}
	
	
	
	
	public void deleteById(Integer id) {
		
		System.out.println("DELETE - Recebendo Id = " + id + " para excluir um usuario no repositorio de dados!");
		
	}
	
	
	
	
	public List<Usuario> findAll() {
		
		System.out.println("LIST - Listando usuarios do sistema que estao no repositorio de dados!");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("Gleyson Silva", "senha", "gleyson"));
		usuarios.add(new Usuario("Frank Roosevelt", "senhas", "roo"));
		
		return usuarios;
		
	}
	
	
	
	
	public Usuario findById(Integer id) {
		
		System.out.println("FIND - Recebendo Id = " + id + " para localizar um usuario no repositorio de dados!");
		
		return new Usuario("Gleyson Silva", "senha", "gleyson");
		
	}
	
	
	
	
	public Usuario findByLogin(String login) {
		
		System.out.println("FIND - Recebendo login = " + login + " para localizar um usuario no repositorio de dados!");
		
		return new Usuario("Gleyson Silva", "senha", "gleyson");
		
	}
	
	
	
	
	
	

}
