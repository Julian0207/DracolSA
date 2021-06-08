package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity     //define esta clase como una entidad
@Table(name = "tipoidentificacion")     //asociar esta clase a una tabla de bd
public class tipoidentificacion {
    
    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Tipo")
    private int Id_Tipo;

    @Column(name = "TipoIdentificacion", length = 45)
    private String TipoIdentificacion;

    @OneToMany(mappedBy = "TipoIdentificacionU")   //un tipo de documento para muchos usuarios}
    private List<Usuario> usuarios;


    public tipoidentificacion(){
    }

    public tipoidentificacion(int id_Tipo, String tipoIdentificacion) {
        Id_Tipo = id_Tipo;
        TipoIdentificacion = tipoIdentificacion;
    }

    public int getId_Tipo() {
        return Id_Tipo;
    }

    public void setId_Tipo(int id_Tipo) {
        Id_Tipo = id_Tipo;
    }

    public String getTipoIdentificacion() {
        return TipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        TipoIdentificacion = tipoIdentificacion;
    }

}
