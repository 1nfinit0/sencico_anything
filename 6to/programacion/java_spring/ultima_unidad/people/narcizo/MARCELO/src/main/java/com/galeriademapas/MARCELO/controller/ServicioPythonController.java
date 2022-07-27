package com.galeriademapas.MARCELO.controller;

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

import com.galeriademapas.MARCELO.model.ServicioPythonModel;
import com.galeriademapas.MARCELO.service.ServicioPythonService;

@Controller
@RequestMapping("/home")
@SessionAttributes("servicioPython")
public class ServicioPythonController {

    @Autowired
    @Qualifier("servicioPythonService")
    private ServicioPythonService servicioPythonService;
    
    @GetMapping("/show")
    public String home(Model model) {
        model.addAttribute("listServicioPython", servicioPythonService.findAll());
        return "servicioPython";
    }
    
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("servicioPython", new ServicioPythonModel());
        return "servicioPythonForm";
    }
    
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("servicioPython", servicioPythonService.findById(id));
        return "servicioPythonForm";
    }
    
    @PostMapping("/save")
    public String save(@ModelAttribute("servicioPython") ServicioPythonModel model) {
        servicioPythonService.save(model);
        return "redirect:/home/show";
    }
    
    @GetMapping("/del/{id}")
    public String del(@PathVariable String id) {
        servicioPythonService.deleteById(id);
        return "redirect:/home/show";
    }
}