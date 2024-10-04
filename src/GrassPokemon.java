import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    public static final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.setType("Grass");
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with leafStorn");
        switch (enemy.getType()) {
            case "Water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "Electric" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "Fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "Grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with solarbeam");
        switch (enemy.getType()) {
            case "Water" -> {
                System.out.println(enemy.getName() + " gaines 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "Electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "Fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "Grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with leechseed");
        switch (enemy.getType()) {
            case "Water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "Fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "Grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with leaveblade");
        switch (enemy.getType()) {
            case "Water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "Fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "Grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    List<String> getAttacks() {
        return attacks;
    }


}
