/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.text.ChoiceFormat;
/**
 *
 * @author ASUS
 */import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Suhu dalam Satuan Celcius : ");
        double c = input.nextDouble();
        
        System.out.println();
        System.out.println("========== Hitung Celcius ke Reamur ==========");
        double hitung1 = 0.8 * c;
        System.out.println(c+" = "+hitung1);
    
        System.out.println();
        System.out.println("========== Hitung Celcius ke Fahrenheit ==========");
        double hitung2 = (1.8 * c) + 32;
        System.out.println(c+" = "+hitung2);
        
        System.out.println();
        System.out.println("========== Hitung Celcius ke Kelvin ==========");
        double hitung3 =  c + 273;
        System.out.println(c+" = "+hitung3);
    }
}
