/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Edison
 */
public class Item {
    private String nombreItem;
    private Integer unidad;
    private Double precio;

    public Item(String nombre) {
        this.nombreItem = nombre;
    }

    public Item(Integer unidad) {
        this.unidad = unidad;
    }

    public Item(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombreItem;
    }

    public void setNombre(String nombre) {
        this.nombreItem = nombre;
    }

    public Integer getUnidad() {
        return unidad;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombreItem + ", unidad=" + unidad + ", precio=" + precio + '}';
    }

    

    
    
}
