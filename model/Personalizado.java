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

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate( String  chocolate) {
        this.chocolate = chocolate;
    }

    public String  getVainilla() {
        return vainilla;
    }

    public void setVainilla(String  vainilla) {
        this.vainilla = vainilla;
    }

    public String  getManjar() {
        return manjar;
    }

    public void setManjar(String  manjar) {
        this.manjar = manjar;
    }

    public String  getFresa() {
        return fresa;
    }

    public void setFresa(String  fresa) {
        this.fresa = fresa;
    }

    public String  getZanahoria() {
        return zanahoria;
    }

    public void setZanahoria(String zanahoria) {
        this.zanahoria = zanahoria;
    }

    public String  getBanana() {
        return banana;
    }

    public void setBanana(String  banana) {
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
