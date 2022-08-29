/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.recap.teste;
 
import br.com.recap.model.Venda;

/**
 *
 * @author User
 */
public class ProdutoTeste {

    
       public static void main(String[] args) {
         demonstraVenda();
    }
       
    private static void demonstraVenda(){
        Venda venda = new Venda();
       venda.setNome("Suco");
        System.out.println("O nome do produto é:" + venda.getNome());
    }
    
}
