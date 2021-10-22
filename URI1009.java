/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1006;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class URI1009 {
    public static void main(String[] args) {
        
        String funcionario;
        double salario, bonus, total;
        
        Scanner input = new Scanner(System.in);
        
        funcionario = input.nextLine();
        salario = input.nextDouble();
        bonus = input.nextDouble();
        
        total = (salario+(bonus*0.15));
        
        System.out.println("TOTAL = R$ %.2f"+total);    
        
        
    }
}
