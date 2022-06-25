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
    
    public Integer tartaChocolate;
    public Integer tiramisu;
    public Integer buñelos;
    public Integer milhojas;
    public Integer crepe;
    public Integer mousse;
    public Integer alfajores;
    public Integer tresLeches;

    public Postre() {
    }

    public Postre(Integer tartaChocolate, Integer tiramisu, Integer buñelos, Integer milhojas, Integer crepe, Integer mousse, Integer alfajores, Integer tresLeches) {
        this.tartaChocolate = tartaChocolate;
        this.tiramisu = tiramisu;
        this.buñelos = buñelos;
        this.milhojas = milhojas;
        this.crepe = crepe;
        this.mousse = mousse;
        this.alfajores = alfajores;
        this.tresLeches = tresLeches;
    }

    public Integer getTartaChocolate() {
        return tartaChocolate;
    }

    public void setTartaChocolate(Integer tartaChocolate) {
        this.tartaChocolate = tartaChocolate;
    }

    public Integer getTiramisu() {
        return tiramisu;
    }

    public void setTiramisu(Integer tiramisu) {
        this.tiramisu = tiramisu;
    }

    public Integer getBuñelos() {
        return buñelos;
    }

    public void setBuñelos(Integer buñelos) {
        this.buñelos = buñelos;
    }

    public Integer getMilhojas() {
        return milhojas;
    }

    public void setMilhojas(Integer milhojas) {
        this.milhojas = milhojas;
    }

    public Integer getCrepe() {
        return crepe;
    }

    public void setCrepe(Integer crepe) {
        this.crepe = crepe;
    }

    public Integer getMousse() {
        return mousse;
    }

    public void setMousse(Integer mousse) {
        this.mousse = mousse;
    }

    public Integer getAlfajores() {
        return alfajores;
    }

    public void setAlfajores(Integer alfajores) {
        this.alfajores = alfajores;
    }

    public Integer getTresLeches() {
        return tresLeches;
    }

    public void setTresLeches(Integer tresLeches) {
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
