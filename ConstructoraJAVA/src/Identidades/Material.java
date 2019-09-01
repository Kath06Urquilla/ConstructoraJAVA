/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidades;

/**
 *
 * @author ALEXIS
 */
public class Material {
    private int idMteriaPrima;
    private String nombre;
    private double precioUnidad;
    private int existencia;

    public Material() {
    }

    public Material(int idMteriaPrima, String nombre, double precioUnidad, int existencia) {
        this.idMteriaPrima = idMteriaPrima;
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.existencia = existencia;
    }

    public Material(String nombre, double precioUnidad, int existencia) {
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.existencia = existencia;
    }

    public Material(int idMteriaPrima) {
        this.idMteriaPrima = idMteriaPrima;
    }
    
    public Material(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdMteriaPrima() {
        return idMteriaPrima;
    }

    public void setIdMteriaPrima(int idMteriaPrima) {
        this.idMteriaPrima = idMteriaPrima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
}
