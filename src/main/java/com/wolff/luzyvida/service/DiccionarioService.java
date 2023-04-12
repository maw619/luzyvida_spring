package com.wolff.luzyvida.service;

import com.wolff.luzyvida.entity.Diccionario;
import com.wolff.luzyvida.repository.DiccionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiccionarioService {

    private DiccionarioRepository diccionarioRepository;

    @Autowired
    public DiccionarioService(DiccionarioRepository diccionarioRepository) {
        this.diccionarioRepository = diccionarioRepository;
    }


    public List<Diccionario> listAll() {
        return diccionarioRepository.findAll();
    }

    public void save(Diccionario diccionario) {
        diccionarioRepository.save(diccionario);
    }
}
