import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    public static final List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        super.setType("Fire");
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");

        switch (enemy.getType()){
            case "Fire" ->{
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "Grass" ->{
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "Water" ->{
                System.out.println(enemy.getName() +" loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
            case "Electric" ->{
                System.out.println(enemy.getName() +" loses 25hp");
                enemy.setHp(enemy.getHp() - 25);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getType() + " hp left");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroball");
        switch(enemy.getType()){
            case "Fire" ->{
                System.out.println(enemy.getName() + " loes 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Grass"->{
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
            case "Water"->{
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() -35);
            }
            case "Electric"-> {
                System.out.println(enemy.getName() + "loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has" + enemy.getHp() + "hp left");
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with firelash");
        switch(enemy.getType()){
            case "Fire" ->{
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Grass"->{
                System.out.println(enemy.getName() + "loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "Water"->{
                System.out.println(enemy.getName() + "loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "Electric"->{
                System.out.println(enemy.getName() + "loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flamethrower");
        switch (enemy.getType()){
            case "Fire"-> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() -15);
            }
            case "Grass"->{
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() -40);
            }
            case "Water"->{
                System.out.println(enemy.getName() + "loses 30 hp");
                enemy.setHp(enemy.getHp() -30);
            }
           case "Electric"->{
               System.out.println(enemy.getName() + "loses 20 hp");
               enemy.setHp(enemy.getHp() -20);
           }
        }
        System.out.println(enemy.getName()+ " has " + enemy.getHp() + "hp left");
    }

    List<String> getAttacks() {
        return attacks;
    }

}
