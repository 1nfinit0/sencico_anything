package pe.gob.sencico.contactos.converter.impl;

import org.springframework.stereotype.Component;

import pe.gob.sencico.contactos.converter.ContactsConverter;
import pe.gob.sencico.contactos.entity.Contacts;
import pe.gob.sencico.contactos.model.ContactsModel;

@Component("contactsConverter")
public class ContactsConverterImpl implements ContactsConverter{

	@Override
	public Contacts aEntity(ContactsModel model) {
		Contacts entity = new Contacts();
		entity.setId(model.getId());
		entity.setFirstName(model.getFirstName());
		entity.setLastName(model.getLastName());
		entity.setPhoneNumber(model.getPhoneNumber());
		entity.setEmailAddress(model.getEmailAddress());
		return entity;
	}

	@Override
	public ContactsModel aModel(Contacts entity) {
		ContactsModel model = new ContactsModel();
		model.setId(entity.getId());
		model.setFirstName(entity.getFirstName());
		model.setLastName(entity.getLastName());
		model.setPhoneNumber(entity.getPhoneNumber());
		model.setEmailAddress(entity.getEmailAddress());
		return model;
	}

}
