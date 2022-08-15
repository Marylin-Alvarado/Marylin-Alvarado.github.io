/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.DefaultListModel;
import model.Cliente;
import model.Empresa;


/**
 *
 * @author edisoncor
 */
public class ModelListFactura extends DefaultListModel<Facturacion>{

    public ModelListFactura() {
    }

    public ModelListFactura(Empresa empresa) { 
        for (Facturacion facturacion: empresa.getFacturacionList()){
        addElement(facturacion);
        }
    }

    
    
    
    
}
