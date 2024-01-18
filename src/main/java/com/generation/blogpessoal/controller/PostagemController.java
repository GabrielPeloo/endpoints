package com.generation.blogpessoal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*") //informa toda e qualquer origem que pode acessar essa rota
public class PostagemController {

	//injeção de dependencias
	@Autowired
	private PostagemRepository postagemRepository;

	@GetMapping
	public ResponseEntity<List<Postagem>> getAll(){
		//respostas no formato http
		
		return ResponseEntity.ok(postagemRepository.findAll());
	    
		//find all == select * from nomedatabela
		
		// código de retorno -- corpo de retorno
	
	}
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		String hello = "Hello World!!";
		return ResponseEntity.ok(hello);
		
		}
	@GetMapping("/lista_bsm")
	public ResponseEntity<String> bsm(){
		String bsm = "Responsabilidade Pessoal\n"
				+ "Mentalidade de Crescimento\n"
				+ "Orientação ao Futuro\n"
				+ "Persistência\n"
				+ "Comunicação\n"
				+ "Atenção para Detalhes\n"
				+ "Trabalho em Equipe\n"
				+ "Proatividade\n"
				+ "Profissionalismo\n"
				+ "Precisão Técnica\n";
		return ResponseEntity.ok(bsm);
		
		}
	@GetMapping("/metas_semanais")
	public ResponseEntity<String> metas(){
		String metas = "Spring\n"
				+ "modelagem de tabelas pelo sts";
		return ResponseEntity.ok(metas);
		
	}
	
}
