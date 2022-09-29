package com.listaum.listaum.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class OlaMundoController {

	@GetMapping
	public String OlaMundo() {
		return "Olá Mundo, sou a Carol!";
	}


}

