package com.wolff.luzyvida.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "diccionario")
public class Diccionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "palabra")
    private String palabra;

    @Column(name = "definicion")
    private String definicion;

    public Diccionario(){

    }

    public Diccionario(Long id, String palabra, String definicion) {
        this.id = id;
        this.palabra = palabra;
        this.definicion = definicion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    @Override
    public String toString() {
        return "Diccionario{" +
                "id=" + id +
                ", palabra='" + palabra + '\'' +
                ", definicion='" + definicion + '\'' +
                '}';
    }
}
