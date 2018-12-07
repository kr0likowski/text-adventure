package characters;

import items.item;

import java.util.ArrayList;

public class player extends character {
    public player(int hp, int baseDmg, String name, ArrayList<item> inv) {
        super(hp, baseDmg, name, inv);
    }
    public void playerStatus(){
        System.out.println(this.getHp());
    }
    public void addItem(item newItem)
    {
        inv.add(newItem);
    }

}
