package pe.gob.sencico.gestionmap.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.gob.sencico.gestionmap.entity.ServicioPython;

@Repository("serivicioPythonRepository")
public interface ServicioPythonRepository extends JpaRepository<ServicioPython, Serializable> {

}
