package pe.gob.sencico.gestionmap.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.gob.sencico.gestionmap.entity.GestionMapEntity;

@Repository("gestionMapRepository")
public interface GestionMapRepository extends JpaRepository<GestionMapEntity, Serializable>{
    
}
