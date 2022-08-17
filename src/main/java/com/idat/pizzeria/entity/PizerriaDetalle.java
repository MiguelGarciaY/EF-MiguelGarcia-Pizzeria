package com.idat.pizzeria.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pizza")
public class PizerriaDetalle {
	@Id
	private PizzaFK fk =new PizzaFK();

	public PizzaFK getFk() {
		return fk;
	}

	public void setFk(PizzaFK fk) {
		this.fk = fk;
	}
}
