/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

/**
 *
 * @author Praktikan
 */
public class Faktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a = 10; int b = 5; for(int i = 0; i < 10; i++) { 
             for(int c = 10; c > i; c--) { 
                System.out.print(" "); } 
             for(int d = 0; d < i; d++) { 
                System.out.print(" *"); } 
                System.out.println(""); } 
             for(int j = 0; j < 10; j++) { 
                 for(int c = 0; c < j; c++) { 
                     System.out.print(" "); } 
                 for(int d = 10; d > j; d--) { 
                     System.out.print(" *"); } 
         System.out.println(""); }

    }
    
}
