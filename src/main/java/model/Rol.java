package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRol")
    private int IdRol;

    @Column(name = "NombreRol")
    private String NombreRol;

    @Column(name = "Descripcion")
    private String Descripcion;

    @OneToMany(mappedBy = "rolUsuarios")
    private List<Usuario> usuarios;

    public Rol() {
    }

    public Rol(int idRol, String nombreRol, String descripcion) {
        IdRol = idRol;
        NombreRol = nombreRol;
        Descripcion = descripcion;
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int idRol) {
        IdRol = idRol;
    }

    public String getNombreRol() {
        return NombreRol;
    }

    public void setNombreRol(String nombreRol) {
        NombreRol = nombreRol;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
