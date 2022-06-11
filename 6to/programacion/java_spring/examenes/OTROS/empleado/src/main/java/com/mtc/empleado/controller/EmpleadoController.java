package com.mtc.empleado.controller;

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

import com.mtc.empleado.model.EmpleadoModel;
import com.mtc.empleado.service.EmpleadoService;

@Controller
@RequestMapping("/home")
@SessionAttributes("empleado")
public class EmpleadoController {
    
    @Autowired
    @Qualifier("empleadoService")
    private EmpleadoService empleadoService;

    @GetMapping("/show")
    public String home(Model model) {
        model.addAttribute("empleado", empleadoService.findAll());
        return "empleados";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("empleado", new EmpleadoModel());
        return "empleadosForm";
    }

    @GetMapping("/edit/{gid}")
    public String edit(@PathVariable Long gid, Model model){
        model.addAttribute("empleado", empleadoService.findById(gid));
        return "empleadosForm";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("emplado") EmpleadoModel empleadoModel) {
        empleadoService.save(empleadoModel);
        return "redirect:/home/show";
    }

    @GetMapping("/delete/{gid}")
    public String delete(@PathVariable Long gid) {
        empleadoService.deletebyId(gid);
        return "redirect:/home/show";
    }

}
