package com.practicafinal.INCIO.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practicafinal.INCIO.entity.ServicioPython;

@Repository("servicioPythonRepository")
public interface ServicioPythonRepository extends JpaRepository<ServicioPython, Serializable>{

}
