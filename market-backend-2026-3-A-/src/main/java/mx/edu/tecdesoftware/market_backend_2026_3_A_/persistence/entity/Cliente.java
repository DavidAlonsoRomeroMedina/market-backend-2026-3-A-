package mx.edu.tecdesoftware.market_backend_2026_3_A_.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "clientes")

public class Cliente {

    @Id
    private String id;

    private String nombre;
    private String apellidos;
    private Long celular;
    private String direcccion;

    @Column (name = "correo_electronico")
    private String correoelectonico;

    //Un cliente tiene muchas compras
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    public String getCorreoelectonico() {
        return correoelectonico;
    }

    public void setCorreoelectonico(String correoelectonico) {
        this.correoelectonico = correoelectonico;
    }
}
