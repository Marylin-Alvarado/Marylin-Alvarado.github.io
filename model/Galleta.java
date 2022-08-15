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
    public String limon;
    public String naranja;
    public String chocolate;
    public String cantidad;
    

    public Galleta() {
    }

    public Galleta(String chispasDeChocolate, String limon, String naranja, String chocolate) {
        this.chispasDeChocolate = chispasDeChocolate;
        this.limon = limon;
        this.naranja = naranja;
        this.chocolate = chocolate;
    }

    public Galleta(String cantidad) {
        this.cantidad = cantidad;
    }
    

    public String getChispasDeChocolate() {
        return chispasDeChocolate;
    }

    public void setChispasDeChocolate(String chispasDeChocolate) {
        this.chispasDeChocolate = chispasDeChocolate;
    }

    public String getLimon() {
        return limon;
    }

    public void setLimon(String limon) {
        this.limon = limon;
    }

    public String getNaranja() {
        return naranja;
    }

    public void setNaranja(String naranja) {
        this.naranja = naranja;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
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
