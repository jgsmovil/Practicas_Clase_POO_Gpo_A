/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_3;

/**
 *
 * @author jjggs_000
 */
public class s {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos dos objetos distintos
        Empleado empleado1=new Empleado("Fernando", "Ureña", 23, 600);
        Empleado empleado2=new Empleado("Antonio", "Lopez", 28, 900);
        Empleado empleado3=new Empleado("Alvaro", "Perez", 19, 800);
 
        //Mostramos la informacion del objeto
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
    }
    }
    
}
