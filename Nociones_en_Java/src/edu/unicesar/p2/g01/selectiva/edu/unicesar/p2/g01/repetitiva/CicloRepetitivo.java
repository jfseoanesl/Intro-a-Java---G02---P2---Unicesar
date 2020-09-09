/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g01.selectiva.edu.unicesar.p2.g01.repetitiva;

/**
 *
 * @author jairo
 */
public class CicloRepetitivo {
 
    public static void main(String [] arg){
        
        int n=10;
        int sumaPar=0;
        int sumaImpar = 0;
        
        for(int i = 0; i<n; i++){
            
            if(i%2==0){ 
                sumaPar+=i;
            }
            else{
                sumaImpar+=i;
            }
            
        }
        
        System.out.println("Suma Par: " + sumaPar);
        System.out.println("Suma Impar: " + sumaImpar);
        
    }
    
    
}
