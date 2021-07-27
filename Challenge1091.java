/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionlinejudge;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Challenge1091 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int k = scan.nextInt();

        while (k != 0) {
            
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            for (int cont = 0; cont < k; cont++) {

                int cordx = scan.nextInt();
                int cordy = scan.nextInt();

                if (cordx == x || cordy == y) {
                    System.out.println("divisa");

                } else if (cordx > x && cordy > y) {
                    System.out.println("NE");
                } else if (cordx > x && cordy < y) {
                    System.out.println("SE");
                } else if (cordx < x && cordy > y) {
                    System.out.println("NO");
                } else if (cordx < x && cordy < y) {
                    System.out.println("SO");
                }
            }
            k = scan.nextInt();
        }
    }
}
