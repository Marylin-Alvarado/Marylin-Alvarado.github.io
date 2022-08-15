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
public class Torta extends Categoria{
    
    public String chocolate;
    public String vainilla;
    public String manjar;
    public String fresa;
    public String zanahoria;
    public String banana;
    public Personalizado personalizado;
    public Integer cantidad;

    public Torta() {
    }

    public Torta( String chocolate, String vainilla, String manjar, String fresa, String zanahoria, String banana, Personalizado personalizado) {
        this.chocolate = chocolate;
        this.vainilla = vainilla;
        this.manjar = manjar;
        this.fresa = fresa;
        this.zanahoria = zanahoria;
        this.banana = banana;
        this.personalizado = personalizado;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public String getVainilla() {
        return vainilla;
    }

    public void setVainilla(String vainilla) {
        this.vainilla = vainilla;
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

    public String getZanahoria() {
        return zanahoria;
    }

    public void setZanahoria(String zanahoria) {
        this.zanahoria = zanahoria;
    }

    public String getBanana() {
        return banana;
    }

    public void setBanana(String banana) {
        this.banana = banana;
    }

    public Personalizado getPersonalizado() {
        return personalizado;
    }

    public void setPersonalizado(Personalizado personalizado) {
        this.personalizado = personalizado;
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
        return "Torta{" + "chocolate=" + chocolate + ", vainilla=" + vainilla + ", manjar=" + manjar + ", fresa=" + fresa + ", zanahoria=" + zanahoria + ", banana=" + banana + ", personalizado=" + personalizado + '}';
    }
    
    
    
}
