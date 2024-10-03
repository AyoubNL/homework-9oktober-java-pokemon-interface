import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    public static final List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound, String type) {
        super(name, level, hp, food, sound, type);
        super.setType("Fire");
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with inferno");

        if (enemy.getType().equals("water")) {
            System.out.println("You are a water Pokemon");
        } else {
            System.out.println("You are not a water pokemon");
        }

//        een system.out.println die vertelt wie wie aanvalt met welke aanval (concatenation met variabelen, b.v.: "Bulbasaur attacks Charizard with leafStorm");
//        een beslissingsstructuur die kijkt welk type de vijand heeft;
//        aan de hand van de beslissingsstructuur moet de vijand hp punten verliezen (per type verschilt het aantal punten);
//        een system.out.println die aangeeft wat de aanval voor effect heeft (concatenation met variabelen, b.v.: "Charizard loses 15 hp");
//        vergeet de hp van de vijand niet te verlagen;
//        sluit de methode af met een system.out.println die de resteren hp waarde weergeeft van de vijand

    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with pyroball");
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with firelash");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with flamethrower");
    }

    List<String> getAttacks() {
        return attacks;
    }

}
