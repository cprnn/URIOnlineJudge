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
public class URI1013 {
    public static void main(String[] args) {
        
        int maiorA, maiorC, a, b, c, abs;
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        maiorA = (a+b+Math.abs(a-b))/2;
        maiorC = (maiorA+c+Math.abs(maiorA-c))/2;
        
        System.out.println(maiorC+" eh o maior");
        
    }
}
