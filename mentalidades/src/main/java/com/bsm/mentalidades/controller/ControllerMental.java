package com.bsm.mentalidades.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMental {
	@GetMapping("/")
	
	public String mentalidade() {
		return "Mentalidades Utilizadas: orientação ao futuro, mentalidade de crescimento e"
				+ " persistência além da habilidade de atenção aos detalhes!";
		}

}
