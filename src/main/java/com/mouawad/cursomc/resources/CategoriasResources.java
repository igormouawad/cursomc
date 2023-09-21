package com.mouawad.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mouawad.cursomc.domain.Categoria;
import com.mouawad.cursomc.services.CategoriaService;

@RestController
public class CategoriasResources {

	@Autowired
	private CategoriaService service;
	
	@GetMapping(value = "/categorias/{id}")
	public ResponseEntity<?> find(@PathVariable("id") Integer id) {
		Categoria obj = service.buscar(id);

		return ResponseEntity.ok().body(obj);
	}

}
