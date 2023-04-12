package com.wolff.luzyvida.repository;

import com.wolff.luzyvida.entity.Diccionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DiccionarioRepository extends JpaRepository<Diccionario, Long> {
}
