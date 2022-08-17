package com.idat.pizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pizzeria.client.OpenFeignClient;
import com.idat.pizzeria.dto.Cliente;
import com.idat.pizzeria.entity.Pizerria;
import com.idat.pizzeria.entity.PizerriaDetalle;
import com.idat.pizzeria.entity.PizzaFK;
import com.idat.pizzeria.repository.DetallePizerriaRepository;
import com.idat.pizzeria.repository.PizerriaRepository;

@Service
public class PizerriaServiceImpl implements PizerriaService{
	@Autowired
	private PizerriaRepository repository;
	
	@Autowired
	private DetallePizerriaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public void guardar(Pizerria pizerria) {
		repository.save(pizerria);
	}
	
	@Override
	public void asignarPizza() {
		
		List<Cliente> listado = feign.listarCliente();
		PizzaFK fk = null;
		PizerriaDetalle detalle = null;

		
		for (Cliente cliente : listado) {
			
			fk = new PizzaFK();
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdPizerria(1);
			fk.setNombrePizza("Hawaina");
			fk.setDescripcion("Lleva piña");			
			detalle = new PizerriaDetalle();
			detalle.setFk(fk);	
			
			repositoryDetalle.save(detalle);
		}

	}
}
