/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile.and.pkgdo.pkgwhile;

/**
 *
 * @author Edson Coj
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x=10;
        int factorial=1;
        while(x>1)
            {
           factorial= factorial* x;
           x--;
            }
        System.out.println("valor de x : " + factorial);
            
            
    }
    
}
