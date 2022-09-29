package com.listaum.listaum.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem")

public class ObjetivosController {
	@GetMapping
	public String OlaMundo() {
		return " <h4>Objetivo:</h4>"
				+ "Meu objetivo de aprendizagem é abordar mais o trbalho em equipe,orientação ao detalhe, e orientação futura.";
	}
}
