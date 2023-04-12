package com.wolff.luzyvida.controller;

import com.wolff.luzyvida.entity.Diccionario;
import com.wolff.luzyvida.service.DiccionarioService;
import com.wolff.luzyvida.service.VersiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    private DiccionarioService diccionarioService;
    private VersiculosService versiculosService;

    @Autowired
    public  HomeController(DiccionarioService diccionarioService,VersiculosService versiculosService){
        this.diccionarioService = diccionarioService;
        this.versiculosService = versiculosService;
    }

    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping("/lectura")
    public String lectura(){
        return "lectura";
    }

    @GetMapping("/diccionario")
    public String diccionario(){
        return "diccionario";
    }

    @GetMapping("/load-dicc-form")
    public String loadDiccForm(Model model){
        Diccionario d = new Diccionario();
        model.addAttribute("diccionario", d);
        return "diccionario-form";
    }
    @PostMapping("/saveDiccionario")
    public String saveDiccionario(@ModelAttribute Diccionario diccionario){
        diccionarioService.save(diccionario);
        return "diccionario";
    }
}
