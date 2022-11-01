package com.example.register.controller;



import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.register.dao.RegisterRepository;
import com.example.register.model.RegisterPage;
@RestController
public class RegisterController {

	@Autowired
	RegisterRepository registerepo;	
	@PostMapping("Stand")
	public String Page(@RequestBody RegisterPage regipage)
	{
		registerepo.save(regipage);
		return "saved";		
	}
}

	
//	}
//	@GetMapping("/getregi")
//	public List<RegisterPage> getbus(){
//		return registerrepo.findAll();
//		
//	}
//	
		
	



