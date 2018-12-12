package characters;

import items.item;

import java.util.ArrayList;

public class enemy extends character {
    public enemy(int hp, int baseDmg, String name, ArrayList<item> inv) {
        super(hp, baseDmg, name, inv);
    }
    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
    public void enemyStatus(){
        System.out.println("You see " + getName() +" with " +getHp() +"hp");
        if(isBetween(getBaseDmg(),1,10)){
            System.out.println("It doesnt look dangerous");
        } else if(isBetween(getBaseDmg(),11,30)){
            System.out.println("It looks dangerous");
        }
    }
}
