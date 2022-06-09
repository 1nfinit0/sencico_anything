package com.huatay.usuarios.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.huatay.usuarios.entity.UsuarioEntity;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Serializable> {

}
