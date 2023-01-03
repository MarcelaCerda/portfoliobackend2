package com.example.demojar.models;
      
import jakarta.persistence.*;
@Entity
@Table(name = "habilidades")
public class HabilidadesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="datosPersonales")
    private DatosPersonalesModel datosPersonales;

    private String habilidad;
    private float nivel;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    public String getHabilidad() {
        return habilidad;
    }
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    public float getNivel() {
        return nivel;
    }
    public void setNivel(float nivel) {
        this.nivel = nivel;
    }
    /*public DatosPersonalesModel getDatosPersonales() {
        return datosPersonales;
    }
    public void setDatosPersonales(DatosPersonalesModel datosPersonales) {
        this.datosPersonales = datosPersonales;
    }
    */   
}

