import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    public static final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound, String type) {
        super(name, level, hp, food, sound, type);
        super.setType("Grass");
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with leafStorn");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with solarbeam");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with leechseed");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with leaveblade");
    }

    List<String> getAttacks() {
        return attacks;
    }


}
