package com.practicafinal.INCIO.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practicafinal.INCIO.entity.Gestionmapa;


@Repository("gestionmapaRepository")
public interface GestionmapaRepository extends JpaRepository<Gestionmapa, Serializable>{
}
