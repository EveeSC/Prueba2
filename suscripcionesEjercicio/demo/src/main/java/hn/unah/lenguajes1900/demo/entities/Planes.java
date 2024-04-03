package hn.unah.lenguajes1900.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="planes")
@Data
public class Planes {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idplan")
    private long idPlan;

    private String descripcion;

    private double precio;

    //muchos planes tienen un tipo streaming
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idstreaming", referencedColumnName="idstreaming") //este mismo debe estar en el column
    private TipoStreaming tipoStreaming;
    
}
