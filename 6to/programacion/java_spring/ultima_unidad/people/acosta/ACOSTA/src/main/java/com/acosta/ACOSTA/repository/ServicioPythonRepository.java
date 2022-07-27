package com.acosta.ACOSTA.repository;
import com.acosta.ACOSTA.entity.ServicioPython;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("servicioPythonRepository")
public interface ServicioPythonRepository extends JpaRepository<ServicioPython, Serializable>{

}
