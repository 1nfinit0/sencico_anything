package com.galeriademapas.MARCELO.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galeriademapas.MARCELO.entity.ServicioPython;

@Repository("servicioPythonRepository")
public interface ServicioPythonRepository extends JpaRepository<ServicioPython, Serializable>{

}
