package com.acosta.ACOSTA.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acosta.ACOSTA.entity.Gestionmapa;


@Repository("gestionmapaRepository")
public interface GestionmapaRepository extends JpaRepository<Gestionmapa, Serializable>{

}
