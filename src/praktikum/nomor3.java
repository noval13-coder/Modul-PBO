/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author ASUS
 */
public class nomor3 {
   public static void main(String[] args) {
    int n = 5;
    for(int p = 0; p < n ; p++){
        for(int q = 0; q < n ; q++){
            if(p == 0 || p == n - 1 || q == n - 1 - p){
                System.out.print("@");
            }else{
                System.out.print(" ");
            }
        }
         System.out.println(" ");
    }
       
    }
    
}  

