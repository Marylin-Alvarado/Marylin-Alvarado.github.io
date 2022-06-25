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
    
    public Integer chocolate;
    public Integer vainilla;
    public Integer manjar;
    public Integer fresa;
    public Integer zanahoria;
    public Integer banana;
    public Personalizado personalizado;

    public Torta() {
    }

    public Torta(Integer chocolate, Integer vainilla, Integer manjar, Integer fresa, Integer zanahoria, Integer banana, Personalizado personalizado) {
        this.chocolate = chocolate;
        this.vainilla = vainilla;
        this.manjar = manjar;
        this.fresa = fresa;
        this.zanahoria = zanahoria;
        this.banana = banana;
        this.personalizado = personalizado;
    }

    public Integer getChocolate() {
        return chocolate;
    }

    public void setChocolate(Integer chocolate) {
        this.chocolate = chocolate;
    }

    public Integer getVainilla() {
        return vainilla;
    }

    public void setVainilla(Integer vainilla) {
        this.vainilla = vainilla;
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

    public Integer getZanahoria() {
        return zanahoria;
    }

    public void setZanahoria(Integer zanahoria) {
        this.zanahoria = zanahoria;
    }

    public Integer getBanana() {
        return banana;
    }

    public void setBanana(Integer banana) {
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
