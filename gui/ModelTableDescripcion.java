/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Descripcion;

/**
 *
 * @author edisoncor
 */
public class ModelTableDescripcion extends DefaultTableModel{

    private List<Descripcion> descricionList;
    
    public ModelTableDescripcion() {
        descricionList = new LinkedList<>();
        addColumn("CODIGO");
        addColumn("DESCRIPCIÓN");
        addColumn("P.V.P.");
        addColumn("CANTIDAD");
        addColumn("SUBTOTAL");
        
        addRow(new String[]{"AR005", "GalletasDeCoco", "2,00$", "2", "4,00$"});
    }
    
    public void agregarDescripcion(Descripcion descripcion){
        descricionList.add(descripcion);
        addRow(new Object[]{
            descripcion.getCantidad(),
            descripcion.getProducto(),
            descripcion.getPrecioUnitario(),
            descripcion.getValorTotal()
        });
    }
    
    
    
}
