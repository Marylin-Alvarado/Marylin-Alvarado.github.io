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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();
        Empresa empresa = new Empresa("123", "Tienda de la esquina", "1123001", 12);
        facturacion.setEmpresa(empresa);
        Producto pastel = new Producto("Pastel", 10f, 12);
        facturacion.agregarProducto(pastel, 3); 
        System.out.println(facturacion.getTotal());
    }
    
}
