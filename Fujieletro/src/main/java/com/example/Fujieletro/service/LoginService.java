package com.example.Fujieletro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Fujieletro.model.Usuario;
import com.example.Fujieletro.repository.UsuarioRepository;

@Service
public class LoginService {

	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar (Usuario usuario) {
		return usuarioRepo.findOneByEmailAndSenha(usuario.getEmail(),
				usuario.getSenha()) != null;
	}

	
}
