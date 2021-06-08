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
@Table(name = "estadocivil")
public class EstadoCivil {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEstadoCivil")
    private int IdEstadoCivil;

    @Column(name = "EstadoCivil",length = 45)
    private String NEstadoC;

    @OneToMany(mappedBy = "EstadoCivilU")
    private List<Usuario> usuarios;

    public EstadoCivil() {
    }

    public EstadoCivil(int idEstadoCivil, String nEstadoC) {
        IdEstadoCivil = idEstadoCivil;
        NEstadoC = nEstadoC;
    }

    public int getIdEstadoCivil() {
        return IdEstadoCivil;
    }

    public void setIdEstadoCivil(int idEstadoCivil) {
        IdEstadoCivil = idEstadoCivil;
    }

    public String getNEstadoC() {
        return NEstadoC;
    }

    public void setNEstadoC(String nEstadoC) {
        NEstadoC = nEstadoC;
    }
    
}
