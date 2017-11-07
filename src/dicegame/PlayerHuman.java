/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Scanner;

/**
 *
 * @author PLurka
 */
public class PlayerHuman extends Player{
    
    final Scanner czyt = new Scanner(System.in);
    
    public PlayerHuman(String name){
        super(name);
    }
    
    public PlayerHuman(){        
    }
    
    @Override
    public int guess(){
        System.out.println("Zgadnij liczbę od 1 do 6");
        return czyt.nextInt();
    }
}
