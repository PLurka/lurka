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
public class PlayerSuperHero extends Player {

    public PlayerSuperHero(String name) {
        super(name);
    }

    public PlayerSuperHero() {
    }

    @Override
    public int guess() {
        return 3;
    }
    
    
}
