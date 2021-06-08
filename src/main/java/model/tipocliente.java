package model;
Laura
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipocliente")
public class tipocliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTipoC ")
    private int IdTipoC;

    @Column(name = "nombreTipoC")
    private String nombreTipoC;

    @Column(name = "DescripcionCl")
    private String descripcionC;

    @OneToMany(mappedBy = "TipoClienteU")
    private List<cliente> clientes;

    //costructor - getters - setters

    public tipocliente() {
    }

    public tipocliente(int idTipoC, String nombreTipoC, String descripcionC) {
        IdTipoC = idTipoC;
        this.nombreTipoC = nombreTipoC;
        this.descripcionC = descripcionC;
    }

    public int getIdTipoC() {
        return IdTipoC;
    }

    public void setIdTipoC(int idTipoC) {
        IdTipoC = idTipoC;
    }

    public String getNombreTipoC() {
        return nombreTipoC;
    }

    public void setNombreTipoC(String nombreTipoC) {
        this.nombreTipoC = nombreTipoC;
    }

    public String getDescripcionC() {
        return descripcionC;
    }

    public void setDescripcionC(String descripcionC) {
        this.descripcionC = descripcionC;
    }

    
}
