package com.idat.pizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.pizzeria.entity.Pizerria;
import com.idat.pizzeria.service.PizerriaService;

@Controller
@RequestMapping("/apipizerria/v1")
public class PizerriaController {
	@Autowired
	private PizerriaService service;
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Pizerria pizerria) {
		service.guardar(pizerria);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarAlumnosAaula() {
		service.asignarPizza();
	}
}
