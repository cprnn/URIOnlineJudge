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
public class Challenge1192 {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int i;
    int op;
    
        i = scan.nextInt();
        
        for(int cont = 0; cont < i; cont++){    
            String read = scan.next();
            
            char[] var = read.toCharArray();
            int aux1 = Character.getNumericValue(var[0]);
            int aux2 = Character.getNumericValue(var[2]);
            
            if(aux1 == aux2){
                op = aux1 * aux2;
                System.out.println(op);
            }else if(Character.isUpperCase(var[1])){
                op = aux2 - aux1;
                System.out.println(op);
            }else{
                op = aux1 + aux2;
                System.out.println(op);
            }
        }
    }
}
