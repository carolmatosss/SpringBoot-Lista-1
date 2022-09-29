package com.listaum.listaum.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsmgen")

public class bsmController {@GetMapping
	public String bsmGen() {
	return "A lista de BSM's da Generation Brasil é:"
			+ "<br><li> Identificar Ferramentas;"
			+ "<br><li> Identificar os recursos;"
			+ "<br><li> Fazer escolhas de acordo com seus interesses;"
			+ "<br><li> Aplicar o que voê aprende;"
			+ "<br><li>Continuar aprendendo";
}





}
