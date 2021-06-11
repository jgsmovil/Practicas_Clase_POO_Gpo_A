/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author jjggs_000
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Cliente c1 = new Cliente("08-jun-2021","Regular");
        Admin a1= new Admin("Usuario: JGS","Password:abc");
        
        Imprimir impreso = new Imprimir(c1);
        impreso.imprimirObjetoPorImpresora();
    }
    
}
