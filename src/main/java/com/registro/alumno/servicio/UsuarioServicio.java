package com.registro.alumno.servicio;

import com.registro.alumno.dto.UsuarioRegistroDTO;
import com.registro.alumno.modelo.Usuario;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;
public interface UsuarioServicio extends UserDetailsService{
	
	public Usuario guardar(UsuarioRegistroDTO registroDTO) ;
		
	public List<Usuario> listarUsuarios();
}
