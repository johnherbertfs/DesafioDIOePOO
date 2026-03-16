package dio.dio_api_rest_springweb_swagger_criando.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.dio_api_rest_springweb_swagger_criando.model.Usuario;
import dio.dio_api_rest_springweb_swagger_criando.repository.UsuarioRepository;




@RestController
@RequestMapping("/dio")
public class UsuarioController {
	
	
	@Autowired
	private UsuarioRepository usuario_repository;
	
	
	
	@GetMapping("/getusuarios")
	//@PreAuthorize("hasAnyRole('manager', 'user')")
	public List<Usuario> getUsuarios() {
		
		return usuario_repository.findAll();
		
	}
	
	
	
	
	@GetMapping("/getusuario/{login}")
	public Usuario getUsuario(@PathVariable("login") String login) {
		
		return usuario_repository.findByLogin(login);
		
	}
	

	
	
	@DeleteMapping("/delusuarioid/{id}")
	public void delUsuarioId(@PathVariable("id") Integer id) {
		
		usuario_repository.deleteById(id);
		
	}
	
	
	
	
	@PostMapping("/salvarusuario")
	public void salvarUsuarioId(@RequestBody Usuario usuario) {
		
		usuario_repository.save(usuario);
		
	}
	
	
	
	

}
