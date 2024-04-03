package hn.unah.lenguajes1900.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoUsuario;

    private String nombre;
    
    private String apellido;

    private String correo;

    private String telefono;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="idDireccion", referencedColumnName="idDireccion")
    private DireccionFacturacion direccionFacturacion;

}
