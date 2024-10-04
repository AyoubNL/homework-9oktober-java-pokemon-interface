import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    public static final List<String> attacks = Arrays.asList("thunderPunch","electroBall","thunder","voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
        super.setType("Electric");
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName()+" with thunderpunch");
        switch (enemy.getType()){
            case "Grass"-> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "Water"->{
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() -40);
            }
            case "Fire"->{
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "Electric"->{
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
    }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName()+" with electroball" );
        switch (enemy.getType()) {
            case "Fire" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "Water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "Grass" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "Electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName()+" with thunder" );
        switch (enemy.getType()) {
            case "Fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "Water" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "Grass" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "Electric" -> {
                System.out.println(enemy.getName() + " gaines 10 hp");
                enemy.setHp(enemy.getHp() + 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName()+" with volttackle" );
        switch (enemy.getType()) {
            case "Fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "Water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "Grass" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "Electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    List<String> getAttacks(){
        return attacks;
    }



}
