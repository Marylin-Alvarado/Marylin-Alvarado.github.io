/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario iTC
 */
public class ModelTableProducto {
    
     private List<Productos> productoList;
    
     public ModelTableProducto() {
        productoList = new LinkedList<>();
        addColumn("BOMBONES");
        addColumn("TORTAS");
        addColumn("POSTRES");
        addColumn("GALLETAS");
       
        
        addRow(new String[]{"Bombon de Frambuesa", "Torta De Fresa", "Tiramisu", "Galleta De Coco"});
    }
    
    public void agregarProducto(Productos producto){
        productoList.add(producto);
        addRow(new Object[]{
            //producto.getBombon(),
            //producto.getTortas(),
            //producto.getPostres(),
            //producto.getGalletas()
        });
    }

    private void addRow(Object[] object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void addColumn(String galletas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
