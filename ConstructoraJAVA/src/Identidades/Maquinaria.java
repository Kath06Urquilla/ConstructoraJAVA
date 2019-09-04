/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidades;

/**
 *
 * @author romer
 */
public class Maquinaria {
    private int idMaquinaria;
    private String nombre;
    private String tipoMaquinaria;
    private String marca;
    private double precioDia;
    private int existencia;
    private int estado;

    public Maquinaria() {
    }

    public Maquinaria(int idMaquinaria, String nombre, String tipoMaquinaria, String marca, double precioDia, int existencia, int estado) {
        this.idMaquinaria = idMaquinaria;
        this.nombre = nombre;
        this.tipoMaquinaria = tipoMaquinaria;
        this.marca = marca;
        this.precioDia = precioDia;
        this.existencia = existencia;
        this.estado = estado;
    }

    public Maquinaria(int idMaquinaria, String nombre, String tipoMaquinaria, String marca, double precioDia, int existencia) {
        this.idMaquinaria = idMaquinaria;
        this.nombre = nombre;
        this.tipoMaquinaria = tipoMaquinaria;
        this.marca = marca;
        this.precioDia = precioDia;
        this.existencia = existencia;
    }

    public Maquinaria(String nombre, String tipoMaquinaria, String marca, double precioDia, int existencia, int estado) {
        this.nombre = nombre;
        this.tipoMaquinaria = tipoMaquinaria;
        this.marca = marca;
        this.precioDia = precioDia;
        this.existencia = existencia;
        this.estado = estado;
    }

    public Maquinaria(String nombre, String tipoMaquinaria, String marca, double precioDia, int existencia) {
        this.nombre = nombre;
        this.tipoMaquinaria = tipoMaquinaria;
        this.marca = marca;
        this.precioDia = precioDia;
        this.existencia = existencia;
    }
    

    public Maquinaria(int idMaquinaria) {
        this.idMaquinaria = idMaquinaria;
    }

    public int getIdMaquinaria() {
        return idMaquinaria;
    }

    public void setIdMaquinaria(int idMaquinaria) {
        this.idMaquinaria = idMaquinaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMaquinaria() {
        return tipoMaquinaria;
    }

    public void setTipoMaquinaria(String tipoMaquinaria) {
        this.tipoMaquinaria = tipoMaquinaria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    
}
