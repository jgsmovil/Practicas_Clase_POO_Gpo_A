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
public class Prestamo implements Autor,Libro,Editorial{
    public void titulo(){
        System.out.println("Cien años de soledad");
    }
    public void nombre(){
        System.out.println("Gabriel Garcia Marquez");
    }
}
