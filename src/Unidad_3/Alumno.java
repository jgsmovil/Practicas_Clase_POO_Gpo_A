/*
 Sub clase
 */
package Unidad_3;

import javax.swing.JOptionPane;

/**
 *
 * @author jjggs_000
 */
public class Alumno extends Persona{
    double sueldo;
    String telefono,direcion;
    
    public Alumno(String nom,int ed,double suel,String tel){
        super(nom,ed);
        
        this.sueldo=suel;
        this.telefono=tel;
    }
    
    @Override
    public void verDatos(){
        JOptionPane.showMessageDialog(null,"Nombre;"+ nombre+ "\nEdad"+edad,"Tel: "+tel+"DATOS DEL EMPLEADO",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
}
