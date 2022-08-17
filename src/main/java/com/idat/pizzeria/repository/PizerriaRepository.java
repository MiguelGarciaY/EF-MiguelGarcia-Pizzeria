package com.idat.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.pizzeria.entity.Pizerria;


@Repository
public interface PizerriaRepository extends JpaRepository<Pizerria,Integer> {
}
