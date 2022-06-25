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
public class Categoria {
    
    public Postre postre;
    public Torta torta;
    public Galleta galleta;
    public Bombon bombon;

    public Categoria() {
        
    }

    public Categoria(Postre postre, Torta torta, Galleta galleta, Bombon bombon) {
        this.postre = postre;
        this.torta = torta;
        this.galleta = galleta;
        this.bombon = bombon;
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
        return "Categoria{" + "postre=" + postre + ", torta=" + torta + ", galleta=" + galleta + ", bombon=" + bombon + '}';
    }
    
    
    
}
