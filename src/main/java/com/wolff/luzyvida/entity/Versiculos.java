package com.wolff.luzyvida.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "lversiculos")
public class Versiculos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "v_Contenido")
    private String v_Contenido;

    @Column(name = "v_IdCapitulo")
    private Long v_IdCapitulo;

    @Column(name = "v_versiculo")
    private Long v_versiculo;

    @Column(name = "v_LBLA")
    private String v_LBLA;

    @Column(name = "v_NAS")
    private String v_NAS;

    public Versiculos(){

    }

    public Versiculos(Long id, String v_Contenido, Long v_IdCapitulo, Long v_versiculo, String v_LBLA, String v_NAS) {
        this.id = id;
        this.v_Contenido = v_Contenido;
        this.v_IdCapitulo = v_IdCapitulo;
        this.v_versiculo = v_versiculo;
        this.v_LBLA = v_LBLA;
        this.v_NAS = v_NAS;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getV_Contenido() {
        return v_Contenido;
    }

    public void setV_Contenido(String v_Contenido) {
        this.v_Contenido = v_Contenido;
    }

    public Long getV_IdCapitulo() {
        return v_IdCapitulo;
    }

    public void setV_IdCapitulo(Long v_IdCapitulo) {
        this.v_IdCapitulo = v_IdCapitulo;
    }

    public Long getV_versiculo() {
        return v_versiculo;
    }

    public void setV_versiculo(Long v_versiculo) {
        this.v_versiculo = v_versiculo;
    }

    public String getV_LBLA() {
        return v_LBLA;
    }

    public void setV_LBLA(String v_LBLA) {
        this.v_LBLA = v_LBLA;
    }

    public String getV_NAS() {
        return v_NAS;
    }

    public void setV_NAS(String v_NAS) {
        this.v_NAS = v_NAS;
    }

    @Override
    public String toString() {
        return "Versiculos{" +
                "id=" + id +
                ", vContenido='" + v_Contenido + '\'' +
                ", v_IdCapitulo=" + v_IdCapitulo +
                ", v_versiculo=" + v_versiculo +
                ", v_LBLA='" + v_LBLA + '\'' +
                ", v_NAS='" + v_NAS + '\'' +
                '}';
    }
}
