
package Identidades;

/**
 * Nombre de la clase: Cliente
 * Fecha: 27-08-2019
 * Version: 1.0
 * COpyRight: Itca-Fepade
 * @author Alexis Aguilar
 */
public class Cliente {
        
    private int idUsuario;
    private String usuario;
    private String correo;
    private String contraseña;
    private String nombre;
    private String direccion;
    private String telefono;
    private String dui;
    private String fechaNacimiento;
    private String rol;

    //Constructor vacio
    public Cliente() {
    }

    //Constructor para agregar
    public Cliente(String usuario, String correo, String contraseña, String nombre, String direccion, String telefono, String dui, String fechaNacimiento) {
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //constructor login
    public Cliente(String usuario, String correo, String contraseña, String rol) {
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }
    
    
    //Getters y setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
        
}
