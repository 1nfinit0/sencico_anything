package com.galeriademapas.MARCELO.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galeriademapas.MARCELO.entity.Gestionmapa;


@Repository("gestionmapaRepository")
public interface GestionmapaRepository extends JpaRepository<Gestionmapa, Serializable>{

}
