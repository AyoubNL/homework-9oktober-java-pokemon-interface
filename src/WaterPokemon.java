import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    public static final List<String> attacks = Arrays.asList("surf","hydroPump","hydroCanon","rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound, String type){
        super(name, level, hp, food, sound, type);
        super.setType("Water");
    }

    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName()+" with surf" );
    }

    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName()+" with hydropump" );
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName()+" with hydrocanon" );
    }

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName()+" with raindance" );
    }

    List<String> getAttacks(){
        return attacks;
    }



}
