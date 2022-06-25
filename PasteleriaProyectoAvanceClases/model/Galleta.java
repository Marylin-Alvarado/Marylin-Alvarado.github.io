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
public class Galleta extends Categoria{
    
    public String chispasDeChocolate;
    public Integer limon;
    public Integer naranja;
    public Integer chocolate;

    public Galleta() {
    }

    public Galleta(String chispasDeChocolate, Integer limon, Integer naranja, Integer chocolate) {
        this.chispasDeChocolate = chispasDeChocolate;
        this.limon = limon;
        this.naranja = naranja;
        this.chocolate = chocolate;
    }

    public String getChispasDeChocolate() {
        return chispasDeChocolate;
    }

    public void setChispasDeChocolate(String chispasDeChocolate) {
        this.chispasDeChocolate = chispasDeChocolate;
    }

    public Integer getLimon() {
        return limon;
    }

    public void setLimon(Integer limon) {
        this.limon = limon;
    }

    public Integer getNaranja() {
        return naranja;
    }

    public void setNaranja(Integer naranja) {
        this.naranja = naranja;
    }

    public Integer getChocolate() {
        return chocolate;
    }

    public void setChocolate(Integer chocolate) {
        this.chocolate = chocolate;
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
        return "Galleta{" + "chispasDeChocolate=" + chispasDeChocolate + ", limon=" + limon + ", naranja=" + naranja + ", chocolate=" + chocolate + '}';
    }
    
    
    
}
