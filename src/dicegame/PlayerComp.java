/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

/**
 *
 * @author PLurka
 */
public class PlayerComp extends Player{

    public PlayerComp(String name) {
        super(name);
    }

    public PlayerComp() {
    }
    
    @Override
    public int guess(){
        return rand.nextInt(6)+1;
    }
}
