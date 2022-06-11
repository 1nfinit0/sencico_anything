package com.personal.mtc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.mtc.entity.EmpleadoEntity;

@Repository("empleadoRepository")
public interface EmpleadoRepository  extends JpaRepository<EmpleadoEntity, Serializable> {

}
