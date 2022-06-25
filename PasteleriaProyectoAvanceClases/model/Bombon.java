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
    
    public Integer chocolate;
    public Integer manjar;
    public Integer fresa;
    public Integer frambuesa;

    public Bombon() {
    }

    public Bombon(Integer chocolate, Integer manjar, Integer fresa, Integer frambuesa) {
        this.chocolate = chocolate;
        this.manjar = manjar;
        this.fresa = fresa;
        this.frambuesa = frambuesa;
    }

    public Integer getChocolate() {
        return chocolate;
    }

    public void setChocolate(Integer chocolate) {
        this.chocolate = chocolate;
    }

    public Integer getManjar() {
        return manjar;
    }

    public void setManjar(Integer manjar) {
        this.manjar = manjar;
    }

    public Integer getFresa() {
        return fresa;
    }

    public void setFresa(Integer fresa) {
        this.fresa = fresa;
    }

    public Integer getFrambuesa() {
        return frambuesa;
    }

    public void setFrambuesa(Integer frambuesa) {
        this.frambuesa = frambuesa;
    }

    public Postre getPostre() {
        return postre;
    }

    public void setPostre(Postre postre) {
        this.postre = postre;
    }

    public Torta getTorta() {
        return torta;
    }

    public void setTorta(Torta torta) {
        this.torta = torta;
    }

    public Galleta getGalleta() {
        return galleta;
    }

    public void setGalleta(Galleta galleta) {
        this.galleta = galleta;
    }

    public Bombon getBombon() {
        return bombon;
    }

    public void setBombon(Bombon bombon) {
        this.bombon = bombon;
    }

    @Override
    public String toString() {
        return "Bombon{" + "chocolate=" + chocolate + ", manjar=" + manjar + ", fresa=" + fresa + ", frambuesa=" + frambuesa + '}';
    }
    
    
    
}
