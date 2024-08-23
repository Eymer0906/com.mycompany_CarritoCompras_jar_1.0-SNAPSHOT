/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carritocompras;

import Clases.ZapatosDeport;

/**
 *
 * @author Jero
 */
public class CarritoCompras {
 
    public static void main(String[] args) {
        // Crear una instancia de ZapatosDeport
        ZapatosDeport zapatosport1 = new ZapatosDeport("su compra es la siguiente nombre "+"colombia1", "la referencia es "+"tenis",10.5, 109500);

        // Imprimir la información del objeto usando el método toString
        System.out.println(zapatosport1.toString());
    }
}
