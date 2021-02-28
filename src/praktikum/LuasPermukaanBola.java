/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author ASUS
 */import java.util.Scanner;
public class LuasPermukaanBola {
    public static void main(String[] args) {   
    Scanner input = new Scanner (System.in);
    
        System.out.print("Masukkan panjang jari-jari  : ");
    int r = input.nextInt();
    double hitung = 4*3.14*(r*r);
        System.out.println("Hasil Luas Permukaan Bola : "+hitung);
    
 }   
}
