/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero.aleatório;

import java.util.*;

/**
 *
 * @author Marcos
 */

public class NumeroAleatório {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count;
        
        Random rnum = new Random();
        //Gerar numero entre 0 e 500
        
        System.out.println("Numeros aleatorios :");
        for (count = 0; count<=5;count++) {
            System.out.println(rnum.nextInt(500)); // Gerar numero aleatório
        }
    }
    
}
