package dicegame;


import java.util.Random;
/**
 *
 * @author PLurka
 */
public abstract class Player {
    
    Random rand = new Random();
    
    private String name = "Anonim";
    
    public Player(String name){
        setName(name);
    }
    
    public Player(){        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && /*!name.equals("")*/ !name.isEmpty()){
            this.name = name;
        } else {
//            System.err.println("Imię nieprawidłowe!");
            throw new IllegalArgumentException("Nierpawidłowe imię");
        }
    }
    
    public abstract int guess();
}