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
public class Postre extends Categoria{
    
    public String tartaChocolate;
    public String tiramisu;
    public String buñelos;
    public String milhojas;
    public String crepe;
    public String mousse;
    public String alfajores;
    public String tresLeches;
    public Integer cantidad;

    public Postre() {
    }

    public Postre(String tartaChocolate, String tiramisu, String buñelos, String milhojas, String crepe, String mousse, String alfajores, String tresLeches) {
        this.tartaChocolate = tartaChocolate;
        this.tiramisu = tiramisu;
        this.buñelos = buñelos;
        this.milhojas = milhojas;
        this.crepe = crepe;
        this.mousse = mousse;
        this.alfajores = alfajores;
        this.tresLeches = tresLeches;
    }

    public Postre(Integer cantidad) {
        this.cantidad = cantidad;
    }
    

    public String getTartaChocolate() {
        return tartaChocolate;
    }

    public void setTartaChocolate(String tartaChocolate) {
        this.tartaChocolate = tartaChocolate;
    }

    public String getTiramisu() {
        return tiramisu;
    }

    public void setTiramisu(String tiramisu) {
        this.tiramisu = tiramisu;
    }

    public String getBuñelos() {
        return buñelos;
    }

    public void setBuñelos(String buñelos) {
        this.buñelos = buñelos;
    }

    public String getMilhojas() {
        return milhojas;
    }

    public void setMilhojas(String milhojas) {
        this.milhojas = milhojas;
    }

    public String getCrepe() {
        return crepe;
    }

    public void setCrepe(String crepe) {
        this.crepe = crepe;
    }

    public String getMousse() {
        return mousse;
    }

    public void setMousse(String mousse) {
        this.mousse = mousse;
    }

    public String getAlfajores() {
        return alfajores;
    }

    public void setAlfajores(String alfajores) {
        this.alfajores = alfajores;
    }

    public String getTresLeches() {
        return tresLeches;
    }

    public void setTresLeches(String tresLeches) {
        this.tresLeches = tresLeches;
    }

    public Postre getPostre() {
        return postre;
    }

    public void setPostre(Postre postre) {
        this.postre = postre;
    }

    /**
     *
     * @return
     */
    public Torta getTorta() {
        return torta;
    }

    public void setTorta(Torta torta) {
        this.torta = torta;
    }

    public Galleta getGalleta() {
        return galleta;
    }

    /**
     *
     * @param galleta
     */
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
        return "Postre{" + "tartaChocolate=" + tartaChocolate + ", tiramisu=" + tiramisu + ", bu\u00f1elos=" + buñelos + ", milhojas=" + milhojas + ", crepe=" + crepe + ", mousse=" + mousse + ", alfajores=" + alfajores + ", tresLeches=" + tresLeches + '}';
    }
    
    
    
    
    
    
    
}
