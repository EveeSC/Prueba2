package hn.unah.lenguajes1900.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tipostreaming")
@Data
public class TipoStreaming {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idstreaming") //con este mismo nombre debe estar referenciarse en el joincolumn
    private long idStreaming;

    private String descripcion;

    @JsonManagedReference
    @OneToMany(mappedBy = "tipoStreaming")
    private List<Planes> planes;

}
