package com.registro.alumno.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.alumno.modelo.Usuario;

@Repository

public interface UsuarioRepositorio extends JpaRepository<Usuario,String>{

	public Usuario findByCorreo(String correo);
}
