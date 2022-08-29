/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.recap.model;

/**
 *
 * @author User
 */
public class Venda {
    
    private static int[] arrayNumerico;
    
    public static void main(String[] args) {
        //demonstraArray();
    }    
    
    
    
    
    public void demonstraArray(){
        arrayNumerico = new int[5];
        arrayNumerico[0] = 25;
        arrayNumerico[1] = 40;
        arrayNumerico[2] = 65;
        arrayNumerico[3] = 98;
        arrayNumerico[4] = 100;
        
        for (int i = 0; i < arrayNumerico.length; i++){
            System.out.println(arrayNumerico[i]);
            
        }
        
    }
    
    
    
}
