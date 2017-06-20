/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg2;

/**
 *
 * @author propa
 */
public class Suma {
    double i;

public void SumaProductos(){
    double suma=0;
    double producto=1;
    for(i=10;i<=90;i++){
    suma=suma+i;
    producto=producto*i;
      
    }   
    System.out.println("Suma dos números do 10 o 90" + suma + "; Productos do 10 o 90 " + producto);
}
    
}
