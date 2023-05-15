package com.api.redSocial.models;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private Long celular;

    @Column
    private String email;

    @Column
    private String contrasena;

    @Column
    private String fecha_Nac;

    @Column
    private String sexo;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public Long getCelular()
    {
        return celular;
    }

    public void setCelular(Long celular)
    {
        this.celular = celular;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getContrasena()
    {
        return contrasena;
    }

    public void setContrasena(String contrasena)
    {
        this.contrasena = contrasena;
    }

    public String getFecha_Nac()
    {
        return fecha_Nac;
    }

    public void setFecha_Nac(String fecha_Nac)
    {
        this.fecha_Nac = fecha_Nac;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
}
