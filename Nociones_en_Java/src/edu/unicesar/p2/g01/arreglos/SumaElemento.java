/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g01.arreglos;

/**
 *
 * @author jairo
 */
public class SumaElemento {
    
    public static void main(String[] arg){
        int[] a = {4,6,2,5,8,6,3,2,1};
        int suma = sumaElementos(a);
        double prom = suma / a.length;
        
        System.out.println("Suma: " + suma);
        System.out.println("Prom: " + prom);
        
    }
    
    public static int sumaElementos(int[] v){
        int suma=0;
        for(int i=0; i<v.length;i++){
            suma+= v[i];
        }
        return suma;
    }
}
