package com.mouawad.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mouawad.cursomc.domain.Pedido;
import com.mouawad.cursomc.services.PedidoService;

@RestController
public class PedidoResources {

	@Autowired
	private PedidoService service;

	@GetMapping(value = "/pedidos/{id}")
	public ResponseEntity<?> find(@PathVariable("id") Integer id) {
		Pedido obj = service.buscar(id);

		return ResponseEntity.ok().body(obj);
	}

}
