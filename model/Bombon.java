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
public class Bombon extends Categoria{
    
    public String chocolate;
    public String manjar;
    public String fresa;
    public String frambuesa;
    public Integer cantidad;

    public Bombon() {
    }

    public Bombon(String chocolate, String manjar, String fresa, String frambuesa) {
        this.chocolate = chocolate;
        this.manjar = manjar;
        this.fresa = fresa;
        this.frambuesa = frambuesa;
    }

    public Bombon(Integer cantidad) {
        this.cantidad = cantidad;
    }
    

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public String getManjar() {
        return manjar;
    }

    public void setManjar(String manjar) {
        this.manjar = manjar;
    }

    public String getFresa() {
        return fresa;
    }

    public void setFresa(String fresa) {
        this.fresa = fresa;
    }

    public String getFrambuesa() {
        return frambuesa;
    }

    public void setFrambuesa(String frambuesa) {
        this.frambuesa = frambuesa;
    }

    /**
     *
     * @return
     */
    @Override
    public Postre getPostre() {
        return postre;
    }

    /**
     *
     * @param postre
     */
    @Override
    public void setPostre(Postre postre) {
        this.postre = postre;
    }

    /**
     *
     * @return
     */
    @Override
    public Torta getTorta() {
        return torta;
    }

    @Override
    public void setTorta(Torta torta) {
        this.torta = torta;
    }

    /**
     *
     * @return
     */
    @Override
    public Galleta getGalleta() {
        return galleta;
    }

    /**
     *
     * @param galleta
     */
    @Override
    public void setGalleta(Galleta galleta) {
        this.galleta = galleta;
    }

    @Override
    public Bombon getBombon() {
        return bombon;
    }

    /**
     *
     * @param bombon
     */
    @Override
    public void setBombon(Bombon bombon) {
        this.bombon = bombon;
    }

    @Override
    public String toString() {
        return "Bombon{" + "chocolate=" + chocolate + ", manjar=" + manjar + ", fresa=" + fresa + ", frambuesa=" + frambuesa + '}';
    }
    
    
    
}
