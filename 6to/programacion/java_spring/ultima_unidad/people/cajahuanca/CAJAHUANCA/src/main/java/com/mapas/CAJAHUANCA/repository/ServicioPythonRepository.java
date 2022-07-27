package com.mapas.CAJAHUANCA.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapas.CAJAHUANCA.entity.ServicioPython;

@Repository("servicioPythonRepository")
public interface ServicioPythonRepository extends JpaRepository<ServicioPython, Serializable>{

}