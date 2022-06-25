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
public class Horario {
    
    public Double lunes;
    public Double martes;
    public Double miercoles;
    public Double jueves;
    public Double viernes;
    public Double sabado;
    public Double domingo;

    public Horario() {
    }

    public Horario(Double lunes, Double martes, Double miercoles, Double jueves, Double viernes, Double sabado, Double domingo) {
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
    }

    public Double getLunes() {
        return lunes;
    }

    public void setLunes(Double lunes) {
        this.lunes = lunes;
    }

    public Double getMartes() {
        return martes;
    }

    public void setMartes(Double martes) {
        this.martes = martes;
    }

    public Double getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(Double miercoles) {
        this.miercoles = miercoles;
    }

    public Double getJueves() {
        return jueves;
    }

    public void setJueves(Double jueves) {
        this.jueves = jueves;
    }

    public Double getViernes() {
        return viernes;
    }

    public void setViernes(Double viernes) {
        this.viernes = viernes;
    }

    public Double getSabado() {
        return sabado;
    }

    public void setSabado(Double sabado) {
        this.sabado = sabado;
    }

    public Double getDomingo() {
        return domingo;
    }

    public void setDomingo(Double domingo) {
        this.domingo = domingo;
    }

    @Override
    public String toString() {
        return "Horario{" + "lunes=" + lunes + ", martes=" + martes + ", miercoles=" + miercoles + ", jueves=" + jueves + ", viernes=" + viernes + ", sabado=" + sabado + ", domingo=" + domingo + '}';
    }
    
    
    
}
