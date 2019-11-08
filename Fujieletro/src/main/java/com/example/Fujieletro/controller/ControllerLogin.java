package com.example.Fujieletro.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.Fujieletro.model.Usuario;
import com.example.Fujieletro.repository.UsuarioRepository;
import com.example.Fujieletro.service.LoginService;

@Controller
public class ControllerLogin {

	@Autowired
	private LoginService loginService;
	@GetMapping (value = {"/index"})
	public ModelAndView login () {
		ModelAndView mv = new ModelAndView ("index");
		mv.addObject(new Usuario());
		return mv;
	}
	@PostMapping ("/fazerLogin")
	public String fazerLogin (HttpServletRequest request,
			Usuario usuario) {
		if (loginService.logar(usuario)) {
			request.getSession().setAttribute("usuarioLogado",
					usuario);

			return "checkout";
		}
		else {
			return "contact";
		}
		
	}
	
	
	/*@RequestMapping(value="/about", method=RequestMethod.GET)
	public String form(){
		return "about";
	}
	
	@Autowired
	private UsuarioRepository ur;

	@RequestMapping(value="/about", method=RequestMethod.POST)
	public String form(Usuario usuario){

		ur.save(usuario);

		return "redirect:/about";
	}*/
	
}
