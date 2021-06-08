package model;
julian
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "	cliente")
public class cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name ="idCliente") 
    private int idCliente;

    @Column(name ="NombreCC", length = 70)
    private String NombreCC;

    @Column(name = "NumIdentificacion")
    private long NumIdentificacion;

    @Column(name = "ContraseñaC" , length = 12)
    private String ContraseñaC;

    @Column(name = "CorreoCliente" , length = 20)
    private String CorreoCliente;
    
    @Column(name = "NumCelular")
    private int NumCelular;

    @Column(name = "NumTelefono")
    private int NumTelefono;

    @Column(name = "TipoClienteC")
    private int TipoClienteC;

    @Column(name = "IdTipoDocum")
    private int IdTipoDocum;

    @ManyToOne()
    @JoinColumn(name = "idCliente")
    private tipocliente TipoClienteU;

    //costructor - getters - setters
    
    public cliente() {
    }

    public cliente(int idCliente, String nombreCC, long numIdentificacion, String contraseñaC, String correoCliente,
            int numCelular, int numTelefono, int tipoClienteC, int idTipoDocum) {
        this.idCliente = idCliente;
        NombreCC = nombreCC;
        NumIdentificacion = numIdentificacion;
        ContraseñaC = contraseñaC;
        CorreoCliente = correoCliente;
        NumCelular = numCelular;
        NumTelefono = numTelefono;
        TipoClienteC = tipoClienteC;
        IdTipoDocum = idTipoDocum;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCC() {
        return NombreCC;
    }

    public void setNombreCC(String nombreCC) {
        NombreCC = nombreCC;
    }

    public long getNumIdentificacion() {
        return NumIdentificacion;
    }

    public void setNumIdentificacion(long numIdentificacion) {
        NumIdentificacion = numIdentificacion;
    }

    public String getContraseñaC() {
        return ContraseñaC;
    }

    public void setContraseñaC(String contraseñaC) {
        ContraseñaC = contraseñaC;
    }

    public String getCorreoCliente() {
        return CorreoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        CorreoCliente = correoCliente;
    }

    public int getNumCelular() {
        return NumCelular;
    }

    public void setNumCelular(int numCelular) {
        NumCelular = numCelular;
    }

    public int getNumTelefono() {
        return NumTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        NumTelefono = numTelefono;
    }

    public int getTipoClienteC() {
        return TipoClienteC;
    }

    public void setTipoClienteC(int tipoClienteC) {
        TipoClienteC = tipoClienteC;
    }

    public int getIdTipoDocum() {
        return IdTipoDocum;
    }

    public void setIdTipoDocum(int idTipoDocum) {
        IdTipoDocum = idTipoDocum;
    }
}
