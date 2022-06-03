package pe.gob.sencico.contactos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.gob.sencico.contactos.model.ContactsModel;
import pe.gob.sencico.contactos.service.ContactsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
@SessionAttributes("contacts")
public class ContactsController {

    @Autowired
    @Qualifier("contactsService")
    private ContactsService contactsService;

    @GetMapping("/show")
    public String home(Model model){
        model.addAttribute("contacts", contactsService.findAll());
        return "contactos";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("contacts", new ContactsModel());
        return "contactosForm";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        model.addAttribute("contacts", contactsService.findById(id));
        return "contactosForm";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("contacts") ContactsModel contactsModel){
        contactsService.save(contactsModel);
        return "redirect:/home/show";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        contactsService.deleteById(id);
        return "redirect:/home/show";
    }
    
}
