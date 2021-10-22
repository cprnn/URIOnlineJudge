/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1006;

import java.util.Scanner;
import java.lang.Math.*;

/**
 *
 * @author carol
 */
public class URI1006 {

    //Programa calcula a média de 3 
    
    public static void main(String[] args) {
        
    double raio, area;
        
        Scanner input = new Scanner(System.in);
        
        
        raio = input.nextFloat();
        
        area = Math.PI * Math.pow(raio, 2);
        
        System.out.printf("A área do círculo equivale a:", area);

    }
}
