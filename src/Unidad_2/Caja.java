/*
 
 */
package Unidad_2;

/**
 *
 * @author jjggs_000
 */
public class Caja {
    
    double alto;
    double ancho;
    double largo;
    
  Caja(double a, double b, double c){
      alto=a;
      ancho=b;
      largo=c;
  }   
  Caja(){
     alto=-1;
     ancho=-1;
     largo=-1;
 } 
  Caja(double longitud){
      alto=ancho=largo=longitud;
  } 
    
}
