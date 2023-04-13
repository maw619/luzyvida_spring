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
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public String home(Model model){
        List<String>playlist = new ArrayList<>();
        playlist.add("https://radioluzyvida.s3.amazonaws.com/rv1960/A01GENESIS.mp3");
        playlist.add("https://radioluzyvida.s3.amazonaws.com/rv1960/A02EXODO.mp3");
        playlist.add("https://radioluzyvida.s3.amazonaws.com/rv1960/A03LEVITICO.mp3");
        playlist.add("https://radioluzyvida.s3.amazonaws.com/rv1960/A04NUMEROS.mp3");
        playlist.add("https://radioluzyvida.s3.amazonaws.com/rv1960/A05DEUTERONOMIO.mp3");
        model.addAttribute("playlist", playlist);
        return "index";
    }

    @GetMapping("/temas")
    public String lectura(Model model){
        model.addAttribute("vers", versiculosService.listAll().subList(0,15));
        return "temas";
    }

    @GetMapping("/diccionario")
    public String diccionario(Model model){
        model.addAttribute("dicc", diccionarioService.listAll().subList(0,15));
        return "diccionario";
    }


    @GetMapping("/load-dicc-form")
    public String loadDiccForm(Model model){
        Diccionario d = new Diccionario();
        model.addAttribute("diccionario.html", d);
        return "diccionario-form.html";
    }

    @PostMapping("/saveDiccionario")
    public String saveDiccionario(@ModelAttribute Diccionario diccionario){
        diccionarioService.save(diccionario);
        return "diccionario.html";
    }

}
