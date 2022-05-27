package pe.gob.sencico.contactos.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.gob.sencico.contactos.entity.Contacts;

@Repository("ContactsRepository")
public interface ContactsRepository extends JpaRepository<Contacts, Serializable> {

}