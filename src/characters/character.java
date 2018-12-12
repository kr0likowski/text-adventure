package characters;

import items.item;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class character {
    private int hp;
    private int baseDmg;

    public int getHp() {
        return hp;
    }

    public int getBaseDmg() {
        return baseDmg;
    }

    public String getName() {
        return name;
    }
    public void decreaseHP(int a){
        hp-=a;
    }

    public ArrayList<item> getInventory() {
        return inv;
    }

    private String name;
    public ArrayList<item> inv;
    public character(int hp, int baseDmg, String name, ArrayList<item> inv){
        this.hp = hp;
        this.baseDmg = baseDmg;
        this.name = name;
        this.inv=inv;
    }
}
