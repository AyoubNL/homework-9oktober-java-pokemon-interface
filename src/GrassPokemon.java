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

        double damage = damage(enemy, 5);
        enemy.setHp(enemy.getHp() - (int) damage);

        System.out.println(enemy.getName() + " loses " +(int)damage+ "hp and has " + enemy.getHp() + "hp left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with solarbeam");

        double damage = damage(enemy, 25);
        enemy.setHp(enemy.getHp() - (int)damage);

        System.out.println(enemy.getName() + " loses " +(int)damage+ "hp and has " + enemy.getHp() + "hp left");

    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with leechseed");

        double damage = damage(enemy, 15);
        enemy.setHp(enemy.getHp() - (int)damage);

        System.out.println(enemy.getName() + " loses " +(int)damage+ "hp and has " + enemy.getHp() + "hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with leaveblade");

        double damage = damage(enemy, 13);
        enemy.setHp(enemy.getHp() - (int)damage);

        System.out.println(enemy.getName() + " loses " +(int)damage+ "hp and has " + enemy.getHp() + "hp left");
    }

    private double damage(Pokemon enemy, int damage) {
        double multiplier = switch (enemy.getType().toLowerCase()) {
            case "electric" -> 1.5;
            case "grass" -> 0.5;
            case "water" -> 2.0;
            case "fire" -> 1.1;
            default -> 1.0;

        };
        return multiplier * damage;
    }
    List<String> getAttacks() {
        return attacks;
    }
}

//      switch (enemy.getType()) {
//        case "Water" -> {
//        System.out.println(enemy.getName() + " loses 10 hp");
//        enemy.setHp(enemy.getHp() - 10);
//        }
//        case "Electric" -> {
//        System.out.println(enemy.getName() + " loses 50 hp");
//        enemy.setHp(enemy.getHp() - 50);
//        }
//        case "Fire" -> {
//        System.out.println(enemy.getName() + " loses 20 hp");
//        enemy.setHp(enemy.getHp() - 20);
//        }
//        case "Grass" -> {
//        System.out.println(enemy.getName() + " loses 5 hp");
//        enemy.setHp(enemy.getHp() - 5);
//        }
//        }
//
//        switch (enemy.getType()) {
//        case "Water" -> {
//        System.out.println(enemy.getName() + " loses 20 hp");
//        enemy.setHp(enemy.getHp() - 20);
//        }
//        case "Electric" -> {
//        System.out.println(enemy.getName() + " loses 40 hp");
//        enemy.setHp(enemy.getHp() - 40);
//        }
//        case "Fire" -> {
//        System.out.println(enemy.getName() + " loses 30 hp");
//        enemy.setHp(enemy.getHp() - 30);
//        }
//        case "Grass" -> {
//        System.out.println(enemy.getName() + " loses 10 hp");
//        enemy.setHp(enemy.getHp() - 10);
//        }
//        }


//        switch (enemy.getType()) {
//        case "Water" -> {
//        System.out.println(enemy.getName() + " gaines 20 hp");
//        enemy.setHp(enemy.getHp() - 20);
//        }
//        case "Electric" -> {
//        System.out.println(enemy.getName() + " loses 50 hp");
//        enemy.setHp(enemy.getHp() - 40);
//        }
//        case "Fire" -> {
//        System.out.println(enemy.getName() + " loses 30 hp");
//        enemy.setHp(enemy.getHp() - 30);
//        }
//        case "Grass" -> {
//        System.out.println(enemy.getName() + " loses 5 hp");
//        enemy.setHp(enemy.getHp() - 5);
//        }
//        }

//        switch (enemy.getType()) {
//        case "Water" -> {
//        System.out.println(enemy.getName() + " loses 10 hp");
//        enemy.setHp(enemy.getHp() - 10);
//        }
//        case "Electric" -> {
//        System.out.println(enemy.getName() + " loses 50 hp");
//        enemy.setHp(enemy.getHp() - 50);
//        }
//        case "Fire" -> {
//        System.out.println(enemy.getName() + " loses 20 hp");
//        enemy.setHp(enemy.getHp() - 20);
//        }
//        case "Grass" -> {
//        System.out.println(enemy.getName() + " loses 5 hp");
//        enemy.setHp(enemy.getHp() - 5);
//        }
//        }