package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuario ")
    private int IdUsuario;

    @Column(name = "NombresUsuario", length = 45)
    private String NombresUsuario;

    @Column(name = "ApellidosUsuario", length = 45)
    private String ApellidosUsuario;

    @Column(name = "NumeroDocumento", unique = true)
    private int NumeroDocumento;

    @Column(name = "NumeCelular")
    private int NumeCelular;

    @Column(name = "NumTelefono")
    private int NumTelefono;

    @Column(name = "FechaNacimientoU")
    private String FechaNacimientoU;

    @Column(name = "CorreoUsuario", length = 20)
    private Date CorreoUsuario;

    @Column(name = "GeneroUsuario")
    private String GeneroUsuario;

    @Column(name = "FotoUsuario")
    private String 	FotoUsuario;

    @Column(name = "DireccionUsuario", length = 30)
    private String DireccionUsuario;

    @Column(name = "EdadU")
    private int EdadU;

    @Column(name = "Contraseña",length = 12)
    private String Contraseña;

    @Column(name = "Disponibilidad", nullable = false)
    private String Disponibilidad;

    @Column(name = "EstadoUsuario")
    private String EstadoUsuario;
    
    @Column(name = "Id_Tipo")
    private int IdTipoFK;

    @ManyToOne()   //un tipo de documento para muchos usuarios
    @JoinColumn(name = "Id_Tipo", insertable = false, updatable = false)   //referenciar llave foranea, no se puede realizar crud desde esta clase 
    private tipoidentificacion TipoIdentificacionU;
    // se asocia la fk Id_Tipo con todos los elementos que provengan de TipoIdentificacion, y de sus propiedades

    @Column(name = "IdRol")
    private int IdRolFK;
    
    @ManyToOne()
    @JoinColumn(name = "IdRol")
    private Rol rolUsuarios;

    @Column(name = "IdEstadoCivil")
    private int IdEstadoCivilFK;

    @ManyToOne()
    @JoinColumn(name = "IdEstadoCivil", insertable = false, updatable = false)
    private EstadoCivil EstadoCivilU;

    @Column(name = "IdLugar")
    private int IdLugarFK;

    //costructore - getters - setters


    public Usuario() {
    }
    public Usuario(int idUsuario, String nombresUsuario, String apellidosUsuario, int numeroDocumento, int numeCelular,
            int numTelefono, String fechaNacimientoU, Date correoUsuario, String generoUsuario, String fotoUsuario,
            String direccionUsuario, int edadU, String contraseña, String disponibilidad, String estadoUsuario,
            int idTipoFK, int idRolFK, int idEstadoCivilFK, int idLugarFK) {
        IdUsuario = idUsuario;
        NombresUsuario = nombresUsuario;
        ApellidosUsuario = apellidosUsuario;
        NumeroDocumento = numeroDocumento;
        NumeCelular = numeCelular;
        NumTelefono = numTelefono;
        FechaNacimientoU = fechaNacimientoU;
        CorreoUsuario = correoUsuario;
        GeneroUsuario = generoUsuario;
        FotoUsuario = fotoUsuario;
        DireccionUsuario = direccionUsuario;
        EdadU = edadU;
        Contraseña = contraseña;
        Disponibilidad = disponibilidad;
        EstadoUsuario = estadoUsuario;
        IdTipoFK = idTipoFK;
        IdRolFK = idRolFK;
        IdEstadoCivilFK = idEstadoCivilFK;
        IdLugarFK = idLugarFK;
    }
    public int getIdUsuario() {
        return IdUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }
    public String getNombresUsuario() {
        return NombresUsuario;
    }
    public void setNombresUsuario(String nombresUsuario) {
        NombresUsuario = nombresUsuario;
    }
    public String getApellidosUsuario() {
        return ApellidosUsuario;
    }
    public void setApellidosUsuario(String apellidosUsuario) {
        ApellidosUsuario = apellidosUsuario;
    }
    public int getNumeroDocumento() {
        return NumeroDocumento;
    }
    public void setNumeroDocumento(int numeroDocumento) {
        NumeroDocumento = numeroDocumento;
    }
    public int getNumeCelular() {
        return NumeCelular;
    }
    public void setNumeCelular(int numeCelular) {
        NumeCelular = numeCelular;
    }
    public int getNumTelefono() {
        return NumTelefono;
    }
    public void setNumTelefono(int numTelefono) {
        NumTelefono = numTelefono;
    }
    public String getFechaNacimientoU() {
        return FechaNacimientoU;
    }
    public void setFechaNacimientoU(String fechaNacimientoU) {
        FechaNacimientoU = fechaNacimientoU;
    }
    public Date getCorreoUsuario() {
        return CorreoUsuario;
    }
    public void setCorreoUsuario(Date correoUsuario) {
        CorreoUsuario = correoUsuario;
    }
    public String getGeneroUsuario() {
        return GeneroUsuario;
    }
    public void setGeneroUsuario(String generoUsuario) {
        GeneroUsuario = generoUsuario;
    }
    public String getFotoUsuario() {
        return FotoUsuario;
    }
    public void setFotoUsuario(String fotoUsuario) {
        FotoUsuario = fotoUsuario;
    }
    public String getDireccionUsuario() {
        return DireccionUsuario;
    }
    public void setDireccionUsuario(String direccionUsuario) {
        DireccionUsuario = direccionUsuario;
    }
    public int getEdadU() {
        return EdadU;
    }
    public void setEdadU(int edadU) {
        EdadU = edadU;
    }
    public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
    public String getDisponibilidad() {
        return Disponibilidad;
    }
    public void setDisponibilidad(String disponibilidad) {
        Disponibilidad = disponibilidad;
    }
    public String getEstadoUsuario() {
        return EstadoUsuario;
    }
    public void setEstadoUsuario(String estadoUsuario) {
        EstadoUsuario = estadoUsuario;
    }
    public int getIdTipoFK() {
        return IdTipoFK;
    }
    public void setIdTipoFK(int idTipoFK) {
        IdTipoFK = idTipoFK;
    }
    public int getIdRolFK() {
        return IdRolFK;
    }
    public void setIdRolFK(int idRolFK) {
        IdRolFK = idRolFK;
    }
    public int getIdEstadoCivilFK() {
        return IdEstadoCivilFK;
    }
    public void setIdEstadoCivilFK(int idEstadoCivilFK) {
        IdEstadoCivilFK = idEstadoCivilFK;
    }
    public int getIdLugarFK() {
        return IdLugarFK;
    }
    public void setIdLugarFK(int idLugarFK) {
        IdLugarFK = idLugarFK;
    }

    
    
}
