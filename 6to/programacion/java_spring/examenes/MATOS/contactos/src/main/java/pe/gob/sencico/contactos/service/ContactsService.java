package pe.gob.sencico.contactos.service;

import java.util.List;

import pe.gob.sencico.contactos.model.ContactsModel;

public interface ContactsService {
	
	public List<ContactsModel> findAll();
	
	public void save(ContactsModel model);
	
	public ContactsModel findById(Long id);
	
	public void deleteById(Long id);

}
