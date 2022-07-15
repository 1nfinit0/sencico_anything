package pe.gob.sencico.gestionmap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.gob.sencico.gestionmap.model.ServicioPythonModel;
import pe.gob.sencico.gestionmap.service.ServicePythonService;

@Controller
@RequestMapping("/home")
@SessionAttributes("servicioPython")
public class ServicioPythonController {

    @Autowired
    @Qualifier("servicioPythonService")
    private ServicePythonService servicePythonService;
    
    @GetMapping("/show")
    public String home(Model model) {
        model.addAttribute("listServicioPython", servicePythonService.findAll());
        return "servicioPython";
    }
    
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("servicioPython", new ServicioPythonModel());
        return "servicioPythonForm";
    }
    
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("servicioPython", servicePythonService.findById(id));
        return "servicioPythonForm";
    }
    
    @PostMapping("/save")
    public String save(@ModelAttribute("servicioPython") ServicioPythonModel model) {
        servicePythonService.save(model);
        return "redirect:/home/show";
    }
    
    @GetMapping("/del/{id}")
    public String del(@PathVariable String id) {
        servicePythonService.deleteById(id);
        return "redirect:/home/show";
    }
}
