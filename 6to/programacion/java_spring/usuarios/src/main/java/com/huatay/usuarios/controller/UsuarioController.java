package com.huatay.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.huatay.usuarios.model.UsuarioModel;
import com.huatay.usuarios.service.UsuarioService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/home")
@SessionAttributes("usuario")
public class UsuarioController {
    
    @Autowired
    @Qualifier("usuarioService")
    private UsuarioService usuarioService;

    @GetMapping("/show")
    public String home(Model model) {
        model.addAttribute("usuario", usuarioService.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("usuario", new UsuarioModel());
        return "usuarioForm";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("usuario", usuarioService.findById(id));
        return "usuarioForm";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("usuario") UsuarioModel usuarioModel) {
        usuarioService.save(usuarioModel);
        return "redirect:/home/show";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        usuarioService.deleteById(id);
        return "redirect:/home/show";
    }
}
