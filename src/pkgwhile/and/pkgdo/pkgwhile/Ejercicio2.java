/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile.and.pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Edson Coj
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num=0;
        int suma=1;
        Scanner n=new Scanner (System.in);
        System.out.println("Ingrese un numero");
        num=n.nextInt();
        while(num>1)
            {
           suma= suma + num;
           num--;
            }
        System.out.println("valor del numero es : " + suma);
            
    }
    
}
