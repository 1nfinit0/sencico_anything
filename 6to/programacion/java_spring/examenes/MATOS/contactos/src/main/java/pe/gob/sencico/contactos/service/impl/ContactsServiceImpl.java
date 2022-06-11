package pe.gob.sencico.contactos.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.sencico.contactos.converter.ContactsConverter;
import pe.gob.sencico.contactos.entity.Contacts;
import pe.gob.sencico.contactos.model.ContactsModel;
import pe.gob.sencico.contactos.repository.ContactsRepository;
import pe.gob.sencico.contactos.service.ContactsService;

@Service("contactsService")
public class ContactsServiceImpl implements ContactsService{

	@Autowired
	@Qualifier("contactsRepository")
	private ContactsRepository contactsRepository;
	
	@Autowired
	@Qualifier("contactsConverter")
	private ContactsConverter contactsConverter;
	
	@Override
	@Transactional(readOnly = true)
	public List<ContactsModel> findAll() {
		List<Contacts> listEntity = contactsRepository.findAll();
		List<ContactsModel> listModel = new LinkedList<>();
		for(Contacts entity:listEntity) {
			ContactsModel model = new ContactsModel();
			model = contactsConverter.aModel(entity);
			listModel.add(model);
		}
		return listModel;
	}

	@Override
	@Transactional
	public void save(ContactsModel model) {
		contactsRepository.save(contactsConverter.aEntity(model));
	}

	@Override
	@Transactional(readOnly = true)
	public ContactsModel findById(Long id) {
		ContactsModel model = contactsConverter.aModel(contactsRepository.findById(id).orElse(null));
		return model;
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		contactsRepository.deleteById(id);
	}

}
