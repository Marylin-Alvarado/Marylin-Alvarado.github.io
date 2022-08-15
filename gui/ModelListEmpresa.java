/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.DefaultListModel;
import model.Empresa;


/**
 *
 * @author edisoncor
 */
public class ModelListEmpresa extends DefaultListModel<Empresa>{

    public ModelListEmpresa() {
        
        
        Empresa e1 = new Empresa("123", "DULCE CAPRICHO", "11023232");
      
    
        addElement(e1);
     
    }
    
    public void agregarEmpresa(Empresa empresa){
        addElement(empresa);
    }
    
    
    
}
