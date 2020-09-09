/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g01.tipoprimitivos;

/**
 *
 * @author jairo
 */
public class TipoDeDato {
    
    public static void main(String[] arg){
        
        // definicio  de tipo entero
        int i = 5;
        Integer x = new Integer(5);
        
        // valores maximos y minimos de enteros y otros tipos
        System.out.println("Max Value enteros: " + Integer.MAX_VALUE );
        System.out.println("Min Value enteros: " + Integer.MIN_VALUE );
        
        String a = "12345";
        String b = "54321";
        
        System.out.println("sum: " + sumaVal(a,b));
        System.out.println("div: " + divide(5,2));
    }
    
    public static int sumaVal(String a, String b){
        int ea = Integer.valueOf(a);
        int eb = Integer.parseInt(b);
        
        return ea+eb;
    }
    
    public static double divide(int a, int b){
        double da = (double)a;
        //double db = (double)b;
        return da/b;
    }
}
