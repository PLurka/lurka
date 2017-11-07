/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Random;
 
 /**
  * Pierwsza wersja gry w odgadywanie wylosowanej liczby.
  * Zasady:
  * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
  * - gracz (też komputer) stara się odgadnąć liczbę (też losuje)
  * - jeżeli odgadnie, gra się kończy
  * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
  */



 public class DiceGame {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
         
         Player player = new Player();   //obiekt gracz
         
         try {
            player.setName(null);
            
         } catch (IllegalArgumentException ex) {
             System.err.println("BŁĄD! " + ex.getMessage());
         }
         
         Random dice = new Random();     //obiekt losujący (kostka)
         int number,                     //wylosowana liczba
             guess;                      //propozycja (strzał) gracza
         
         do {
             number = dice.nextInt(6) + 1;
             System.out.println("Wylosowane (number): " + number);
 
             guess = player.guess();
             System.out.println("Strzał gracza " + player.getName() + ": " + guess);
 
             if (number == guess) {
                 System.out.println("BRAWO!");
             } else {
                 System.out.println("PUDŁO!");
             }
             
             System.out.println("---------------------------------------------");
         
         } while (number != guess);
     }
 }