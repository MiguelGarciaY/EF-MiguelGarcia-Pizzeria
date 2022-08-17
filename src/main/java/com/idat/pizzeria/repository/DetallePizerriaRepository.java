package com.idat.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.pizzeria.entity.PizerriaDetalle;

@Repository
public interface DetallePizerriaRepository extends JpaRepository<PizerriaDetalle, Integer>{

}
