/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g01.selectiva;

/**
 *
 * @author jairo
 */
public class EstructuraSelectivaIf {
    
    public static void main(String[] arg){
        
        // n  es horas trabajadas
        int n = 40;
        int ne = nHorasExtras(n);
        
        double pagoSem = (n-ne) * 20  + ne*25;
        System.out.println("Total pago sem: " + pagoSem);
        
    }
    
    public static int nHorasExtras(int n){
        if(n>40){
            return n-40;
        }
        else
            return 0;
    }
}
