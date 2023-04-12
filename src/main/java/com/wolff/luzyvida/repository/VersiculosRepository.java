package com.wolff.luzyvida.repository;

import com.wolff.luzyvida.entity.Versiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface VersiculosRepository extends JpaRepository<Versiculos, Long> {
}
