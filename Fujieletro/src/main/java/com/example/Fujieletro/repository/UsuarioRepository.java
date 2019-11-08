package com.example.Fujieletro.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Fujieletro.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

	public Usuario findOneByEmailAndSenha (String email, String senha);

}
