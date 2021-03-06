package atividade2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivosAprendizagemController {

	@GetMapping
	public String objetivo(String titulo, String fundo, String subtitulo, String resposta) {

		// fundo = "<div style= background: black; width: 100%; height: 100%; /div> "; --não estou conseguindo alterar a cor do backgroud.  
		titulo = "<h1 style= 'text-align: center; font-size: 75px; width: 500px; background-color: #1f51da; color: white; margin-top: 5%; style= '>Atividade 2!</h1>";
		
		subtitulo = "<h1 style=\"color: #F5F5F5; font-size: 30pt; background-color: #1f51da; width: 500px; text-align: center; font-family: Helvetica, Times, serif;\" >"
				+ " Objetivos de estudos para o final de semana: </h1> "
				+ "<h2 style=\"color: #F0F8FF; font-size: 30pt;  background-color: #1f51da; width: 500px; text-align: left; font-family: Helvetica, Times, serif; \"> "
				+ "Topicos: </h2>";
		
		resposta = "<ul style=\"color: #F5F5F5; font-size: 18pt;  background-color: #1f51da; width: 460px; text-align: left; font-family: Helvetica, Times, serif; \" >"
				+ "<li> Spring Tool</li>"
				+ "<li> Banco de Dados</li>"
				+ "<li> POO</li> </ul>";
		
		return titulo + subtitulo + resposta;
		
	}
}
