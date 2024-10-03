import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    public static final List<String> attacks = Arrays.asList("thunderPunch","electroBall","thunder","voltTackle");


    public ElectricPokemon(String name, int level, int hp, String food, String sound, String type){
        super(name, level, hp, food, sound, type);
        super.setType("Electric");
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName()+" with thunderpunch");
    }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName()+" with electroball" );
    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName()+" with thunder" );
    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName()+" with volttackle" );
    }

    List<String> getAttacks(){
        return attacks;
    }



}
