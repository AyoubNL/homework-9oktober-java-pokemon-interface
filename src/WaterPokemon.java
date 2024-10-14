import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    public static final List<String> attacks = Arrays.asList("surf","hydroPump","hydroCanon","rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
        super.setType("Water");
    }

    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName()+" with surf" );

        double damage = damage(enemy, 10);
        enemy.setHp(enemy.getHp() - (int)damage);

        System.out.println(enemy.getName() + " loses " +(int)damage+ "hp and has " + enemy.getHp() + "hp left");

    }

    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName()+" with hydropump" );

        double damage = damage(enemy, 15);
        enemy.setHp(enemy.getHp() - (int)damage);

        System.out.println(enemy.getName() + " loses " +(int)damage+ "hp and has " + enemy.getHp() + "hp left");
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName()+" with hydrocanon" );

        double damage = damage(enemy, 20);
        enemy.setHp(enemy.getHp() - (int)damage);

        System.out.println(enemy.getName() + " loses " +(int)damage+ "hp and has " + enemy.getHp() + "hp left");
    }

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName()+" with raindance" );
        double damage = damage(enemy, 11);
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

    List<String> getAttacks(){
        return attacks;
    }

}
//        switch (enemy.getType()) {
//        case "Water" -> {
//        System.out.println(enemy.getName() + " gains 20 hp");
//        enemy.setHp(enemy.getHp() + 20);
//        }
//        case "Fire" -> {
//        System.out.println(enemy.getName() + " loses 5 hp");
//        enemy.setHp(enemy.getHp() - 5);
//        }
//        case "Electric" -> System.out.println("has no effect on " + enemy.getName());
//        case "Grass" -> {
//        System.out.println(enemy.getName() + " gains 10 hp");
//        enemy.setHp(enemy.getHp() + 10);
//        }
//        }

//        switch (enemy.getType()) {
//        case "Grass" -> {
//        System.out.println(enemy.getName() + " loses 20 hp");
//        enemy.setHp(enemy.getHp() - 20);
//        }
//        case "Fire" -> {
//        System.out.println(enemy.getName() + " loses 50 hp");
//        enemy.setHp(enemy.getHp() - 50);
//        }
//        case "Electric" -> {
//        System.out.println(enemy.getName() + " loses 30 hp");
//        enemy.setHp(enemy.getHp() - 30);
//        }
//        case "Water" -> {
//        System.out.println(enemy.getName() + " loses 15 hp");
//        enemy.setHp(enemy.getHp() - 15);
//        }
//        }

//   switch (enemy.getType()) {
//        case "Grass" -> {
//        System.out.println(enemy.getName() + " loses 20 hp");
//        enemy.setHp(enemy.getHp() - 20);
//        }
//        case "Fire" -> {
//        System.out.println(enemy.getName() + " loses 45 hp");
//        enemy.setHp(enemy.getHp() - 45);
//        }
//        case "Electric" -> {
//        System.out.println(enemy.getName() + " loses 30 hp");
//        enemy.setHp(enemy.getHp() - 30);
//        }
//        case "Water" -> {
//        System.out.println(enemy.getName() + " loses 10 hp");
//        enemy.setHp(enemy.getHp() - 10);
//        }
//        }

//       switch (enemy.getType()){
//        case "Grass"->{
//        System.out.println(enemy.getName() + " loses 20 hp");
//        enemy.setHp(enemy.getHp() -20);
//        }
//        case "Fire"->{
//        System.out.println(enemy.getName() + " loses 40 hp");
//        enemy.setHp(enemy.getHp() -40);
//        }
//        case "Electric"->{
//        System.out.println(enemy.getName() + " loses 30 hp");
//        enemy.setHp(enemy.getHp() -30);
//        }
//        case "Water"->{
//        System.out.println(enemy.getName() + " loses 10 hp");
//        enemy.setHp(enemy.getHp() - 10);
//        }
//        }