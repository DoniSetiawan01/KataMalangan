/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class KataAnakMalang {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

           
        System.out.print("Masukkan Sebuah Kata : ");
        String masukan = input.nextLine();
        char[] kata = masukan.toCharArray();
        
        
            for (int x = kata.length - 1; x >= 0; x--){
                if(kata[x] == 'n' && kata[x + 1] == 'g'){
                    System.out.print(kata[x + 1]);
                } else if(kata[x] == 'g' && kata[x - 1] == 'n'){
                    System.out.print(kata[x - 1]);
                } else if(kata[x] == 'n' && kata[x + 1] == 'y'){
                    System.out.print(kata[x + 1]);
                } else if(kata[x] == 'y' && kata[x - 1] == 'n'){
                    System.out.print(kata[x - 1]);
                } else {
                    System.out.print(kata[x]);
                }
            }
        }
}