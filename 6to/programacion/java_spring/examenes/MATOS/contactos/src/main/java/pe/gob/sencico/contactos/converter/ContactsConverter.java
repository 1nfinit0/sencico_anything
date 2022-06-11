package pe.gob.sencico.contactos.converter;

import pe.gob.sencico.contactos.entity.Contacts;
import pe.gob.sencico.contactos.model.ContactsModel;

public interface ContactsConverter {

	public Contacts aEntity(ContactsModel model);
	
	public ContactsModel aModel(Contacts entity);
}
