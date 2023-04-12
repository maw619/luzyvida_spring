package com.wolff.luzyvida.service;

import com.wolff.luzyvida.entity.Versiculos;
import com.wolff.luzyvida.repository.VersiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VersiculosService {

    private VersiculosRepository versiculosRepository;

    @Autowired
    public VersiculosService(VersiculosRepository versiculosRepository) {
        this.versiculosRepository = versiculosRepository;
    }

    public List<Versiculos> listAll() {
        List<Versiculos>listar = versiculosRepository.findAll();
        return listar;
    }
}
