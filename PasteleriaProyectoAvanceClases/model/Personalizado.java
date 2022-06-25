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
public class Personalizado extends Torta{
    
    public String saborBiscocho;
    public Integer porcion;
    public String relleno;
    public String decoracion;

    public Personalizado() {
    }

    public Personalizado(String saborBiscocho, Integer porcion, String relleno, String decoracion) {
        this.saborBiscocho = saborBiscocho;
        this.porcion = porcion;
        this.relleno = relleno;
        this.decoracion = decoracion;
    }

    public String getSaborBiscocho() {
        return saborBiscocho;
    }

    public void setSaborBiscocho(String saborBiscocho) {
        this.saborBiscocho = saborBiscocho;
    }

    public Integer getPorcion() {
        return porcion;
    }

    public void setPorcion(Integer porcion) {
        this.porcion = porcion;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
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

    /**
     *
     * @param postre
     */
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
        return "Personalizado{" + "saborBiscocho=" + saborBiscocho + ", porcion=" + porcion + ", relleno=" + relleno + ", decoracion=" + decoracion + '}';
    }
    
    
    
}
